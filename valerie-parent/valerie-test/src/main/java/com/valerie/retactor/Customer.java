package com.valerie.retactor;

import java.util.Vector;

/**
 * Created by valerie on 15/3/19
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name){
        _name = name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String getName(){
        return _name;
    }

}
