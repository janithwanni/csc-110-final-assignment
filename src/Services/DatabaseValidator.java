/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Database.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JanithWanni
 */
public class DatabaseValidator {
    private DatabaseConnector dc = new DatabaseConnector();
    public boolean isDatabaseExists() throws SQLException{
        ResultSet count = dc.getStatement().executeQuery("select count(*) from information_schema.tables where table_schema='"+dc.DB_NAME+"'");
        count.next();
        if(count.getInt(0) == 1){
            return true;
        }
        return false;
    }
    public void createDatabase() throws SQLException{
        dc.getStatement().executeUpdate("create database "+dc.DB_NAME);
    }
    public boolean tableSanityCheck() throws SQLException{
        // the tables to check are the following
        //users
        //hall
        //facilties
        //hall_has_facilities
        //bookings
        ResultSet count = dc.getStatement().executeQuery(" select count(*) from information_schema.tables where table_schema='reservation_system_db' and table_name='bookings'");
        count.next();
        if(count.getInt(0) == 1){
            return true;
        }else{
            //TODO: add code to restore sql dump file
            //create table users(id int auto_increment primary key,username varchar(200), password varchar(128));
            //create halls
            //create table halls( hallid int auto_increment, name varchar(200), capacity int, price float(2), primary key(hallid));
            //create facilities
            //create table facilities(facilityid int auto_increment, name varchar(200),primary key(facilityid));
        }   //create hall has facilities            
            /*
            create table hall_has_facilities(hall_has_facility_id int auto_increment, hallid int, facilityid int, name varchar(200),count int, primary key(hall_has_facility_id), 
            constraint foreign_key_check_1 foreign key(hallid) references halls(hallid) on delete cascade on update restrict, 
            constraint foreign_key_check_2 foreign key(facilityid) references facilities(facilityid) on delete cascade on update restrict);
            */
            //create table bookings
            //create table 
            /* create table bookings(bookingid int auto_increment, hallid int, bookedby varchar(200), confirmed smallint,startdate date, enddate date,dayconfig varchar(7),
               primary key(bookingid),
               constraint foreign_key_check_3 foreign key(hallid) references halls(hallid) on delete cascade on update restrict);               
        */
        return false;
    }
}
