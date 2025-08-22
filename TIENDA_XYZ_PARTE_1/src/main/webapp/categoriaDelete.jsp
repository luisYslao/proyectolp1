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
				<div class="col-lg-5 col-md-6 col-sm-12">
					<h1 class="text-center text-danger">ELIMINAR PRODUCTO</h1>
					<!-- INICIO DEL CONTENIDO -->
	
					<div class="alert alert-danger text-center" role="alert">
					
					  <%= request.getAttribute("msj")  %>
					  
					  ${msj}
					  
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