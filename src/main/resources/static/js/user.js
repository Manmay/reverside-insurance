<<<<<<< HEAD
var reverside = angular.module('reverside', ['ngRoute']);

reverside.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/userDetails', {
                    'templateUrl': '/html/users.html',
                    'controller': 'userCtrl'
                })
                .when('/submitClaim', {
                    'templateUtl': '/html/claims.html',
                    'controller': 'claimCtrl'
                })
                .otherwise({
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
reverside.controller('claimCtrl', function($scope,$rootscope,http){
    $scope.claim = function(){
        
    };
});



=======
var reverside = angular.module('reverside', ['ngRoute']);

reverside.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/users', {
                    'templateUrl': '/html/users.html',
                    'controller': 'userCtrl'
                })
                .when('/create-user', {
                    'templateUrl': '/html/create-user.html',
                    'controller': 'createCtrl'
                }).otherwise({
                    redirectTo: '/users'
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


       $scope.userDetail={};
       
    $scope.save  = function (form) {
      
       if (form.$invalid) {
			console.log("Form Validation Failure");
		} else {
			$http({
				url: '/api/create-user',
				method: 'post',
				headers: {
					'Content-Type': 'application/json',
				},
				data: $scope.userDetail
			}).success(function (data, status) {
				if (status === 200) {
					console.log('Datas saved sucessfully');
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


>>>>>>> 37a1cc0b5adc6dba90c7d8b539aa798caa57494d
