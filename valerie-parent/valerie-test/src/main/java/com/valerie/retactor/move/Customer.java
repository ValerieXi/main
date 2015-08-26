package com.valerie.retactor.move;

import java.util.Enumeration;
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

    /**
     * 生成订单
     */
    public String statement(){
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each._movie.getCharge(each.getDaysRented())) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each._movie.getFrequentRenterPoints(each.getDaysRented());
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each._movie.getCharge(each.getDaysRented());
        }
        return result;
    }


}
