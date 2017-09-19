angular
		.module("cronapp")
		.controller(
				"loginController",
				function($scope, $window, $http, $rootScope, $state, $location) {

					var _login = function(user) {
						var user = {
							username : $scope.username,
							password : $scope.password
						};
						var opt = {
							method : 'POST',
							url : "https://app-11-220-16740.ide.cronapp.io/auth?username="
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

						//ladda button spin
						$scope.loading = true;

						_login(user).then(
								function(data) {

									//set auth info to session
									// baseService.setAuth(data);

									/*      _getAppUser(user).then(function (appUser){                        
									              //set appuser info to session
									              baseService.setUser(appUser);
									              $window.location.href = "index.html";
									          },function(data){
									              clearSession();
									              $scope.errorMessage = 'Sorry, something weird went wrong. Please try it again later!';
									              $scope.loading = false;
									          })*/
									if (typeof (Storage) !== "undefined") {
										// save the user data on localStorage
										sessionStorage.setItem("_u", JSON
												.stringify(data));
										$rootScope.session = JSON
												.parse(sessionStorage._u);
												$state.go("index.main");
									} else {
										// Sorry! No Web Storage support.
										// The home page may not work if it depends
										// on the logged user data
									}
									
								}, function(data) {
									$state.go("index.login");
								});

					};

					/*
					
					$scope.login = function() {
						  
						 var baseUrl = "https://app-11-220-16740.ide.cronapp.io/auth";

							var user = {
								username : $scope.username.value,
								password : $scope.password.value
							};



							$http({
								method : 'POST',
								url : "https://app-11-220-16740.ide.cronapp.io/auth",
								data : $.param(user),
								headers : {
									'Content-Type' : 'application/x-www-form-urlencoded'
								}
							}).then(handleSuccess,handleError);
							
							
							
						//	.success(handleSuccess).error(handleError);

							function handleSuccess(data, status, headers, config) {

								if (typeof (Storage) !== "undefined") {

									localStorage.setItem("_u", JSON.stringify(data));
									$rootScope.session = JSON.parse(sessionStorage._u);
								} else {

								}


								$state.go("index.main");
							}

							function handleError(data, status, headers, config) {
								var error = status == 401 ? $translate
										.instant('Login.view.invalidPassword') : data;
					
							}

						}*/

				});