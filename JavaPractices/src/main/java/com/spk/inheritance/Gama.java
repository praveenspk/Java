package com.spk.inheritance;

class Alpha {
	String getType() {
		return "Alpha";
	}
}

class Beta extends Alpha {
	String getType() {
		return "Beta";
	}
}

public class Gama extends Beta {
	String getType() {
		return "Beta";
	}

	public static void main(String[] args) {

		Gama g1 = (Gama) new Alpha();
		Gama g2 = (Gama) new Beta();
		System.out.println(g1.getType() + g2.getType());

	}

}
