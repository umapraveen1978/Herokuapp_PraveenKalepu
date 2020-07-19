package herokuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Instructions {
	Response instructions = RestAssured.get("http://bpdts-test-app-v2.herokuapp.com/instructions");
	
	//This test is to verify Response Code
	@Test 
	public void statusCodeInstructions(){
			
			int respCode=instructions.getStatusCode();
			System.out.println("Status Code is "+respCode);
			Assert.assertEquals(respCode, 200);
		}
		
	//This test is to get data and check Response Time in Milliseconds
	@Test 
	public void Instructionsdata(){
		
		String data=instructions.asString();
		System.out.println("Data is "+data);
		System.out.println("Response time in milliseconds is "+instructions.getTime());
	}
	}
