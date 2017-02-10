/**
 * Created by nader on 11/10/2016.
 */
var isShowingMenuItemsList = false;
/*
$( window ).scroll(function() {
    $("#topPanel").switchClass( "big", "blue", 1000, "easeInOutQuad" );});
*/
$.getScript('../resources/js/jquery.full.screen.js', function () {
    $('[data-toggle="fullscreen"]').fullscreen();
});
function selectionItem(item) {

    var selectedItem = '#' + item;
    $('.activeItem').removeClass().attr("role", "presentation");
    $(selectedItem).attr("role", "");
    $(selectedItem).addClass("activeItem");
    switchPanel(item);


 $("#menuItems").show(100,function () {
       $("#menuItems").animate({
           opacity: 1,
           height: 400,
           width:'100%'

       }, 1000, function () {
           isShowingMenuItemsList = true;
       });
   });

}
function  closeMenuItemsList(){

    if( isShowingMenuItemsList ){
        $("#menuItems").hide(100,function () {
            $("#menuItems").animate({
                opacity: 0,
                height: 0,
                width:0

            }, 100, function () {

            });
        });
        isShowingMenuItemsList = false;
    }
}
function  switchPanel(item){

    $('[data-toggle="subMenu"]').hide();
    switch(item){
        case "homeMenuItem":{
            $("#homeSubMenu").show();
            break;
        }
        case "accountMenuItem":{
            $("#accountSubMenu").show();
            break;
        }
        case "medicineMenuItem":{
            $("#medicineSubMenu").show();
            break;
        }
        case "financialMenuItem":{
            $("#financialSubMenu").show();
            break;
        }
        case "scrumMenuItem":{
            $("#scrumSubMenu").show();
            break;
        }
        case "reportsMenuItem":{
            $("#reportsSubMenu").show();
            break;
        }
        case "remindersMenuItem":{
            $("#remindersSubMenu").show();
            break;
        }

    }
    /*switch(item){
        case "homeMenuItem":{
     datatype="subMenu"
            $("#homeSubMenu").removeClass();
            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")

            break;
        }
        case "accountsMenuItem":{
            $("#accountSubMenu").removeClass();

            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")
            break;
        }
        case "medicineMenuItem":{
            $("#medicineSubMenu").removeClass();

            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")
            break;
        }
        case "financialMenuItem":{
            $("#financialSubMenu").removeClass();

            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")
            break;
        }
        case "scrumMenuItem":{
            $("#scrumSubMenu").removeClass();

            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")
            break;
        }
        case "reportsMenuItem":{
            $("#reportsSubMenu").removeClass();

            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            $("#remindersSubMenu").removeClass().addClass("hiddenItems")
            break;
        }
        case "remindersMenuItem":{
            $("#remindersSubMenu").removeClass();

            $("#reportsSubMenu").removeClass().addClass("hiddenItems")
            $("#scrumSubMenu").removeClass().addClass("hiddenItems")
            $("#financialSubMenu").removeClass().addClass("hiddenItems")
            $("#medicineSubMenu").removeClass().addClass("hiddenItems")
            $("#accountSubMenu").removeClass().addClass("hiddenItems")
            $("#homeSubMenu").removeClass().addClass("hiddenItems")
            break;
        }

    }*/
}

