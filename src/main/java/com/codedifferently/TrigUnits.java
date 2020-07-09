package com.codedifferently;

public class TrigUnits {
    private String setMode= "Degrees";
    private String[] switchUnitMode= {"Degrees", "Radians"};
    
    int i=0;
    public String switchUnitMode(){
        i++;
        if(i==2){
            i=0;
        }
        return switchUnitMode[i];
    
    }
    public String getMode(){
        return setMode;
    } 
}