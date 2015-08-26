package com.valerie.retactor.move;

/**
 * 某个顾客租了一部影片
 * Created by valerie on 15/3/19
 */
public class Rental {
    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented(){
        return _daysRented;
    }

    public Movie getMovie(){
        return _movie;
    }

}
