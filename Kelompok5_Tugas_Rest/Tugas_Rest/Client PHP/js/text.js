$(document).ready(function () {
	"use strict";

	$("#1").click(function() {
		$("#indextext").hide();
		$("#foodP").hide();
		$("#entertainmentP").hide();
		$("#activitiesP").show();
		//change opacity of the pic
		$("#1").css({"filter": "opacity(70%) blur(1px)"});
		$("#2").css({"filter": "none"});
		$("#3").css({"filter": "none"});
	});

	$("#2").click(function() {
		$("#indextext").hide();
		$("#activitiesP").hide();
		$("#entertainmentP").hide();
		$("#foodP").show();
		//change opacity of the pic
		$("#2").css({"filter": "opacity(70%) blur(1px)"});
		$("#1").css({"filter": "none"});
		$("#3").css({"filter": "none"});
	});

	$("#3").click(function() {
		$("#indextext").hide();
		$("#activitiesP").hide();
		$("#foodP").hide();
		$("#entertainmentP").show();
		//change opacity of the pic
		$("#3").css({"filter": "opacity(70%) blur(1px)"});
		$("#2").css({"filter": "none"});
		$("#1").css({"filter": "none"});
	});

	$(".back").click(function() {
		$("#indextext").show();
		$("#activitiesP").hide();
		$("#foodP").hide();
		$("#entertainmentP").hide();
		//change opacity of the pic
		$("#1").css({"filter": "none"});
		$("#2").css({"filter": "none"});
		$("#3").css({"filter": "none"});
	});

});