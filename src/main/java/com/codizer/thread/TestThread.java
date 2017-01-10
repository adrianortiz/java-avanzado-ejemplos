package com.codizer.thread;

public class TestThread {
	public static void main(String[] args) { // metodo principal
		SimpleThread miThread = new SimpleThread("Hilo de prueba");
		miThread.start();
	} // fin de metodo Main
} // fin de clase TestThread