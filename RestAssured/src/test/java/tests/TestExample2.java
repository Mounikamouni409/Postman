package tests;

import org.testng.Assert;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;



public class TestExample2 {
	
	@Test
	public void test1() {
		Response response= get("https://reqres.in/api/users?page=2");
		System.out.println("The status code: "+response.getStatusCode());
		System.out.println("Time of response: "+response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getStatusLine());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void test2() {
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[1].id",equalTo(8)).
			log().all();
	}

}
