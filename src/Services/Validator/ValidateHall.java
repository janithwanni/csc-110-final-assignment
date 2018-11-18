/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Validator;

/**
 *
 * @author janith
 */
public class ValidateHall {
    public static boolean isValidHall(String name,int capacity,double price){
        final int CAPACITY_MIN_LIMIT = 0;
        final double PRICE_MIN_LIMIT = 0;
        //TODO add validation criteria
        if(!name.equals(" ") || !name.equals("") && capacity > CAPACITY_MIN_LIMIT && price > PRICE_MIN_LIMIT){
            return true;
        }else{
            return false;
        }
        
    }
}
