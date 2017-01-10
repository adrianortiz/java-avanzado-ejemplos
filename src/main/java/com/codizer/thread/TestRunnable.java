package com.codizer.thread;

// Ejemplo de Runnable
public class TestRunnable {
	
	public static void main(String[] args) { // metodo principal
		TestRunnable miTest = new TestRunnable();
		SimpleRunnable p = new SimpleRunnable("Hilo de prueba");
		// se crea un objeto de la clase Thread pasándolo el objeto Runnable
		// como argumento
		Thread miThread = new Thread(p);
		// se arranca el objeto de la clase Thread
		miThread.start();
	} // fin de metodo Main
	
}
