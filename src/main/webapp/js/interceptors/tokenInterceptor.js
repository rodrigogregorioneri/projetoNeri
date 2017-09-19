angular.module("cronapp").factory("tokenInterceptor", function($q, $window, appConfig){
    return {
        request: function(config){
            
            var _auth = JSON.parse($window.localStorage.getItem("_u"));
            if(_auth) config.headers['Authorization'] = _auth.token_type + ' ' + _auth.access_token;            
            
            return config;
        }

    };
});