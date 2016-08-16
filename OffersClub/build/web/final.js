app = angular.module("of",['ngMaterial']);

app.config(function($mdThemingProvider){
  $mdThemingProvider.theme('myCreated')
          .primaryPalette('lime')
          .accentPalette('deep-orange')
          .warnPalette('yellow');
  $mdThemingProvider.setDefaultTheme('myCreated');
});

app.controller("check",check);

function check($scope,$http){
    $scope.go = function (){
      var go = $http({
          method:'POST',
          url:'/addentry/pp',
	  data : $scope.abc
      })  ;
        
    };
    
}