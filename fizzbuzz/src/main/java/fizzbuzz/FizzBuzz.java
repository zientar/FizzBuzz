package fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {
	private HashMap<Integer, String> mapa;

	public HashMap<Integer, String> getMapa() {
		return mapa;
	}

	public void setMapa(HashMap<Integer, String> mapa) {
		this.mapa = mapa;
	}

	public boolean sprawdzDzielenie(Integer liczba, Integer dzielnik) {
		return liczba % dzielnik == 0;
	}

	public String sprawdzLiczbe(Integer liczba) {
		return sprawdzLiczbe(liczba, liczba);
	}

	public String sprawdzLiczbe(Integer liczba1, Integer liczba2) {
		StringBuilder tmp = new StringBuilder();
		boolean zmieniony = false;
		for (int i = liczba1; i <= liczba2; i++) {
			for (int j : mapa.keySet()) {
				if (sprawdzDzielenie(i, j)) {
					tmp.append(mapa.get(j));
					zmieniony = true;
				}
			}
			if (zmieniony) {
				tmp.append("\n");
				zmieniony = false;
			}

		}

		return tmp.toString();
	}

}
