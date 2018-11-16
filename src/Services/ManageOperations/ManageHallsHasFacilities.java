/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.ManageOperations;

import java.sql.ResultSet;


public class ManageHallsHasFacilities extends Manageable {

    public ManageHallsHasFacilities() {
        tableName="hall_has_facilities";
        String[] c = {"hallid,facilityid,name,count"};
        columnNames = c;
    }

    
    //TODO add the necessary codes here
}
