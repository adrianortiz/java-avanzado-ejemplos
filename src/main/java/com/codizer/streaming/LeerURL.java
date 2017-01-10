package com.codizer.streaming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Leer un archivo via URL

public class LeerURL {

	public LeerURL() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		 if (args[0]==null)
             System.out.println("Se espera un parametro al llamar al metodod main!");
		 
		 URL miURL=null;
		 
		 try {
			
			 miURL = new URL("http://192.168.0.10/"+args[0]);
			 URLConnection yc = miURL.openConnection();
			 BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			 String inputLine;
			 System.out.println("<h1>Leyendo archivo</h1><hr>");
			 
			 // Leer archivo
			 while ((inputLine = in.readLine()) != null) {
				 try {
					 System.out.println(inputLine);
					 int lineSize=inputLine.length();
					 System.out.println(lineSize);
					                          }
					                          catch (Exception e1) {
					                                   in.close();
					                                   in=null;
					                                   e1.printStackTrace();
					                                   System.out.println("Error leyendo el archivo. "+e1);
					                                   break;
					 }
			 }
			 
			 // System.System.out.println(inputLine);
             in.close();
             in=null;
				 
		} catch (java.io.FileNotFoundException e) {
			System.out.println("<hr><h1><font color=red>El archivo http://192.168.0.10/'"+args[0]);
		} catch (Exception e) {
			System.out.println("Error: >"+e);
		}
	}
}
