package com.example.demo.errorhandling.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class IndexController {

    @GetMapping(value = {"/", ""}, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String index() {
        return "index";
    }

    @GetMapping(value = {"/server_error"}, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String triggerServerError() {
        "ser".charAt(30);
        return "index";
    }

    @PostMapping(value = {"/general_error"}, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String triggerGeneralError() {
        return "index";
    }

}
