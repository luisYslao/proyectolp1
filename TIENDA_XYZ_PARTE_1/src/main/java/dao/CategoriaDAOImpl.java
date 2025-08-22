package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConexionMYSQL;
import interfaces.CategoriaDAO;
import model.Categoria;

public class CategoriaDAOImpl implements CategoriaDAO {

	@Override
	public String insertar(Categoria categoria) throws SQLException {
		// 1.Obtener la conexion a la base de datos
		Connection con = ConexionMYSQL.obtenerConexion();
		
		// 2. Crea la la consulta SQL
		String sql = "INSERT INTO categoria (nombre_categoria) VALUES (?)";
		
		// 3.Crea la declaración (PreparStatement)
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, categoria.getNombre());
		// 4.Ejecutar
		int filasAfectadas = pstmt.executeUpdate();
		
		// 5. Mensaje a retornas
		String mensaje;
		
		if(filasAfectadas > 0) {
			mensaje = "Se registró correctamente";
		}else {
			mensaje = "Hubo un error";
		}	
		
		return mensaje;
	}

	@Override
	public List<Categoria> obtenerTodas() throws SQLException {
		List<Categoria> categorias = new ArrayList<>(); 
		
		// 1.Obtener la conexion a la base de datos
		Connection con = ConexionMYSQL.obtenerConexion();
		
		// 2. Crea la la consulta SQL
		String sql = "SELECT id_categoria,nombre_categoria FROM categoria";
		
		// 3.Crea la declaración (PreparStatement)
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// 4.Ejecutar
		ResultSet rs =  pstmt.executeQuery();
			
		while (rs.next()) {
			Categoria categoria = new Categoria();
			
			categoria.setIdCategoria(rs.getInt("id_categoria"));
			categoria.setNombre(rs.getString("nombre_categoria"));
			
			categorias.add(categoria);
		}
		
		return categorias;
	}

	@Override
	public String eliminar(int idCategoria) throws SQLException {
		// 1.Obtener la conexion a la base de datos
		Connection con = ConexionMYSQL.obtenerConexion();
		
		// 2. Crea la la consulta SQL
		String sql = "DELETE FROM categoria WHERE id_categoria = ?";
		
		// 3.Crea la declaración (PreparStatement)
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, idCategoria);
		
		// 4.Ejecutar
		int filasAfectadas = pstmt.executeUpdate();
		
		// 5. Mensaje a retornas
		String mensaje;
		
		if(filasAfectadas > 0) {
			mensaje = "Se eliminó correctamente";
		}else {
			mensaje = "Hubo un error";
		}	
		
		return mensaje;	
	}

	@Override
	public Categoria obtenerPorId(int idCategoria) throws SQLException {
		Categoria categoria = new Categoria();
		
		// 1.Obtener la conexion a la base de datos
		Connection con = ConexionMYSQL.obtenerConexion();
		
		// 2. Crea la la consulta SQL
		String sql = "SELECT id_categoria,nombre_categoria FROM categoria WHERE id_categoria = ?";
		
		// 3.Crea la declaración (PreparStatement)
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,idCategoria);
		
		// 4.Ejecutar
		ResultSet rs =  pstmt.executeQuery();
			
		while (rs.next()) {			
			categoria.setIdCategoria(rs.getInt("id_categoria"));
			categoria.setNombre(rs.getString("nombre_categoria"));			
		}
		
		return categoria;	
	}

	@Override
	public String actualizar(Categoria categoria) throws SQLException {
		// 1.Obtener la conexion a la base de datos
		Connection con = ConexionMYSQL.obtenerConexion();
		
		// 2. Crea la la consulta SQL
		String sql = "UPDATE categoria SET nombre_categoria = ? WHERE id_categoria = ?";
		
		// 3.Crea la declaración (PreparStatement)
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,categoria.getNombre());
		pstmt.setInt(2,categoria.getIdCategoria());
		
		// 4.Ejecutar
		int filasAfectadas = pstmt.executeUpdate();
		
		// 5. Mensaje a retornas
		String mensaje;
		
		if(filasAfectadas > 0) {
			mensaje = "Se actualizó correctamente";
		}else {
			mensaje = "Hubo un error";
		}	
		
		return mensaje;
	}	
}






















