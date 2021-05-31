// JavaScript Document
$(document).ready(function() {
    'use strict';
	var s_w = window.innerWidth;
	//主题字体大小
    function fontSize() {
        var font_per = 10 / 1920;
        $("html").css("font-size", s_w * font_per + "px");
    }
    fontSize();
	window.addEventListener("resize", function(){
		fontSize();
	});
	//微信二维码
	(function(name){
		var box = $(name);
		box.hover(function(){
			$(this).find("span").toggleClass("on");
		});
	})(".wec");
	//进入效果
	(function(name){
		var box = $(name);
		var logo = box.find(".logo");
		logo.addClass("topLoop");
		var row1 = box.find(".row1");
		row1.addClass("topLoop");
		var row2 = box.find(".row2");
		row2.addClass("topLoop");
		var a = box.find("a");
		a.addClass("fadeIn");
	})(".container");
});
