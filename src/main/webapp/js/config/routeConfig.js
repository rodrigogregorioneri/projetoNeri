function config($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise("/index");

	$stateProvider



// PAI
	.state('index', {
		url : "/index",
		templateUrl : "views/common/content.html"

	})

      	.state('index.main', {
      		url : "/main",
      		templateUrl : "views/common/main.html"
      
      	})

      	.state('index.login', {
      		url : "/login",
      		templateUrl : "views/login.html",
      	})
      
      	.state('index.teste', {
      		url : "/teste",
      		templateUrl : "views/teste.html",
      	})

}

angular.module('cronapp').config(config).run(function($rootScope, $state) {

	$rootScope.$state = $state;
});