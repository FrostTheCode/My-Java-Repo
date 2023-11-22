package Cenaduria_Trini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
Connection con;
	
	public Conexion() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CenaduriaPOS_v2","CenaduriaTrini","trini12345");
		}catch (Exception e) {
			System.out.println("No se pudo establecer conexion con la base de datos. Error: "+e);
		}
	}
	
	public Connection getConnection() {
		return con;
	}
	
}

