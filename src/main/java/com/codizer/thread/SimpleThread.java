package com.codizer.thread;

public class SimpleThread extends Thread {
	// constructor
	public SimpleThread(String str) {
		super(str);
	}

	// redefinición del método run()
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Este es el thread : " + getName());
	}
}