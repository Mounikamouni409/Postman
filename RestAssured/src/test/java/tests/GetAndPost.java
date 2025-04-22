package tests;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class GetAndPost {
	
	@Test
	public void testForGet() {
		baseURI ="https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[1].first_name",equalTo("Lindsay")).
			body("data.first_name",hasItems("Lindsay","Tobias","Byron")).
		and().
			log().all();
			
			
			
	}
	
	@Test
	public void testForPost() {
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("name","Mounika");
		map.put("job","Engineer");
		System.out.println(map);*/
		
		JSONObject request = new JSONObject();
		request.put("name","Mounika");
		request.put("job","Engineer");
		System.out.println(request.toJSONString());
		
		baseURI ="https://reqres.in/api";
		given().
			header("Content-Type","application/json").
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

}
