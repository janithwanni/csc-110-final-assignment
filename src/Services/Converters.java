/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author janith
 */
public class Converters {
    
    public static Date fromLocalDatetoUtilDate(LocalDate ld){
        Date d = new Date(ld.toEpochDay());
        return d;
    }

    public static String fromLocalDatetoString(LocalDate ld) {
        return ld.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
