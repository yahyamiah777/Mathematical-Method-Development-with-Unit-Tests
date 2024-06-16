/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit.question2;

/**
 *
 * @author Yahya
 */
public class AngleRadianHelper {
    
    public interface Q1functionalInterface {
     double doubleOperation(double x);
     
     
} 
    
    public static double getAngle(double x, Q1functionalInterface method) {
    double result = method.doubleOperation(x);
     
    return result;
    

      

    };
}
