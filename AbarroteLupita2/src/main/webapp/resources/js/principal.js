var app = angular
  .module('webappApp', [
    'ngRoute',
    'ngTable',
    'ngResource',
    'ngRoute',
    'ngSanitize'  
  ]);
  app.controller ('myCtrl',['$http','$location', function ($http,$location){
		console.log("Entrando welcome");	
		
		
}]);