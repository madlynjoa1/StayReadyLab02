package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class MemoryTest {
    Memory memory;
    @Before
    public void setup(){
        this.memory = new Memory();
    }
  @Test
   public void addToMemoryTest(){
       //Given
       
       double expected = 2.0;
       //When
       memory.addToMemory(2.0);
       double actual = memory.recallMemory();

       //Then
       Assert.assertEquals(expected, actual,0.0);
    
       
   }
   @Test
   public void resetMemoryTest(){
       //Given
       double expected= 0.0;

       //When
       memory.resetMemory();
       double actual = memory.recallMemory();
       //Then
       Assert.assertEquals(expected, actual,0.0);

   }
}