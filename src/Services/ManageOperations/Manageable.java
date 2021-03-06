/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.ManageOperations;

import Database.DatabaseConnector;
import Services.ExceptionMessageDialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JanithWanni
 */
public abstract class Manageable {

    //made abstract to prevent instantiation only do not forget
    //extend this class and set the tableName to get the functionality of CRUD opsÏ
    DatabaseConnector dc = new DatabaseConnector();
    protected String tableName = "tableName";
    public String[] columnNames = {""};
    
    public void create(Object[] values, String[] columnNames) {
        String columnList = "";
        String valueList = "";
        for (String s : columnNames) {
            columnList += s + ",";
        }
        columnList = columnList.substring(0, columnList.length() - 1);
        for (Object s : values) {
            valueList += "'" + s + "',";
        }
        valueList = valueList.substring(0, valueList.length() - 1);
        System.out.println("insert into " + tableName + "(" + columnList + ") values(" + valueList + ")");
        dc.insert("insert into " + tableName + "(" + columnList + ") values(" + valueList + ")");
    }

    public ResultSet read(String criteria) {
        System.out.println("reading table name"+tableName);
        if (criteria == "ALL") {
            ResultSet result = dc.select("select * from " + tableName);
            return result;
        } else {
            ResultSet result = dc.select("select * from " + tableName + " where " + criteria);
            return result;
        }
    }

    public void update(Object[] values, String[] columnNames, String criteria) {
        String updateList = "";
        assert values.length == columnNames.length;
        for (int i = 0; i < values.length; i++) {
            updateList += columnNames[i] + "='" + values[i] + "',";
        }
        updateList = updateList.substring(0, updateList.length() - 1);
        System.out.println("update " + tableName + " set " + updateList + " where " + criteria);
        dc.update("update " + tableName + " set " + updateList + " where " + criteria);
    }

    public void delete(String criteria) {
        System.out.println("delete from "+tableName+" where "+criteria);
        dc.delete("delete from "+tableName+" where "+criteria);
        //System.out.println("update " + tableName + " set active=0 where " + criteria);
        //TODO add delete function
    }
    
    public int getLastInsertID(){
        try {
            ResultSet r = dc.select("select last_insert_id() as lid");
            r.next();
            return r.getInt("lid");
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(null,ex.getLocalizedMessage());
            return 0;
        }
        
        
    }
}
