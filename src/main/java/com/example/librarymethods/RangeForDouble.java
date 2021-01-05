package com.example.librarymethods;

import org.apache.commons.lang.math.DoubleRange;

public class RangeForDouble {

    public boolean amIInRange(double altFactor) {
	Double conflictLowerLimit = .001;
	Double conflictUpperLimit = 999.999;

	DoubleRange conflictTest = new DoubleRange(conflictLowerLimit, conflictUpperLimit);
	return conflictTest.containsDouble(altFactor);

    }

}
