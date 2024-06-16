/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junit.question2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yahya
 */
public class AngleRadianHelperTest {

   
    
    public AngleRadianHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

         AngleRadianHelper.Q1functionalInterface radiansToDegrees = (x) -> Math.toDegrees(x);
         AngleRadianHelper.Q1functionalInterface degreesToRadians = (x) -> Math.toRadians(x);
         AngleRadianHelper.Q1functionalInterface radiansForSin = (x) -> Math.sin(x);
         AngleRadianHelper.Q1functionalInterface radiansForCos = (x) -> Math.cos(x);
         AngleRadianHelper.Q1functionalInterface radiansForTan = (x) -> Math.tan(x);
 
    @Test
    public void testGetAngle_radiansToDegrees() {
        System.out.println("getAngle_radiansToDegrees");
        double x = 1; //radian
        double expResult = 57.29577951308232; //degrees
        double result = AngleRadianHelper.getAngle(x, radiansToDegrees);
        assertEquals(expResult, result, 0); //delta is how much the two results can differ
    }
     
    @Test
    public void testGetAngle_degreesToRadians() {
        System.out.println("getAngle_degreesToRadians");
        double x = 180;
        double expResult = 3.141592653589793;
        double result = AngleRadianHelper.getAngle(x, degreesToRadians);
        assertEquals(expResult, result, 0);
    }    

    @Test
    public void testGetAngle_radiansForSin() {
        System.out.println("getAngle_radiansForSin");
        double x = 1;
        double expResult = 0.8414709848078965;
        double result = AngleRadianHelper.getAngle(x, radiansForSin);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testGetAngle_radiansForCos() {
        System.out.println("getAngle_radiansForCos");
        double x = 1;
        double expResult = 0.5403023058681398;
        double result = AngleRadianHelper.getAngle(x, radiansForCos);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testGetAngle_radiansForTan() {
        System.out.println("getAngle_radiansForTan");
        double x = 1;
        double expResult = 1.5574077246549023;
        double result = AngleRadianHelper.getAngle(x, radiansForTan);
        assertEquals(expResult, result, 0);
    }
    
}
