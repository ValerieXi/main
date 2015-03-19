package com.valerie.retactor;

/**
 * 电影
 * Created by valerie on 15/3/19
 */
public class Movie {
    private static final int CHILDRENS = 2;//儿童
    private static final int REGULAR = 0;//普通
    private static final int NEW_RELEASE = 1;//新片

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode(){
        return _priceCode;
    }

    public void setPriceCode(int arg){
        _priceCode = arg;
    }

    public String getTitle(){
        return _title;
    }

}
