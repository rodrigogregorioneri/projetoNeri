angular
		.module("cronapp")
		.controller(
				"loginController",
				function($scope, $window, $http, $rootScope, $state, $location) {
				  $scope.mensagem = null;
				  var url = $location.absUrl().split("#");
				  var url = url[0];
				//  console.log(url);

					var _login = function(user) {
						var user = {
							username : $scope.username,
							password : $scope.password
						};
						var opt = {
							method : 'POST',
							url : url+"auth?username="
									+ user.username
									+ "&password="
									+ user.password,
							headers : {
								'Content-Type' : 'application/x-www-form-urlencoded'
							}
						};
						return $http(opt);
					};

					var _getAppUser = function(user) {
						return $http.get(appConfig.baseUrl
								+ "/Account/Get?email=" + user.email
								+ "&password=" + user.password);
					};

					$scope.login = function(user) {


						$scope.loading = true;

						_login(user).then(
								function(data) {
                   
									if (typeof (Storage) !== "undefined") {

										sessionStorage.setItem("_cron", JSON
												.stringify(data));
										$rootScope.session = JSON
												.parse(sessionStorage._cron);
												
									} else {

									}
									$state.go("index.main");
									
								}, function(data) {
								  $scope.mensagem = data.data.message;
								//	$state.go("index.login");
								});
					};
				});