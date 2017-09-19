angular.module("cronapp").config(function ($httpProvider) {
	$httpProvider.interceptors.push('errorInterceptor');     
});