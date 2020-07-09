package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void switchUnitModeTest(){
        //Given
        TrigUnits trigUnits = new TrigUnits();
        String expected= "Radians";
        //When
        String actual = trigUnits.switchUnitMode();;
        //Then
        Assert.assertEquals(expected, actual);
    
    
    }
    @Test
        public void getModeTest(){
            //Given
            TrigUnits trigUnits = new TrigUnits();
            String actual= trigUnits.getMode(); 
            
            //When
           String expected = trigUnits.getMode();
            //Then
            Assert.assertEquals(expected, actual);
        } 
}