package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	static HashMap<Integer, String> mapaPodzielnikow = new HashMap<Integer, String>();

	private static FizzBuzz fbTest = new FizzBuzz();

	@BeforeAll
	public static void prepareTest() {
		mapaPodzielnikow.put(3, "Fizz");
		mapaPodzielnikow.put(5, "Buzz");
		fbTest.setMapa(mapaPodzielnikow);
	}

	@Test
	public void jesliLiczbaJestPodzielnaPrzez3i5ZwrocFizzBuzz() {
		assertEquals("FizzBuzz\n", fbTest.sprawdzLiczbe(30));
	}

	@Test
	public void jesliLiczbaJestPodzielnaPrzez3ZwrocFizz() {
		assertEquals("Fizz\n", fbTest.sprawdzLiczbe(3));
	}

	@Test
	public void jesliLIczbaJestPodzielnaPrzez5ZwrocBuzz() {
		assertEquals("Buzz\n", fbTest.sprawdzLiczbe(5));
	}

	@Test
	public void jesliLiczbaNiejstPodzielnaPrzez3i5ZwrocPustyString() {
		assertEquals("", fbTest.sprawdzLiczbe(1));
	}

}
