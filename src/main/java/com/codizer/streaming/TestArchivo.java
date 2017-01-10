package com.codizer.streaming;

import java.io.*;

// Listar archivos de un directorio existente

public class TestArchivo {

	public static String leer() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			return br.readLine();
		} catch (Exception e) {
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println("Indique nombre de subdirectorio");
		System.out.println("Trayectoria absoluta, por ej: C:\\java");
		String nomdir = leer();
		File arch = new File(nomdir);
		if (arch.exists())
			if (arch.isDirectory()) {
				System.out.println("Contenido de " + nomdir);
				String arr[] = arch.list();
				for (int j = 0; j < arr.length; j++) {
					File otro = new File(nomdir + "\\" + arr[j]);
					if (otro.isDirectory())
						System.out.println(arr[j] + " <DIR>");
					else
						System.out.println(arr[j]);
				}
			} else
				System.out.println(nomdir + " no es un directorio");
		else
			System.out.println("No existe");
	}
}
