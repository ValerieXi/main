package com.valerie.retactor.new2;

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

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        return frequentRenterPoints;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        return totalAmount;
    }

    public static void main(String[] args){
        Customer customer = new Customer("老王");
        System.out.print(customer.statement());

    }

}
