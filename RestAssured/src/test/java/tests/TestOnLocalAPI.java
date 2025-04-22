package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class TestOnLocalAPI {
	
	@Test
	public void get() {
		
		baseURI = "http://localhost:3000";
		
		given().
			get("/users").
		then().
			statusCode(200).
		and()
			.log().all();
		
	}
	
	@Test
	public void post() {
		
		JSONObject request = new JSONObject();
		request.put("firstname", "Jack");
		request.put("lastname", "Daniel");
		request.put("subjectId", 1);
		request.put("id", 4);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
		and().
			log().all();
	}
	
	@Test
	public void put() {
		
		JSONObject request = new JSONObject();
		request.put("firstname", "Albert");
		request.put("lastname", "Einstien");
		request.put("subjectId", 2);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
		and().
			log().all();
	}
	
	@Test
	public void patch() {
		
		JSONObject request = new JSONObject();
		request.put("subjectId", 1);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
		and().
			log().all();
	}
	
	@Test
	public void delete() {
		
		
		baseURI = "http://localhost:3000";
		
		given()
			.delete("/users/4")
		.then()
			.statusCode(204)
		.and()
			.log().all();
	}

}
