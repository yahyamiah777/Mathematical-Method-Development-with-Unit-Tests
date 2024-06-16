/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package junit.question1;

import static junit.question1.AngleRadianHelper.getAngle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import static junit.question1.csvStreamMethods.calculateAverage;
import static junit.question1.csvStreamMethods.calculateSD;
import static junit.question1.csvStreamMethods.readInCsv;

/**
 *
 * @author Yahya
 */
public class Question1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Question 1 a)        
         AngleRadianHelper.Q1functionalInterface radiansToDegrees = (x) -> Math.toDegrees(x);
         AngleRadianHelper.Q1functionalInterface degreesToRadians = (x) -> Math.toRadians(x);
         AngleRadianHelper.Q1functionalInterface radiansForSin = (x) -> Math.sin(x);
         AngleRadianHelper.Q1functionalInterface radiansForCos = (x) -> Math.cos(x);
         AngleRadianHelper.Q1functionalInterface radiansForTan = (x) -> Math.tan(x);
        
        radiansToDegrees.doubleOperation(2);                       //Lambda Expression used with no printing
        AngleRadianHelper.getAngle(2, radiansToDegrees);           //Without import of method you can create an instance
                                                                   //of AngleRadianHelper and use method to return degrees
        
        getAngle(190,degreesToRadians);                             //Method can be used with no instance because the method is imported and static
        
         System.out.println(getAngle(1,radiansToDegrees));
        System.out.println(getAngle(180,degreesToRadians));
        System.out.println(getAngle(1,radiansForSin));
        System.out.println(getAngle(1,radiansForCos)); 
       System.out.println(getAngle(1,radiansForTan));
        
        //Question 1 b)
       
        String dataFile = "G:\\Uni Year 3\\Programming III\\SoftwareTesting\\TB1_Part2\\Q1\\src\\main\\resources\\data.csv"; 
//this works for the file path from my computer
//example file path may need to be copy and pasted
//from Other Sources folder or your own data.csv
//File should be in UTF-8 not UTF-8-BOM
        
       //System.out.println(readInCsv(dataFile)); printing statement
       //(readInCsv(dataFile)); not a statement error because it is a non-void method which should be made from within other java statements
       // A non-void always returns a value, this value has to be stored in a variable, printed, or returned to a Java control structure or another method.


       List<List<String>> dataList = readInCsv(dataFile);
        System.out.println(dataList);
           List<String> NumberList = dataList.get(0);
        
               double average = calculateAverage(NumberList);
               double SD = calculateSD(NumberList);
               System.out.println(average);
               System.out.println(SD);    
}
    
  
   
    
    }

