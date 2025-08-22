<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
	<!-- INICIO DEL HEAD -->
	<jsp:include page="head.jsp"></jsp:include>
	<!-- FIN DEL HEAD -->
	<body>

		<div class="container">
		
		<jsp:include page="nav.jsp"></jsp:include>
		
			<div class="row justify-content-center mt-3">
				<div class="col-lg-4 col-md-6 col-sm-12">
					<h1 class="text-center text-success">INGRESAR CATEGORIA</h1>
					<!-- INICIO DEL CONTENIDO -->
					
				        <form class="needs-validation" action="CategoriaController" method="POST" novalidate>
				        
							<input type="hidden" name="action" value="crear">	
												        
							<div class="form-floating mb-3">
							    <input type="text" class="form-control" name="txtNombre" placeholder="" required autofocus>
							    <label>NOMBRE</label>
							    <div class="invalid-feedback fw-bold fst-italic">Ingrese el nombre</div>
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