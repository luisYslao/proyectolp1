package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public  class  ConexionMYSQL {
	
	// ATRIBUTOS
   private static final String HOST = "localhost";      
   private static final String PUERTO = "3306";       
   private static final String BASE_DE_DATOS = "db_tienda"; 
   private static final String USUARIO = "root";   
   private static final String CONTRASENA = ""; 
   private static final String URL = "jdbc:mysql://" + HOST + ":" + PUERTO + "/" + BASE_DE_DATOS + "?serverTimezone=America/Lima";
	//METODOS
	public static Connection obtenerConexion() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL,USUARIO,CONTRASENA);		
		} catch (ClassNotFoundException e) {
			throw new SQLException("Error: No se pudo cargar el JDBC" , e );
		}
	}
	
}
