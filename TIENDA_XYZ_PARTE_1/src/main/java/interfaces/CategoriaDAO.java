package interfaces;

import java.sql.SQLException;
import java.util.List;
import model.Categoria;

public interface CategoriaDAO {

	// Metodos --> Público y abstractos
	
	public abstract String insertar(Categoria categoria) throws SQLException;
	
	public abstract List<Categoria> obtenerTodas() throws SQLException;
	
	public abstract String eliminar(int idCategoria) throws SQLException;
	
	public abstract Categoria obtenerPorId(int idCategoria) throws SQLException;
	
	public abstract String actualizar(Categoria categoria) throws SQLException;
}
