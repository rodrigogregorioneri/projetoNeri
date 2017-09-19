angular.module("cronapp").factory("accountService", function ($http, appConfig){
    //---------------------------------------------------------------------------------------
    var _login = function(user){
        var opt = {
            method: 'POST',
            url: appConfig.tokenUrl,            
            data: "username=email|"+ user.email + "&password=" + user.password + "&grant_type=password",            
        };
        return $http(opt);
    };
    //---------------------------------------------------------------------------------------
    var _getAppUser = function(user){
        return $http.get(appConfig.baseUrl + "/Account/Get?email=" + user.email + "&password=" + user.password);
    };
    //---------------------------------------------------------------------------------------
    return {
        login: _login,
        getAppUser : _getAppUser
    };
    //---------------------------------------------------------------------------------------

});