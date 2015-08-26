package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class Cal {
    private boolean iswrong = false;

    /** make static*/
    public int magic(int a,int b){
        int c = a - b;
        int d = a - b;
        int e = a - b;
        return c * d * e;
    }

    /** invert boolean*/
    public boolean resultRight(){
        return !iswrong;
    }

    /** inline to anonymous*/
    public Cal2 getCal2(){
        return new Cal2();
    }

    /** Pull Members Down*/
    public int add(int a,int b){
        return a+b;
    }

    /** Pull Members Up*/
    public int sub(int a,int b){
        return a - b;
    }
}
