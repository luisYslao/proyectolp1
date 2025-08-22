<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">TIENDA XYZ</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
    
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
        </li>
        			        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Producto
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="productoForm.jsp">Agregar</a></li>
            <li><a class="dropdown-item" href="productoRead.jsp">Mostrar</a></li>
          </ul>
        </li>

        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Categoria
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="CategoriaController?action=agregar">Agregar</a></li>
            <li><a class="dropdown-item" href="CategoriaController?action=mostrar">Mostrar</a></li>
          </ul>
        </li>
        
        
      </ul>

      <ul class="navbar-nav ms-auto">
      
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hola, Jean
          </a>
          <ul class="dropdown-menu dropdown-menu-end">
            <li><a class="dropdown-item" href="#">Perfil: Vendedor</a></li>
            <li><a class="dropdown-item" href="#">Cambiar contraseña</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Cerrar Sesión</a></li>
          </ul>
        </li>
              
      </ul> 
      
        
    </div>
  </div>
</nav>