<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<!-- INICIO DEL HEAD -->
	<jsp:include page="head.jsp"></jsp:include>
	<!-- FIN DEL HEAD -->
	<body>
	<%
		
	%>
		<div class="container">
		
		<jsp:include page="nav.jsp"></jsp:include>
		
			<div class="row justify-content-center mt-3">
				<div class="col-lg-4 col-md-6 col-sm-12">
					<h1 class="text-center text-success">INGRESAR PRODUCTO</h1>
					<!-- INICIO DEL CONTENIDO -->
					
				        <form class="needs-validation" action="productoCreate.jsp" method="POST" novalidate>
				        
							<div class="form-floating mb-3">
							    <input type="text" class="form-control" name="txtNombre" placeholder="" required autofocus>
							    <label>NOMBRE</label>
							    <div class="invalid-feedback fw-bold fst-italic">Ingrese el nombre</div>
							</div>
						
							<div class="form-floating mb-3">
							    <input type="number" class="form-control" name="txtPrecio" min="0" step="0.01" placeholder="" required >
							    <label>PRECIO</label>
							    <div class="invalid-feedback fw-bold fst-italic">Ingrese el precio</div>							    
							</div>

							<div class="form-floating mb-3">
							    <input type="number" class="form-control" name="txtStock" min="0"  placeholder="" required >
							    <label>STOCK</label>
							    <div class="invalid-feedback fw-bold fst-italic">Ingrese el stock</div>							    
							</div>

							<div class="form-floating mb-3">
							  <select class="form-select" name="cboCategoria" >
								<%

								
								%>							    
							    <option value="<% %>"><% %></option>
								<%
								
								%>							    
							  </select>
							  <label>CATEGORIA</label>
							</div>
																										
				            <div class="mb-3">
				                <input class="btn btn-success w-100" type="submit" value="Guardar">
				            </div>
				            
				        </form>
				        
				      <!-- FIN DEL CONTENIDO -->
				</div>
			</div>
		</div>
	</body>	
	<!-- INICIO DEL FOOTER -->
		<jsp:include page="footer.jsp"></jsp:include>
	<!-- FIN DEL FOOTER -->
		
</html>	