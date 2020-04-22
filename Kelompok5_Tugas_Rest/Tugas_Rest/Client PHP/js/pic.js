//variables
var pics = ["food2.jpg", "food3.jpg", "food4.jpg"];
var index = 0;

function picGallery(option) {
	"use strict";
	//obtain the image src to be switched
	var display_image = document.getElementById('galleryimg');
	//if button Next is clicked
	if (option == 1){
		if (index < pics.length - 1){
			index += 1;
			display_image.src = 'images/' + pics[index];
		} else { //if it's the last image, wrap it around
			index = 0;
			display_image.src = 'images/' + pics[index];
		}
	}
	//if button Previous is clicked
	else if (option == -1){
		if (index > 0){
			index -= 1;
			display_image.src = 'images/' + pics[index];
		} else { //if it's the first image, wrap it around
			index = pics.length - 1;
			display_image.src = 'images/' + pics[index];
		}
	}

}