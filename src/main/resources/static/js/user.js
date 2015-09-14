var reverside = angular.module('reverside', ['ngRoute']);

reverside.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/userDetails', {
                    'templateUrl': '/html/users.html',
                    'controller': 'userCtrl'
                }).otherwise({
                    redirectTo: '/userDetails'
                });
    }]);


reverside.controller('userCtrl', function ($scope, $rootScope, $http) {

    $scope.init = function () {
        $scope.getUsers();
    };

    $scope.getUsers = function () {
        console.log('get products');
        $http({
            url: '/api/users',
            method: 'get'
        }).success(function (data, status) {
            if (status === 200) {
                console.log('retrived successfully');
                $rootScope.login = data;
            } else {
                console.log('status:' + status);
                $rootScope.error = "error status code : " + status;
                ;
            }
        }).error(function (error) {
            $rootScope.message = "Oops, we received your request, but there was an error processing it";
        });
    };

    $scope.closeNotification = function () {
        $rootScope.message = undefined;
    };
});



