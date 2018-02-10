'use strict';
angular.module('webappApp').controller(
		'employeeCtrl',
		[
				'$scope',
				'$http',
				'ngTableParams',
				'$filter',
				'$location',
				'$timeout',
				function($scope, $http, ngTableParams, $filter, $location,
						$timeout) {
					
					$scope.tabla ={};
					$scope.tabla.area=[];
					$scope.registroArea = [];
					$scope.registroArea2 = [];
					$scope.registroArea = {
							idArea : '',
					        cveArea: '',
					        cveEstatus: '',
					        dsArea: ''
					};
					
					console.log("entrando en employee");

					$scope.table = {};
					$scope.mostrarTablaArea = function() {
						$scope.tabla.area = [];

						console.log("Mostrar tabla.....Pasiente");
						$http({
							method : "GET",
							url : "services/employee/getListEmployee"
						}).success(function(data) {
							console.log("Obteniendo datos para la tabla");
							console.log(data);
						});
					}
					$scope.mostrarTablaArea();
					$scope.filters = {
						myfilter : ''
					};

					$scope.tableParams = new ngTableParams({
						page : 1, // show first page
						count : 10,
						filter : $scope.filters,
						sorting : {
						// initial sorting

						}
					}, {
						count : [], // here put empty counts
						total : $scope.tabla.area.length, // length of data
						getData : function($defer, params) {

							var filteredData = params.filter() ? $filter(
									'filter')($scope.tabla.area,
									params.filter().myfilter) : data;
							var orderedData = params.sorting() ? $filter(
									'orderBy')(filteredData, params.orderBy())
									: data;
							params.total(orderedData.length); // set total for
																// recalc
																// pagination
							$defer.resolve(orderedData.slice(
									(params.page() - 1) * params.count(),
									params.page() * params.count()));
						},
						$scope : {
							$data : {}
						}

					});

					$scope.$watch("tabla.area", function() {
						$scope.tableParams.reload();

					})
				} ]);