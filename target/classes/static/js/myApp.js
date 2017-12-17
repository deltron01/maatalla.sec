var myApp = angular.module("myApp",[]);
myApp.controller("InscriptionController", function($scope, $http) {
	
	$scope.etudiant = {};
	$scope.errors = 
	
	$scope.saveEtudiant = function() {
		$http.post("/etudiants", $scope.etudiant)
		   .succes(function(data) {
			  if(!data.errors){
				  $scope.etudiant = data; 
				  $scope.errors = null;
			  }else {
				  $scope.errors = data;
				  $scope.etudiant = null;
			  }
			  
		});
	};
	
});