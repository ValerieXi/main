package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class a_ReplaceTemp {



    private double _quantity;
    private double _itemPrice;

    /** replace temp with query*/
    public double count() {
        if (basePrice() >= 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    private double basePrice() {
        return _quantity * _itemPrice;
    }

    /** Extract Method /Inline Method */
    public void print() {
        int result_add= 1+2;
        int result_sub= 2*3;
        System.out.println("Hello,s");
        System.out.println(result_add);
        System.out.println(result_sub);
    }

}
