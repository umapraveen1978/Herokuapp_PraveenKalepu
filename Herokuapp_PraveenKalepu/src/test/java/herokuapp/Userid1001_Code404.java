package herokuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Userid1001_Code404 {
	Response userid1001=RestAssured.get("http://bpdts-test-app-v2.herokuapp.com/user/1001");
	
	//This test is to verify Response Code
	@Test 
	public void statusCodeuserid1001pass(){
			
			int respCode=userid1001.getStatusCode();
			System.out.println("Status Code is "+respCode);
			Assert.assertEquals(respCode, 404);
		}
		
	//This test is to get data and check Response Time in Milliseconds
	@Test 
	public void userid1001data(){
		
		String data=userid1001.asString();
		System.out.println("Data is "+data);
		System.out.println("Response time in milliseconds is "+userid1001.getTime());
		
	}
}
