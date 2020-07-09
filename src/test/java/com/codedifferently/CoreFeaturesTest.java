package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreFeaturesTest{
    CoreFeatures coreFeatures;
    @Before
    public void setup(){
        this.coreFeatures = new CoreFeatures();
    }
    @Test
    public void addTest(){
        //Given
        double expected = 4.0;

        coreFeatures.setCurrentValue(2.0);

        //When
        double actual = coreFeatures.add(2.0);
        
        //Then or expected 
       Assert.assertEquals(expected, actual,0.0);

    }
    @Test
    public void substractTest(){
        //Given
        double expected = 4.0;
        coreFeatures.setCurrentValue(6.0);

        //When 
        double actual = coreFeatures.substract(2.0);
        //Then 
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void divideTest(){
        //Given
        
        double expected = 2.0;
        coreFeatures.setCurrentValue(6.0);
        
        //When
        double actual = coreFeatures.divide(3.0);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void multiply(){
        //Given
       
        double expected= 6.0;
        coreFeatures.setCurrentValue(2.0);
        //when
        double actual = coreFeatures.multiply(3.0);

        //Then
        Assert.assertEquals(expected, actual,0.0);

    }
    @Test
    public void expTest(){
        //Given
       
        double expected= 8.0;
        coreFeatures.setCurrentValue(2.0);
        //When
        double actual= coreFeatures.exp(3.0);
        //Then
        Assert.assertEquals(expected, actual, 0.0);


    }
    @Test
    public void squareTest(){
        //Given
       
        double expected= 4.0;
        coreFeatures.setCurrentValue(2.0); 
        //When
        double actual = coreFeatures.square(2.0);
        //Then
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void squareRootTest(){
        //Given
    
        double expected= (2.0);
        coreFeatures.setCurrentValue(4.0);
        //Then
        double actual = coreFeatures.squareRoot(2.0);

        //When
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void inverseTest(){
        //Given
        
        double expected= 1/2.0;
        coreFeatures.setCurrentValue(2.0);
        //Then
        double actual = coreFeatures.inverse(2.0);

        //When
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void invertSignTest(){
        //Given
       
        double expected = -8.0;
        coreFeatures.setCurrentValue(8.00);
        //When
        double actual = coreFeatures.invertSign(8.00);
        
        //Then
        Assert.assertEquals(expected, actual, 0.0);

    }
    @Test
    public void logarithmTest(){
        //Given
        double expected= 1.0;
        coreFeatures.setCurrentValue(10.0);
        //When 
        double actual = coreFeatures.log10(10.0);
        
        
        //Then
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test
    public void cubeRootTest(){
        //Given 
        double expected = 4.0;
        //When
        coreFeatures.setCurrentValue(64.00);
        double actual = coreFeatures.cubeRoot(64.0);
        //Then
        Assert.assertEquals(expected, actual,0.0);
    }

}