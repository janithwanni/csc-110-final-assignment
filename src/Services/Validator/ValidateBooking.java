/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Validator;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author janith
 */
public class ValidateBooking {
    public static boolean isDateConfigValid(LocalDate startDate,LocalDate endDate, String bitConfig){
        if(startDate.compareTo(endDate) <= 0){            
            int startDayOfWeek = 1 - startDate.getDayOfWeek().getValue(); 
            /* 1 IS MONDAY 7 IS SUNDAY
            In our bit conf the first bit is MONDAY
            */
            if(bitConfig.equals("0000000")){
                return true;
            }else{
                for (int i = 0; i < bitConfig.length(); i++) {
                    if(bitConfig.charAt(i) == '1'){
                        if(i >= startDayOfWeek){
                            return true;
                        }
                    }
                }
                return false;
            }
        }else{
            return false;
        }
    }
}
