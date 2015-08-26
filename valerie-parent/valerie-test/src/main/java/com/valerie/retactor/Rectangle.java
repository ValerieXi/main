package com.valerie.retactor;

/**
 * Created by valerie on 15/7/28
 */
public class Rectangle {
    private static  Integer ZERO = 0;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        this(ZERO,ZERO,ZERO,ZERO);
    }
    public Rectangle(int width, int height ){
        this(ZERO,ZERO,width,height);
    }
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
