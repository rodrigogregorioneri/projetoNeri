angular.module("cronapp").factory("errorInterceptor", function ($q,$window, $location, $state) {
	return {
		responseError: function (rejection) {

			//console.log(rejection);

			if (rejection.status === 401) { //Authorization error
				//console.log(rejection);
				$state.go("index.main");
			//	$window.location.href = "login.html";
				
			}
            else if(rejection.status === 500){ // internal server error
                //$location.path("/error500");
            }
			else if(rejection.status === 404){
				//$location.path("/error404");
			}
			return $q.reject(rejection);
		}
	};
});