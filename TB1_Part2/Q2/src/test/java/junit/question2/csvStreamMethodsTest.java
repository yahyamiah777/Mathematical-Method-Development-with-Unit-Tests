/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junit.question2;

import java.util.List;
import static junit.question2.csvStreamMethods.readInCsv;
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
public class csvStreamMethodsTest {
    
    public csvStreamMethodsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     String dataCSV;
    List<List<String>> dataList;
    
    @Before
    public void setUp() {
        dataCSV = "G:\\Uni Year 3\\Programming III\\SoftwareTesting\\TB1_Part2\\Q2\\src\\test\\resources\\data.csv\\"; 
        dataList=readInCsv(dataCSV);                                                                                 
        //this works for the file path from my computer
        //example file path may need to be copy and pasted
        //from Other Test Sources folder or your own data.csv
        //File should be in UTF-8 not UTF-8-BOM                                                                                                                
    }
    
    @After
    public void tearDown() {
    }

   /**
     * Test of calculateAverage method, of class csvStreamMethods.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        List<String> NumberList = dataList.get(0); //if the data csv has more than one list you can choose the list
        double expResult = 106.4;
        double result = csvStreamMethods.calculateAverage(NumberList);
        assertEquals(expResult, result, 0);   
    }

    /**
     * Test of calculateSD method, of class csvStreamMethods.
     */
    @Test
    public void testCalculateSD() {
        System.out.println("calculateSD");
        List<String> NumberList = dataList.get(0);
        double expResult = 169.7558246423374;
        double result = csvStreamMethods.calculateSD(NumberList);
        assertEquals(expResult, result, 0); 
    }
    
}
