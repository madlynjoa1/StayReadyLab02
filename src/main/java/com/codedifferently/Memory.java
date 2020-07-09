package com.codedifferently;

public class Memory {
    private double memoryValue;
    public void addToMemory(double num){
        memoryValue = num;
    }
    public double resetMemory(){
        return 0.0;
    }
    public double recallMemory(){
        return memoryValue;
    } 
}