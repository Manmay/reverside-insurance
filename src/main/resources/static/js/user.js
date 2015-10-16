var reverside = angular.module('reverside', ['ngRoute']);

reverside.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/users', {
                    'templateUrl': '/html/users.html',
                    'controller': 'userCtrl'
                })
                .when('/claims', {
                    'templateUrl': '/html/claims.html',
                    'controller': 'claimCtrl'
                })
                .when('/claimDetails', {
                    'templateUrl': '/html/claimDetails.html',
                    'controller': 'claimDetailCtrl'
                })
                .when('/create-user', {
                    'templateUrl': '/html/create-user.html',
                    'controller': 'createCtrl'
                }).otherwise({
            redirectTo: '/claims'
        });
    }]);

reverside.controller('userCtrl', function ($scope, $rootScope, $http) {
    $scope.name;
    $scope.init = function () {
        $scope.name = 'Binod';
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
});

reverside.controller('createCtrl', function ($scope, $rootScope, $http) {


    $scope.userDetail = {};

    $scope.save = function (form) {

        if (form.$invalid) {
            console.log("Form Validation Failure");
        } else {
            $http({
                url: '/api/create-user',
                method: 'post',
                headers: {
                    'Content-Type': 'application/json'
                },
                data: $scope.userDetail
            }).success(function (data, status) {
                if (status === 200) {
                    console.log('Datas saved sucessfully');
                    alert("Data saved");
                } else {
                    console.log('status:' + status);
                }
            }).error(function (error) {
                console.log(error);
                $rootScope.message = error;
            });
        }

    };
});

reverside.controller('claimCtrl', function ($scope, $rootScope, $http) {
    $scope.clientDetails = {};

    $scope.policy = function () {
        console.log('get products');
        $http({
            url: '/api/clients/' + $scope.clientDetails.id,
            method: 'get'
        }).success(function (data, status) {
            if (status === 200) {
                console.log('retrived successfully');
                $scope.clientDetails = data;
            } else {
                console.log('status:' + status);
                $rootScope.error = "error status code : " + status;
                ;
            }
        }).error(function (error) {
            $rootScope.message = "Oops, we received your request, but there was an error processing it";
        });
    };

    $scope.clientDetails = {};

    $scope.claim = function (form) {

        if (form.$invalid) {
            console.log("Form Validation Failure");
        } else {
            $http({
                url: '/api/claims',
                method: 'post',
                headers: {
                    'Content-Type': 'application/json'
                },
                data: $scope.clientDetails
            }).success(function (data, status) {
                if (status === 201) {
                    console.log('Datas saved sucessfully');
                    alert("Claim Logged");
                } else {
                    console.log('status:' + status);
                    alert("error: " + status);
                }
            }).error(function (error) {
                console.log(error);
                alert("function error: " + error);
                $rootScope.message = error;
            });
        }

    };
});
