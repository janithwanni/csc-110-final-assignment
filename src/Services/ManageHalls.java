/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageHalls implements Manageable {

    @Override
    public void create(Object[] values, String[] columnNames) {
        
        String columnList = "";
        String valueList = "";
        for(String s:columnNames){
            columnList += s+",";
        }
        columnList = columnList.substring(0, columnList.length()-1);
        for(Object s:values){
            valueList += "'"+s+"',";
        }
        valueList = valueList.substring(0,valueList.length()-1);
        System.out.println("insert into halls(" + columnList + ") values(" + valueList + ")");
        dc.insert("insert into halls(" + columnList + ") values(" + valueList + ")");
    }

    @Override
    public ResultSet read(String criteria) {
        ResultSet result = dc.select("select * from halls where " + criteria);
        return result;
    }

    @Override
    public void update(Object[] values, String[] columnNames,String criteria) {
        String updateList = "";
        assert values.length == columnNames.length;
        for (int i = 0; i < values.length; i++) {
            updateList += columnNames[i]+"='"+values[i]+"',";
        }
        updateList = updateList.substring(0,updateList.length()-1);
        System.out.println("update halls set "+updateList+" where "+criteria);
        dc.update("update halls set "+updateList+" where "+criteria);
    }

    @Override
    public void delete(String criteria) {
        System.out.println("update halls set active=0 where "+criteria);
    }

    public static void main(String[] args) {
        ManageHalls mh = new ManageHalls();
        //mh.create(new String[2], new String[2]);
        //mh.update(new String[2], new String[2], "x = bal abla");
    }
}
