package com.codizer.db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
		java.sql.Connection con = null;

		try {
			try {
				System.out.println("Buscando el driver JDBC...");
				Class.forName("com.mysql.cj.jdbc.Driver"
				// "org.postgresql.Driver"
				// "oracle.jdbc.driver.OracleDriver"
				// "com.microsoft.sqlserver.jdbc.SQLServerDriver"
				// "org.firebirdsql.jdbc.FBDriver"
				).newInstance();
				System.out.println("...Encontró el driver JDBC");
			} catch (Exception e) {

				System.out.println("No pudo encontrar el driver JDBC !!!!");
				e.printStackTrace(System.out);
				return;

			}
			try {

				System.out.println("Connectando a la base de datos...");
				con = DriverManager.getConnection("jdbc:mysql://localhost/curso?user=curso&password=123"
				// "jdbc:postgresql://localhost/curso:5432","postgres","123"
				// "jdbc:oracle:thin:@192.168.0.10:1521/XE","curso","123"
				// "jdbc:sqlserver://192.168.0.100:1433/database=curso/user=curso/password=123"
				// "jdbc:firebirdsql:127.0.0.1:C:/firebird/data/curso.gdb","curso","123"
				);
				System.out.println("...Connectado a la base de datos");
			} catch (Exception e) {
				System.out.println("No pudo conectarse a la base de datos !!!!");
				e.printStackTrace(System.out);
				return;
			}

		} finally {

			System.out.println("Cerrando la conexion a la base de datos.");
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.println("Fin");

		}
	}
}
