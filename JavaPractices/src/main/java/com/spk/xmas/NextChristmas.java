package com.spk.xmas;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NextChristmas implements TemporalAdjuster {
	//LocalDate localDate=null;
	 //Temporal temporal=null;  
    @Override
    public Temporal adjustInto(Temporal temporal) {
    	/*return localDate = localDate.with(
			temporal -> temporal.with(ChronoField.MONTH_OF_YEAR, 12).with(ChronoField.DAY_OF_MONTH, 25)
		);	
*/
    	
    return temporal.with(ChronoField.MONTH_OF_YEAR, 12).with(ChronoField.DAY_OF_MONTH, 25);

    }

	}