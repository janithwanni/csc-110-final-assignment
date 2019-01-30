/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.ManageOperations;


public class ManageBookings extends Manageable {

    public ManageBookings() {
    //TODO add bookings table and column names
    tableName="bookings";
    String[] c = {"hallid","bookedby","startdate","enddate","dayconfig","confirmed"};
    columnNames = c;
    }
}
