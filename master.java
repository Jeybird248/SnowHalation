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
//snowflakes by Jehyeok Yeon (Tommy)
function snowflake(size, thiccness) {
  for (var count = 0; count < 8; count++) {
    //puts the pen down to start drawing
    penDown();
    //randomizes thickness
    penWidth(thiccness);
    //sets pen color to light blue
    penColor('lightblue');
    moveForward(size);
    turnRight(90);
    moveForward(size/2);
    turnRight(90);
    //draws big corner
    //sets pen color to dark blue
    penColor('darkblue');
    moveForward(size/2);
    turnRight(90);
    moveForward(size);
    turnRight(45);
    //draws smaller corner
    penUp();
    //picks pen up
  }
}
