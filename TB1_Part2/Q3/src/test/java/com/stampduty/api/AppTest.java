package com.stampduty.api;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.*;

public class AppTest 
{
    @Before
    public void init()
    {
        new Thread(() -> {
            var api = new StampdutyAPI();
            api.Start();
        }).start();

    }
    @Test
    public void PingShouldAnswerWithCorrectName() throws ClientProtocolException, IOException
    {
        // Given
        String name = "Bob";
        var request = new HttpGet( "http://localhost:4567/ping/" + name );

        // When
        var httpResponse = HttpClientBuilder.create().build().execute( request );

        // Then
        assertTrue(httpResponse.getStatusLine().getStatusCode() == 200);

        BufferedReader reader = new BufferedReader(new InputStreamReader(
            httpResponse.getEntity().getContent()));

            String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		reader.close();

		// print result
		System.out.println(response.toString());
        assertEquals(response.toString(), "Hello Bob");
    }
}
