angular
		.module("cronapp")
		.controller(
				"homeController",
				function($scope, $window, $http, $rootScope, $state, $location) {

 // refresh token
        $scope.refreshToken = function() {
            $http({
                method: 'GET',
                url: 'auth/refresh'
            }).success(function(data, status, headers, config) {
                // Store data response on session storage
                  console.log('revive :' , new Date(data.expires));
                  sessionStorage.setItem("_u",JSON.stringify(data));
                  // Recussive 
                  setTimeout(function() {
                    $scope.refreshToken();
                    // refres time
                  },(1800*1000));
                  
            }).error(function() {
              // abafar TODO 
            });
        };

        $rootScope.session = (sessionStorage._u) ? JSON.parse(sessionStorage._u) : null;
        if($rootScope.session) {
          if ($rootScope.session.token) $scope.refreshToken();
        } else {
          $state.go("index.login");
          sessionStorage.removeItem("_u");
        }
        
        $rootScope.logout = function logout() {
          $rootScope.session = {};
          if(typeof (Storage) !== "undefined") {
            // save the user data on localStorage
            sessionStorage.removeItem("_u");
          }
          $state.go("index.login");
        };
        
	});        