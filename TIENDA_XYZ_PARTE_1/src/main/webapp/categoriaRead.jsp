<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page import="model.Categoria"%>
<%@page import="interfaces.CategoriaDAO"%>
<%@page import="dao.CategoriaDAOImpl"%>

<!DOCTYPE html>
<html>
	<!-- INICIO DEL HEAD -->
	<jsp:include page="head.jsp"></jsp:include>
	<!-- FIN DEL HEAD -->
	<body>

		<div class="container">
		
		<jsp:include page="nav.jsp"></jsp:include>
	
			<div class="row justify-content-center mt-3">
				<div class="col-lg-6 col-md-6 col-sm-12">
					<h1 class="text-center text-primary">MOSTRAR CATEGORIA</h1>
					<!-- INICIO DEL CONTENIDO -->

	                <div class="table-responsive">
		                <table class="table table-bordered table-hover">
					        <thead class="table-custom">
					          <tr class="table-light">
					            <th>N°</th>
					            <th>NOMBRE</th>
					            <th>Editar</th>
					            <th>Eliminar</th>
					          </tr>
					        </thead>
					        
					        <tbody>                
							<%
							// Crear el acceso a datos DAO
							
							CategoriaDAO  dao = new CategoriaDAOImpl();
							
							
							for (Categoria c : dao.obtenerTodas() )
							{
							%>
							<tr>
								<td><%= c.getIdCategoria() %></td>
		                        <td><%= c.getNombre() %></td>		
		                        
		                        <td class="text-center">
		                        	<a href="CategoriaController?update=<%= c.getIdCategoria() %>&action=mostrarPorId">
		                        		<i class="bi bi-pencil-square text-warning"></i>
		                        	</a>
		                        </td>
		                        
		                        <td class="text-center">
		                        	<a href="CategoriaController?delete=<%= c.getIdCategoria() %>&action=eliminar"><i class="bi bi-trash text-danger"></i></a>
		                        </td>
		                        							
							</tr>				
							<%
							}
							%>
							<tbody>
						</table>
					</div>
					
					
				    <!-- FIN DEL CONTENIDO -->
				</div>
			</div>
		</div>
	</body>	
	<!-- INICIO DEL FOOTER -->
		<jsp:include page="footer.jsp"></jsp:include>
	<!-- FIN DEL FOOTER -->
		
</html>						