package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class Cal3 extends Cal {

    public int multiply(int a,int b){
        return a*b;
    }

    /** Pull Members Up*/
    public int sub(int a,int b){
        return super.sub(a, b);
    }
}
