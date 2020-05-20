package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	//TestNg xml file from maven 
	//How to execute all test cases from Test folder - mvn test
	@Test
	public void Browsertest() {
		System.out.println("====Inside Browsertest =======");
	}

	@Test
	public void Elementsuitest() {
		System.out.println("====Inside Elementsuitest ======");
	}
}
