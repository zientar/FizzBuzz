package fizzbuzz;

import java.util.HashMap;

public class FizzBuzzMain {

	public static void main(String[] args) {
		HashMap<Integer, String> mapaPodzielnikow = new HashMap<Integer, String>();
		mapaPodzielnikow.put(3, "Fizz");
		mapaPodzielnikow.put(5, "Buzz");
		FizzBuzz fizz = new FizzBuzz();
		fizz.setMapa(mapaPodzielnikow);
		System.out.println(fizz.sprawdzLiczbe(1, 1000));

	}

}
