package com.example.demo.errorhandling;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {

	public static int counter = 0;
	
	/**
	 * Added just for demonstration. It logs all the application arguments.
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Application started with option names : {}", 
		          args.getOptionNames());
		        log.info("Increment counter");
		        counter++;

	}

}
