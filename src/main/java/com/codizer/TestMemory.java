package com.codizer;

// Reciclaje de memoria

public class TestMemory {

	public static void main(String[] args) {
		String test = "";
		Runtime rt = Runtime.getRuntime();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Memoria total: " + rt.totalMemory() + " - Memoria libre: " + rt.freeMemory());
			test += "ffffffffffffffffffffffffffffffffffffff";
			System.gc();
		}
	}
}
