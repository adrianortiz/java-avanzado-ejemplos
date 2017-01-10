package com.codizer;
import java.awt.GraphicsDevice;

import java.awt.GraphicsEnvironment;

import javax.swing.UIManager;

// Variables de sistema en Java

public class SystemProp {

	public static void main(String[] args) {

		try {

			String msg = "Propriedades del sistema\n";

			msg = msg + "Version de Java: " + System.getProperty("java.vm.version") + "\n";

			msg = msg + "Vendor: " +

					System.getProperty("java.vm.vendor") + " - Web:" +

					System.getProperty("java.vendor.url") + "\n\n";

			msg = msg + "Version de Windows: " +

					System.getProperty("os.name") + " " +

					System.getProperty("os.version") + " " +

					System.getProperty("sun.os.patch.level") + "\n";

			msg = msg + "OS architectura: " + System.getProperty("os.arch") + "\n\n";

			GraphicsEnvironment env =

					GraphicsEnvironment.getLocalGraphicsEnvironment();

			msg = msg + "Resolución de pantalla: " +

					(int) env.getMaximumWindowBounds().getMaxX() + " x " + (int) env.getMaximumWindowBounds().getMaxY()
					+ "\n";

			GraphicsDevice device = env.getDefaultScreenDevice();

			int bytes = device.getAvailableAcceleratedMemory();

			int mbytes = bytes / 1048576;

			msg = msg + "Memoria grafica: " + mbytes + " MB\n\n";

			msg = msg + "Look & Feel disponibles:\n ";

			UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();

			for (int i = 0; i < info.length; i++) {

				// Get the name of the look and feel that is suitable for
				// display to the user

				String humanReadableName = info[i].getName();

				String className = info[i].getClassName();

				msg = msg + " " + humanReadableName + " - " + className + "\n";

			}

			msg = msg + "\n";

			msg = msg + "Archivo del programa: " + System.getProperty("user.dir") + "\n\n";

			msg = msg + "CPU: " + System.getProperty("sun.cpu.isalist") + "\n\n";

			msg = msg + "Usuario: " + System.getProperty("user.name") + "\n";

			msg = msg + "Idioma: " + System.getProperty("user.language") + "\n";

			msg = msg + "Encoding: " + System.getProperty("sun.jnu.encoding") + "\n\n";

			msg = msg + "Tempdir: " + System.getProperty("java.io.tmpdir") + "\n";

			msg = msg + "Java CLASS path: " + System.getProperty("java.class.path") + "\n\n";

			msg = msg + "Java path: " + System.getProperty("sun.boot.class.path") + "\n\n";

			msg = msg + "Java LIB path: " + System.getProperty("java.ext.dirs") + "\n\n";

			msg = msg + "Windows path: " + System.getProperty("java.library.path") + "\n\n";

			System.out.println(msg);

		} catch (Exception ex) {

			System.out.println("Error in SystemProp() constructor" +

					ex.getMessage());

		}
	}
}