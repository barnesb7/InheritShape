package com.company;

public class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void print(){
        System.out.println("Color: " + color + " Filled: " + filled);
    }


}
