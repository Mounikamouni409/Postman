package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class JSONSchemaValidator {
	
	@Test
	public void testForGet() {
		baseURI ="https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			assertThat().
			body(matchesJsonSchemaInClasspath("Schema.json")).
			statusCode(200).
			body("data[1].first_name",equalTo("Lindsay")).
			body("data.first_name",hasItems("Lindsay","Tobias","Byron")).
		and().
			log().all();
			
			
			
	}

}
