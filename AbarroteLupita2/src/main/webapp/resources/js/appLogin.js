'use strict';
console.log("bu");
var app = angular
  .module('webappAppLogin', [
    'ngRoute',
    'ngTable',
    'ngResource',
    'ngRoute',
    'ngSanitize'
 
    
  ]).config(function ($routeProvider) {
	    $routeProvider
	    .when('/', {
	      	templateUrl: 'index.jsp',
	        //controller: 'mainCtrl'         
	      })	 
	      .when('/welcome', {
	        templateUrl: 'principal.jsp'	           
	      })	     
	      .otherwise({
	        redirectTo: '/'
	      });
  		}
  );
