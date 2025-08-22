package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;


import model.Categoria;
import dao.CategoriaDAOImpl;
import interfaces.CategoriaDAO;


@WebServlet("/CategoriaController") // Este es el nombre único del Servlet
public class CategoriaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    	
    public CategoriaController() {
    }

    // INICIO DEL METODO doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equals("agregar")) {						
			request.getRequestDispatcher("categoriaForm.jsp").forward(request, response);
		}
		if(action.equals("mostrar")) {
			
			request.getRequestDispatcher("categoriaRead.jsp").forward(request, response);
		}
		if(action.equals("eliminar")) {
			// Declaracion de variables
			String msj = "";
			
			// Crear el acceso a datos DAO
			
			CategoriaDAO  dao = new CategoriaDAOImpl();
			
			try {
				msj = dao.eliminar(Integer.parseInt(request.getParameter("delete")));//  Metodo del dao Impl
			} catch (SQLException e) {
				System.out.print(e.getMessage());
			}
			// Redireccionamiento
			request.setAttribute("msj", msj );			
			request.getRequestDispatcher("categoriaDelete.jsp").forward(request, response);
		}
		if(action.equals("mostrarPorId")) {			
			// Declaracion de objetos
			
			Categoria objCate = new Categoria();
			// Crear el acceso a datos DAO
			
			CategoriaDAO  dao = new CategoriaDAOImpl();	
			
			try {
				objCate = dao.obtenerPorId(Integer.parseInt(request.getParameter("update")));//  Metodo del dao Impl
			} catch (SQLException e) {
				System.out.print(e.getMessage());
			}
			// Redireccionamiento
			request.setAttribute("objCate", objCate);
			request.getRequestDispatcher("categoriaFormPorId.jsp").forward(request, response);
		}
				
	}
	// FIN DEL METODO doGet

	
	// INICIO DEL METODO doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equals("crear"))
		{
			Categoria objCate = new Categoria();
			objCate.setNombre(request.getParameter("txtNombre"));
			
			// Declaracion de variables
			String msj = "";
			// Crear el acceso a datos DAO
			
			CategoriaDAO  dao = new CategoriaDAOImpl();
			
			try {
				msj = dao.insertar(objCate); //  Metodo del dao Impl
			} catch (SQLException e) {
				System.out.print(e.getMessage());
			}
			// Redireccionamiento
			request.setAttribute("msj", msj );
			request.getRequestDispatcher("categoriaCreate.jsp").forward(request, response);			
		}
		
		if(action.equals("actualizar")) {

			Categoria objCate = new Categoria();
			objCate.setIdCategoria(Integer.parseInt(request.getParameter("txtIdCategoria")));
			objCate.setNombre(request.getParameter("txtNombre"));
			
			// Declaracion de variables
			String msj = "";
			
			// Crear el acceso a datos DAO
			
			CategoriaDAO  dao = new CategoriaDAOImpl();
			try {
				msj = dao.actualizar(objCate); //  Metodo del dao Impl
			} catch (SQLException e) {
				System.out.print(e.getMessage());
			}
			// Redireccionamiento
			request.setAttribute("msj", msj );
			request.getRequestDispatcher("categoriaUpdate.jsp").forward(request, response);	
		}		
		
	}
	// FIN DEL METODO doPost
}







