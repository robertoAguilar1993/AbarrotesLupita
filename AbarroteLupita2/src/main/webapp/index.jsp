<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
  
<title>Index</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/css/simple-sidebar.css" rel="stylesheet">

<script src="bower_components/jquery/dist/jquery-1.11.2.min.js"></script>
		<script src="bower_components/jquery/dist/jquery-migrate-1.2.1.min.js"></script>
		<script src="bower_components/angular/angular.js"></script>
		<script src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
		<script src="bower_components/angular-cookies/angular-cookies.js"></script>
		<script src="bower_components/angular-resource/angular-resource.js"></script>
		<script src="bower_components/angular-route/angular-route.js"></script>
		<script src="bower_components/angular-sanitize/angular-sanitize.js"></script>
		<script src="bower_components/ngprogress/build/ngProgress.min.js"></script>
		<script src="bower_components/ui-bootstrap-tpls-0.12.0.min.js"></script>
		<script src="bower_components/ng-table/ng-table.js"></script>
		<script src="bower_components/ng-table/angu-fixed-header-table.js"></script>
		

<script src="resources/js/app.js"></script>
<script src="resources/js/pagesJS/welcome/welcome.js"></script>
<script src="resources/js/pagesJS/employee/employee.js"></script>
</head>
<body ng-app="webappApp">

	<div id="wrapper">
		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="#"> Menu </a></li>
				<li><a>Seguridad</a></li>
				<li><a href="#/welcome"> - Usuarios</a></li>
				<li><a href="#/empleados"> - Empleados</a></li>
				<li><a href="#"> - Permisos Por Rol</a></li>

				<li><a>Administracion</a></li>
				<li><a href="#/parametros"> - Parametros de Sistemas</a></li>

			</ul>
		</div>
		<!-- /#sidebar-wrapper -->
		<nav class="navbar navbar-inverse">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			aria-controls="navbarToggleExternalContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		   <a href="#menu-toggle" class="btn " id="menu-toggle">Menu</a>	
		    
		</nav>
		
		<button type="button" class="btn btn-default btn-xs">
    <span class="glyphicon glyphicon-star"></span> Star
  </button>

		<!-- /#page-content-wrapper --
        <!-- Page Content -->
		<div class="center" ng-view=""></div>

		<!-- /#wrapper -->
		<!-- Menu Toggle Script -->
		<script>
			$("#menu-toggle").click(function(e) {
				e.preventDefault();
				$("#wrapper").toggleClass("toggled");
			});
		</script>
		<!-- jQuery -->
    <script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>