var arealistArray=[];
$scope.arealist=[]; 

Then push a value into array.

angular.forEach(response, function(data){
       arealistArray.push(data.area_name);
  });

Finally Assign the array to scope variable.

$scope.arealist=arealistArray;








<ion-item class="item item-thumbnail-left" menu-close ui-sref="app.user.profile({objId: userId})" >  
              <img ng-src="../img/{{user.picProfile}}" style="border-radius:50%;">                
              <p><h2>{{user.firstName}} {{user.lastName}}</h2></p> 
</ion-item>


$cordovaCamera.getPicture(options).then(function(imageData) {
   var image = document.getElementById('myImage');
   image.src = "data:image/jpeg;base64," + imageData;
});


.factory('userService', function($http) {
	var users = [];

	return {
		getUsers: function(){
                 ------
			return $http.get("https://www.yoursite.com/users").then(function(response){
				users = response;
				return users;
			});
		}
	}
})

.controller('MainCtrl', function($scope, userService) {
	userService.getUsers().then(function(users){
                    -----
		$scope.users = users;
	});
})

https://cordova.apache.org/plugins/?platforms=cordova-windows    ---see for all plugins explanarion

cordova plugin add cordova-plugin-facebook4 --save --variable APP_ID="123456789" --variable APP_NAME="myApplication"   ----------comment to install plugin for facebook


https://github.com/nraboy/ng-cordova-facebook-example     ---github code for facebook integration




E:\DOIN\doInsport\doInsport>ionic plugin list
cordova-plugin-actionsheet 2.3.3 "ActionSheet"
cordova-plugin-app-event 1.2.0 "Application Events"
cordova-plugin-appavailability 0.4.2 "AppAvailability"
cordova-plugin-camera 2.3.1 "Camera"
cordova-plugin-compat 1.1.0 "Compat"
cordova-plugin-console 1.0.5 "Console"
cordova-plugin-contacts 2.2.1 "Contacts"
cordova-plugin-datepicker 0.9.3 "DatePicker"
cordova-plugin-device 1.1.4 "Device"
cordova-plugin-facebook4 1.7.4 "Facebook Connect"
cordova-plugin-file 4.3.1 "File"
cordova-plugin-file-transfer 1.6.1 "File Transfer"
cordova-plugin-geolocation 2.4.1 "Geolocation"
cordova-plugin-google-analytics 1.7.4 "Google Universal Analytics Plugin"
cordova-plugin-inappbrowser 1.5.0 "InAppBrowser"
cordova-plugin-splashscreen 4.0.1 "Splashscreen"
cordova-plugin-statusbar 2.2.1 "StatusBar"
cordova-plugin-whitelist 1.3.1 "Whitelist"
cordova-plugin-x-socialsharing 5.1.6 "SocialSharing"
cordova-plugin-x-toast 2.5.2 "Toast"
cordova.plugins.diagnostic 3.3.3 "Diagnostic"
de.appplant.cordova.plugin.local-notification 0.8.4 "LocalNotification"
ionic-plugin-keyboard 2.2.1 "Keyboard"
//plugin list


https://www.tutorialspoint.com/cordova/cordova_media.htm     ---cordova tutoirla

 
https://forum.ionicframework.com/t/cordovaoauth-facebook-and-googleplus-problems/28860  --facebook goolge login example

http://stackoverflow.com/questions/31490439/angularjs-facebook-login-fetch-user-data   facebook login sample


http://www.gajotres.net/using-smartphone-camera-with-ionic-framework/  see very useful sample codes


https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage   ----this for storage tutorial


https://www.toptal.com/web/cookie-free-authentication-with-json-web-tokens-an-example-in-laravel-and-angularjs -----json web token laravel


https://docs.angularjs.org/api/ng/service/$http --just see for angular all directives

https://github.com/akveo/chernika-mobile/tree/master/plugins/cordova.plugins.diagnostic     \
http://stackoverflow.com/questions/31836492/add-cordova-diagnostic-plugin-in-ionic           \this is all for cordova plugins
https://www.npmjs.com/package/cordova.plugins.diagnostic.api-22				     \
https://github.com/dpa99c/cordova-diagnostic-plugin#requestcamerarollauthorization	      \

cordova plugins add cordova-plugin-apprate   --save --------toa dd plugins 

cordova plugin remove cordova-plugin-apprate --save  ---to remove plugins



	.state('myloginpa', {
		cache: false,
		url: "/myloginpage",
		templateUrl: "templates/mylogin.html",
		controller:"MyLog",
	})

	// if none of the above states are matched, use this as the fallback
	$urlRouterProvider.otherwise("/myloginpage");
	
.controller('MyLog', function( $scope){
	console.log("test");

});



https://www.joshmorony.com/user-authentication-with-ionic-and-parse-part-1-email-login/

sample html to check whether the page is loaded r not


<ion-view  >

	<ion-content >
		
 <label class="item item-input">
  <span class="input-label">Username</span>
  <input type="text">
</label> 
ghjghkhkj

	</ion-content>
</ion-view>


