/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.ManageOperations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageHalls extends Manageable {

    public ManageHalls() {
        tableName="halls";
        String[] c = {"name","capacity","price"};
        columnNames = c;
    }
}
