/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Services.ExceptionMessageDialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JanithWanni
 */
public class DatabaseConnector {
    public static final String DB_NAME = "reservation_system_db";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
    private Connection con;
    private Statement statement;

    public Statement getStatement() {
        return statement;
    }
    public DatabaseConnector(){
        try {
            con = DriverManager.getConnection(DB_URL,"root","");
            statement = con.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(null,ex.getLocalizedMessage());
        }
    }
    
    public void insert(String query){
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(null,ex.getLocalizedMessage());
        }
    }
    public ResultSet select(String query){
        try {
            return statement.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(null,ex.getLocalizedMessage());
            return null;
        }
    }
    public void update(String query){
        try{
           statement.executeUpdate(query);
        }catch(SQLException e){
            e.printStackTrace();
            ExceptionMessageDialog.show(null,e.getLocalizedMessage());
        }
    }
    public void delete(String query){
        try{
            statement.executeUpdate(query);
        }catch(SQLException e){
            e.printStackTrace();
            ExceptionMessageDialog.show(null,e.getLocalizedMessage());
        }
    }
}
