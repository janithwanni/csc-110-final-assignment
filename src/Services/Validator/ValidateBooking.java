/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Validator;

import Models.Booking;
import Services.Converters;
import Services.ExceptionMessageDialog;
import Services.ManageOperations.ManageBookings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janith
 */
public class ValidateBooking {
    
    private ManageBookings mb = new ManageBookings();
    public static boolean isDateConfigValid(LocalDate startDate,LocalDate endDate, String bitConfig){
//        if(bitConfig.equals("0000000")){
//            ExceptionMessageDialog.show(null, "Select a day of week or all day");
//            return false;
//        }
//        if(startDate.compareTo(endDate) <= 0){            
//            int startDayOfWeek = 1 - startDate.getDayOfWeek().getValue(); 
//            /* 1 IS MONDAY 7 IS SUNDAY
//            In our bit conf the first bit is MONDAY
//            */
//            return true;
//        }else{
//            return false;
//        }
        //dummy return until the rest of the operations are fixed properly
        return true;
    }

    public static boolean isBookingDateFree(LocalDate startDate, LocalDate endDate, String bitConf) {
        return true;
//        try {
//            ManageBookings mb = new ManageBookings();
//            int startMonth = startDate.getMonthValue();
//            int startYear = startDate.getYear();
//            int endYear = startDate.getYear();
//            int endMonth = endDate.getMonthValue();
//            ResultSet bookingsResult = mb.read("month of startdate = "+startMonth+" and year of startdate = "+startYear+"and month of enddate = "+endMonth+" and year of end date = "+endYear);
//            Vector<Booking> bookings = new Vector<Booking>();
//            while(bookingsResult.next()){
//                //startdate, enddate, bitconf, bookedby, confirmed, hallid, bookingid
//                Booking b = new Booking(Converters.fromDatetoLocalDate(bookingsResult.getDate("startDate")),
//                        Converters.fromDatetoLocalDate(bookingsResult.getDate("endDate")),
//                        bookingsResult.getString("bitConf"),
//                        bookingsResult.getString("bookedBy"),
//                        bookingsResult.getBoolean("confirmed"),
//                        bookingsResult.getInt("hallid"),
//                        bookingsResult.getInt("bookingid"));
//                bookings.add(b);
//            }
//            if(bitConf.equals("1111111")){
//                for(Booking b:bookings){
//                    if(b.getBitConf().equals("1111111")){
//                        if(b.getStartDate().isBefore(startDate) && b.getEndDate().isAfter(startDate)){
//                            return false;
//                        }
//                        if(b.getStartDate().isBefore(endDate) && b.getEndDate().isAfter(endDate)){
//                            return false;
//                        }
//                    }else{
//                        
//                    }
//                }
//            }else{
//                
//            }
//            return true;
//        } catch (SQLException ex) {
//            ExceptionMessageDialog.show(null, ex.getMessage());
//            return true;
//        }
    }
}
/*
commented out code
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
*/