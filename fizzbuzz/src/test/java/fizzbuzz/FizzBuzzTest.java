package fizzbuzz;

import org.junit.jupiter.api.BeforeAll;

public class FizzBuzzTest {

	String[] podzielniki = { "3", "5" };
	private FizzBuzz fbTest = new FizzBuzz();

	@BeforeAll
	public void prepareTest() {
		fbTest.setPodzielniki(podzielniki);
	}

}
