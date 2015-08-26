package com.valerie.retactor.new1;

/**
 * Created by valerie on 15/3/19
 */
public abstract class Price {
    abstract  int getPriceCode();

    abstract  double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

