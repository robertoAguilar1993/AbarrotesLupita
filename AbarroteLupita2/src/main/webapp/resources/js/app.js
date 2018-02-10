'use strict';
var app = angular
  .module('webappApp', [
    'ngRoute',
    'ngTable',
    'ngResource',
    'ngRoute',
    'ngSanitize'
    
  ]).config(function ($routeProvider) {
	    $routeProvider
	    .when('/', {
	        templateUrl: 'principal.html',	     
	      })
	      .when('/welcome',{
	    	     templateUrl: 'resources/pages/welcome/welcome.jsp',
		     controller: 'welcomeCtrl'	    
	      })
	      .when('/empleados',{
	    	     templateUrl: 'resources/pages/employee/employee.jsp',
		     controller: 'employeeCtrl'	    
	      })
	      .when('/administracionProcesos',{
	    	     templateUrl: 'administracion/administracion-Procesos/procesos.html',
		     controller: 'procesosCtrl'	    
	      })	    
	      .otherwise({
	        redirectTo: '/'
	      });	    	    
  		}
  );


