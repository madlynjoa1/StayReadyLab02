package com.codedifferently;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayModeTest {
    DisplayMode displayMode;
    @Before
    public void setup(){
        this.displayMode = new DisplayMode();
    }
        

   @Test
   public void switchDisplayModeTest(){
       //Given
       
       String expected= "decimal";
       displayMode.switchDisplayMode();
       
       String actual = displayMode.getMode();
       //Then
       Assert.assertEquals(expected, actual);


   }
  
   @Test
   public void getModeTest(){
       //Given
       String actual= displayMode.getMode(); 
       
       //When
      String expected = displayMode.getMode();
       //Then
       Assert.assertEquals(expected, actual);
   } 
}