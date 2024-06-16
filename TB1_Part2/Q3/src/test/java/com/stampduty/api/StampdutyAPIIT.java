/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.stampduty.api;

import java.io.IOException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


/**
 *
 * @author Yahya
 */
public class StampdutyAPIIT {
    
    public StampdutyAPIIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         System.out.println("Start");
        StampdutyAPI instance = new StampdutyAPI();
        instance.Start(); //Without the API there will be a connection error when getting the request
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

    @Test
    public void StampCalcSingle_IntegrationTest() throws IOException {
        System.out.println("StampCalcSingle_IntegrationTest");
        double expResult = 33750;
        //Given
        HttpUriRequest request = new HttpGet( "http://localhost:4567/stampduty/Single/925000" );
        //When
        HttpResponse response = HttpClientBuilder.create().build().execute( request );
        //Then
        String jsonFromResponse = EntityUtils.toString(response.getEntity()); //the API framework takes the localhosts data in as a JSON file
        Double result = Double.parseDouble(jsonFromResponse);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void StampCalcFirstTime_IntegrationTest() throws IOException {
        System.out.println("StampCalcFirstTime_IntegrationTest");
        double expResult = 18799.95;
        //Given
        HttpUriRequest request = new HttpGet( "http://localhost:4567/stampduty/FirstTime/625999" ); //stampduty and ping are paths for the local host data that I put in?
        //When
        HttpResponse response = HttpClientBuilder.create().build().execute( request );
        //Then
        String jsonFromResponse = EntityUtils.toString(response.getEntity());
        Double result = Double.parseDouble(jsonFromResponse);
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void StampCalcAdditional_IntegrationTes() throws IOException {
        System.out.println("StampCalcAdditional_IntegrationTest");
        double expResult = 136250;
        //Given
        HttpUriRequest request = new HttpGet( "http://localhost:4567/stampduty/Additional/1500000" );
        //When
        HttpResponse response = HttpClientBuilder.create().build().execute( request );
        //Then
        String jsonFromResponse = EntityUtils.toString(response.getEntity());
        Double result = Double.parseDouble(jsonFromResponse);
        assertEquals(expResult, result, 0);
        
    }
    
}
