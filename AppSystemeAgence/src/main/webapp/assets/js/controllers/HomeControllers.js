'use strict';

angular.module('Home')

.controller('HomeController',
    ['$scope',
    function ($scope) {
    	
    	$scope.indice = true;
    	console.log("homecontroller"+$scope.indice);
    }]);