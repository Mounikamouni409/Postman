package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;

public class XML_SchemaValidation {
	@Test
	 public void schemaValidation() throws IOException {
		
		File file = new File("./SOAPRequests/Add.xml");
		if(file.exists())
			System.out.println("****File Exists****");
		
		FileInputStream fileinput = new FileInputStream(file);
		String requestBody = IOUtils.toString(fileinput,"UTF-8");
		
		baseURI = "http://www.dneonline.com";
		given().
			header("Accept-Encoding", "gzip, deflate").
			contentType("text/xml").
			accept(ContentType.XML).
			body(requestBody).
		when().
			post("/calculator.asmx").
		then().
			statusCode(200).
			log().all().
		and().
			body("//*:AddResult.text()",equalTo("5")).
		and().
			assertThat().body(matchesXsdInClasspath("calculator.xsd"));
		 
	 }

}
