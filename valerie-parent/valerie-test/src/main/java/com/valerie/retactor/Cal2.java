package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class Cal2 extends Cal {

    /** Pull Members Down*/
    public int add(int a,int b){
        return super.add(a, b);
    }

    /** Pull Members Up*/
    public int sub(int a,int b){
        return super.sub(a, b);
    }
}
