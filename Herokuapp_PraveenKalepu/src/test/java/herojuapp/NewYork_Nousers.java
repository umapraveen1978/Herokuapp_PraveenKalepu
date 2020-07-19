package herojuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewYork_Nousers {
	Response newyorkusers = RestAssured.get("http://bpdts-test-app-v2.herokuapp.com/city/New%20York/users");
	
	//This test is to verify Response Code
		@Test 
		public void statusCodeNewyorkUsers(){
				
				int respCode=newyorkusers.getStatusCode();
				System.out.println("Status Code is "+respCode);
				Assert.assertEquals(respCode, 200);
			}
			
		//This test is to get data and check Response Time in Milliseconds
		@Test 
		public void newyorkUsersdata(){
			
			String data=newyorkusers.asString();
			System.out.println("Data is "+data);
			System.out.println("Response time in milliseconds is "+newyorkusers.getTime());
			
		}

}
