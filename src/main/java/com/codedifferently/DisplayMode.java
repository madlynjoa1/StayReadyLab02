package com.codedifferently;

public class DisplayMode extends SciCalculator {
    private String[] displayModeList= {"binary", "octal", "decimal", "hexadecimal"};
    private String whichMode="decimal"; 
    int i =1;
    public String switchDisplayMode(){
        i++;
        if(i==4){
            i=0;
        }
        return displayModeList[i];       
    }
     public String getMode(){
         return whichMode;
     }
 
  
}