package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExample1 {
	@Test
	public void test1() {
		Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("The status code: "+response.getStatusCode());
		System.out.println("Time of response: "+response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getStatusLine());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

}
