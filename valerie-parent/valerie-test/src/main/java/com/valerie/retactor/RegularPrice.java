package com.valerie.retactor;

/**
 * Created by valerie on 15/3/19
 */
public class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int daysRented){
        double result = 2;
        if (daysRented > 2){
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
