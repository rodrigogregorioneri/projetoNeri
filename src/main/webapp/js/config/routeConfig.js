function config($stateProvider, $urlRouterProvider, $locationProvider) {

	$urlRouterProvider.otherwise("login");

	$stateProvider

	// PAI
	.state('index', {
		url : "/index",
		templateUrl : "views/common/content.html",
		controller : 'homeController'

	})

	.state('login', {
		url : "/login",
		templateUrl : "views/login.html",
		controller : 'loginController'
	})
      
      	.state('index.main', {
      		url : "/main",
      		templateUrl : "views/common/main.html",
      		controller : 'homeController'
      
      	})
      
      	.state('index.teste', {
      		url : "/teste",
      		templateUrl : "views/teste.html",
      		controller : 'homeController'
      	})

}

angular.module('cronapp').config(config).run(function($rootScope, $state) {

	$rootScope.$state = $state;
});