/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author janith
 */
public class TableModelBuilder {

    public static TableModel build(ResultSet rs) throws SQLException {

        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<String>();
        int columnCount = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(resultSetMetaData.getColumnName(i));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> row = new Vector<Object>();
            for (int i = 1; i <= columnCount; i++) {
                row.add(rs.getObject(i));
            }
            data.add(row);
        }
        rs.close();
        return new DefaultTableModel(data, columnNames);
    }
}
