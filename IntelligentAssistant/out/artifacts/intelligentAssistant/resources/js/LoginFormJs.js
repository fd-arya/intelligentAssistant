/**
 * Created by nader on 11/8/2016.
 */
function showLoginPanel(){
   /* $("#signInLogoMainPanel").animate({margin:"0 auto auto -90%"},1000,function () {

    });*/
   $("#signInMainPanel").animate({width:300,height:600},1000,function () {
       alert("is Down;")
   })
}
function loginMainPanelShow() {
    $( "#signInLogoBorderPanel" ).click(function() {
        $( "#topWrapperPanel" ).animate({
            opacity: 0.25,
            top: "-=50",
            height: "toggle"
        }, 5000, function() {
            // Animation complete.
        });
        $( "#bottomWrapperPanel" ).animate({
            opacity: 0.25,
            top: "+=50",
            height: "toggle"
        }, 5000, function() {
            // Animation complete.
        });
        $( "#signInLogoBorderPanel" ).animate({
            opacity: 0.25,
            top: "-=50",
            height: "toggle"
        }, 5000, function() {
            // Animation complete.
        });
        $( "#mainLoginForm" ).animate({
            opacity: 0.25,
            top: "-=50",
            height: "toggle"
        }, 5000, function() {
            // Animation complete.
        });
    });
    
}
