/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Database.DatabaseConnector;
import java.sql.ResultSet;

/**
 *
 * @author JanithWanni
 */
public interface Manageable {
    DatabaseConnector dc = new DatabaseConnector();
    void create(Object[] values,String[] columnNames);
    ResultSet read(String criteria);
    void update(Object[] values,String[] columnNames,String criteria);
    void delete(String criteria);   
}
