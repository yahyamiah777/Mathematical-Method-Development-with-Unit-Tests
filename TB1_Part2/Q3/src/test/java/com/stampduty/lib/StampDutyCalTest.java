package com.stampduty.lib;


import static com.stampduty.lib.BuyerTypeEnum.Additional;
import static com.stampduty.lib.BuyerTypeEnum.FirstTime;
import static com.stampduty.lib.BuyerTypeEnum.Single;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class StampDutyCalTest 
{

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    //StampCalcSingle tests
    
     @Test
    public void testStampCalcSingle_0taxRate() {
        System.out.println("StampCalcSingle_0tax");
        double housePrice = 250000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 0;
        double result = instance.StampCalc(Single, housePrice);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testStampCalcSingle_5percentTaxRate() {
        System.out.println("StampCalcSingle_5%tax");
        double housePrice = 925000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 33750;
        double result = instance.StampCalc(Single, housePrice);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void testStampCalcSingle_10percentTaxRate() {
        System.out.println("StampCalcSingle_10%tax");
        double housePrice = 1500000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 91250.0;
        double result = instance.StampCalc(Single, housePrice);
        assertEquals(expResult, result, 0);
        
        
    }
    
    @Test
    public void testStampCalcSingle_12percentTax() {
        System.out.println("StampCalcSingle_12%tax");
        double housePrice = 1500001;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 91250.12;
        double result = instance.StampCalc(Single, housePrice);
        assertEquals(expResult, result, 0);
        
        
    }

    //StampCalcFirstTime tests
    
    @Test
    public void testStampCalcFirstTime_over() {
       System.out.println("StampCalcFirstTime_over");
        double housePrice = 625001;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 18750.05;
        double result = instance.StampCalc(FirstTime, housePrice); 
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testStampCalcFirstTime_under() {
       System.out.println("StampCalcFirstTime_under");
        double housePrice = 425000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 0;
        double result = instance.StampCalc(FirstTime, housePrice);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testStampCalcFirstTime_within() {
       System.out.println("StampCalcFirstTime_within");
        double housePrice = 625000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 10000;
        double result = instance.StampCalc(FirstTime, housePrice);
        assertEquals(expResult, result, 0);
    }
    
    //StampCalcAdditional tests
    
    @Test
    public void testStampAdditional_3percentTaxRate() {
        System.out.println("StampCalcAdditional_3%tax");
        double housePrice = 250000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 7500;
        double result = instance.StampCalc(Additional, housePrice);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void testStampAdditional_8percentTaxRate() {
        System.out.println("StampCalcAdditional_8%tax");
        double housePrice = 925000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 61500;
        double result = instance.StampCalc(Additional, housePrice);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void testStampCalcSingle_13percentTaxRate() {
        System.out.println("StampCalcAdditional_13%tax");
        double housePrice = 1500000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 136250;
        double result = instance.StampCalc(Additional, housePrice);
        assertEquals(expResult, result, 0);
        
        
    }
    
    @Test
    public void testStampCalcSingle_15percentTax() {
        System.out.println("StampCalcAdditional_15%tax");
        double housePrice = 2000000;
        StampDutyCal instance = new StampDutyCal();
        double expResult = 211250;
        double result = instance.StampCalc(Additional, housePrice);
        assertEquals(expResult, result, 0);
        
        
    }
    
    
    
    
    
    
    
  

    
}