/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Yahya
 */
public class csvStreamMethods {
    
     public static List<List<String>> readInCsv(String file)
    {
     List<List<String>> csvAsListOfLists = new ArrayList<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
           String line;
            String delimiter = ",";
            while ((line = br.readLine()) != null ) 
            {

        List<String> values = Arrays.asList(line.split(delimiter));
        csvAsListOfLists.add(values);                                       
 
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
        return csvAsListOfLists;
    }
    
    
    public static double calculateAverage(List<String> NumberList)
    {
    List<Integer> integerList = NumberList.stream()
            .map(Integer::valueOf).collect(Collectors.toList());
             
            IntSummaryStatistics stats = integerList
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

                return stats.getAverage();
    }
     
    public static double calculateSD(List<String> NumberList)
    {
         List<Integer> integerList = NumberList.stream()
            .map(Integer::valueOf).collect(Collectors.toList());
             
        
        double sum = 0.0, standardDeviation = 0.0;
        int length = integerList.size();

        for(double num :integerList) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: integerList) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
