hide();
penUp();

//draws the background
drawBackground();
//draws 50 snowflakes 
for (var i = 0; i < 50; i++) {
  //uses random size and thickness
  moveTo(randomNumber(0, 300),randomNumber(0, 450));
  snowflake(randomNumber(5, 10), randomNumber(3,7));
}

//function puts big dot that serves as background
//function adapted from code.org preexisting c
function drawBackground(){
  penRGB(224, 255, 255);
  dot(1000);
}
