package herokuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Userid1_Code200 {
Response userid1=RestAssured.get("http://bpdts-test-app-v2.herokuapp.com/user/1");

//This test is to verify Response Code
@Test 
public void statusCodeuserid1(){
		
		int respCode=userid1.getStatusCode();
		System.out.println("Status Code is "+respCode);
		Assert.assertEquals(respCode, 200);
	}
	
//This test is to get data and check Response Time in Milliseconds
@Test 
public void userid1data(){
	
	String data=userid1.asString();
	System.out.println("Data is "+data);
	System.out.println("Response time in milliseconds is "+userid1.getTime());
	
}
}
