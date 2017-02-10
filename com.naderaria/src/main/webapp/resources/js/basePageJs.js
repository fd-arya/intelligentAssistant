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
var buttonArrayList = [];
var buttonSelectionName = null;

function createButtonList(){
	
	buttonArrayList[0] = "testIcon1";
	buttonArrayList[1] = "testIcon2";
	buttonArrayList[2] = "testIcon3";
	buttonArrayList[3] = "testIcon4";
	buttonArrayList[4] = "testIcon5";
	buttonArrayList[5] = "testIcon6";
	
}

function menuButtonHover(buttonName){
	
	var buttonNameId ="#"+ buttonName;
	var btnSelectedIndex = -1;
	for(var i= 0 ; i< buttonArrayList.length;i++){
		if( buttonArrayList[i] == buttonName ){
			hoverEffect(buttonNameId);
			var nextLevelOne = i+1;
			if( nextLevelOne < buttonArrayList.length ){
				var nextBtnLevelOne ="#"+buttonArrayList[nextLevelOne];
				if( buttonSelectionName == null || buttonSelectionName != nextBtnLevelOne ){
					levelOneEffect(nextBtnLevelOne);
				}
			}
			var perviousLevelOne = i-1;
			if(perviousLevelOne > -1 ){
				var perviousBtnLevelOne ="#"+buttonArrayList[perviousLevelOne];
				if( buttonSelectionName == null || buttonSelectionName != perviousBtnLevelOne ){
					levelOneEffect(perviousBtnLevelOne);
				}
			}
			
			var nextLevelTwo = i+2;
			if( nextLevelTwo < buttonArrayList.length ){
				var nextBtnLevelTwo ="#"+buttonArrayList[nextLevelTwo];
				if( buttonSelectionName == null || buttonSelectionName != nextBtnLevelTwo ){
					levelTwoEffect(nextBtnLevelTwo);
				}
			}
			var perviousLevelTwo = i-2;
			if(perviousLevelTwo > -1 ){
				var perviousBtnLevelTwo ="#"+buttonArrayList[perviousLevelTwo];
				if( buttonSelectionName == null || buttonSelectionName != perviousBtnLevelTwo ){
					levelTwoEffect(perviousBtnLevelTwo);
				}
			}
			
			var nextLevelTree = i+3;
			if( nextLevelTree < buttonArrayList.length ){
				var nextBtnLevelTree ="#"+buttonArrayList[nextLevelTree];
				if( buttonSelectionName == null || buttonSelectionName != nextBtnLevelTree ){
					levelTreeEffect(nextBtnLevelTree);
				}
			}
			var perviousLevelTree = i-3;
			if(perviousLevelTree > -1 ){
				var perviousBtnLevelTree ="#"+buttonArrayList[perviousLevelTree];
				if( buttonSelectionName == null || buttonSelectionName != perviousBtnLevelTree ){
					levelTreeEffect(perviousBtnLevelTree);
				}
			}
			
			
						
		}
	}
}

function hoverEffect(buttonId){
	$(buttonId).animate({
        opacity: 1,
        height:45,
        width: 45},50);
}

function leveEffectAllButton(){
	if( buttonArrayList != null || buttonArrayList != undefined || buttonArrayList.length != 0 ){
		for( var i=0;i<buttonArrayList.length; i++){
			var buttonId ="#"+buttonArrayList[i];
			$(buttonId).animate({
				opacity: 0.25,
				height:20,
				width:20},2);
			
		}
	}
	
}

function levelOneEffect(buttonId){
	$(buttonId).animate({
        opacity: 0.75,
        height:40,
        width: 40},40);
}

function levelTwoEffect(buttonId){
	$(buttonId).animate({
        opacity: 0.5,
        height:35,
        width: 35},30);
}

function levelTreeEffect(buttonId){
	$(buttonId).animate({
        opacity: 0.25,
        height:20,
        width: 20},20);
}

function showMenuList(buttonName , panelName){
	var buttonId ="#"+buttonName;
	var panelNameId ="#"+panelName;
	buttonSelectionName = buttonId;
	$(buttonId).animate({
        opacity: 1,
        height:45,
        width: 45},50);
	 $(panelNameId).show(100,function(){
		 $(panelNameId).animate({
			 display :'block',
			 opacity: 1,
			 height:400,
			 width:200},200);
		 });
  

}

function closeMenuList(panelName){
	var panelNameId ="#"+panelName;
	$(panelNameId).hide(10,function(){
		 $(panelNameId).animate({
			 opacity: 0,
			 height:0,
			 width:0},2,leveEffectAllButton());
		 });
	buttonSelectionName = null;
}


