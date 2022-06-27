package com.bilgeadam.sinav001;

public class CustomStringTr {

	String ifade;

	// 1
	public int uzunluk() {
		return ifade.length();
	}

	// 2
	public char indekstekiKarakter(int index) {
		return ifade.charAt(index);

	}

	// 3
	public boolean icerirMi(String str) {

		return ifade.contains(str);
	}

	// 4
	public boolean ileBitiyorMu(String str) {
		return ifade.endsWith(str);
	}

	// 5
	public int indeksi(String str) {
		return ifade.indexOf(str);
	}

	// 6
	public boolean bosMu(String str) {
		return ifade.isEmpty();
	}

	// 7
	public int sonIndeksi(char c) {
		return ifade.lastIndexOf(c);
	}

	// 8
	public String[] ayir(String str) {
		return ifade.split(str);

	}

	// 9
	public String bosluklariAl() {
		return ifade.trim();
	}

	// 10
	public String degistir(String a, String b) {
		return ifade.replace(a, b);

	}
}
