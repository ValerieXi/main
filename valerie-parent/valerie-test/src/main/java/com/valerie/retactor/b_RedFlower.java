package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class b_RedFlower implements Flower{
    /** encapsulate fields*/
    String color;
    String name;

    /** replace constructor with builder*/
    private b_RedFlower(){

    }

    public static b_RedFlower createb_RedFlower() {
        return new b_RedFlower();
    }
}
