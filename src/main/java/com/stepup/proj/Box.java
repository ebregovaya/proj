package com.stepup.proj;

public class Box {
    private int size;
    public int getSize(){
        return size;
    }
    private void setSize(int size){
        this.size=size;
    }
    private Box(){
    }
    public Box(int size){
        this.size = size;
    }
}
