/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.ManageOperations;

import java.sql.ResultSet;


public class ManageFacilities extends Manageable {

    public ManageFacilities() {
     tableName = "facilities";
     String[] c = {"name"};
    columnNames = c;
    }  
}
