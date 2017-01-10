package com.codizer.thread;

// Ejemplo de Runnable:

public class SimpleRunnable implements Runnable {
	// se crea un nombre
	String nameThread;

	// constructor
	public SimpleRunnable(String str) {
		nameThread = str;
	}

	// definición del método run()
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el thread: " + nameThread);
		}
	}
}
