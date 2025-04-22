package annotationExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsClass2 {
	@BeforeClass
	public void login() {
		System.out.println("Login..");
	}
	
	@Test
	public void search() {
		System.out.println("search..");
	}
	@Test(priority=1)
	public void advsearch() {
		System.out.println("Advanced Search..");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout..");

	}

}
