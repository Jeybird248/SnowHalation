hide();
penUp();
Background();

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
//This will create the background, which will be both top and bottom.
function Background(){
  penColor("lightblue");
  dot(360);
  penUp();
  drawAllClouds(20, 20);
  //This part is for the Sun.
  penColor("yellow");
   moveTo(280, 40);
  dot(30);
  penUp();
  moveTo(0, 360);
  turnRight(90);
  penWidth(200);
}
//This calls the Cloud function, which will essentially ensure that the clouds will appear.
function drawAllClouds(size){
    drawCloud(randomNumber(size));
}
//This makes sure that the cloud's position is randomized. 
function drawCloud(size){
  moveTo(randomNumber(25,200), randomNumber(25,200));
  penRGB(255,255,255,1);
  dot(size);
  //This will give the cloud its shape
  for(var i=0; i<2; i++){
  //This loop will essentially demonstrate that there will be no more than one cloud.
    turnTo(300);
    moveForward(size);
    dot(size);
    turnLeft(90);
    moveForward(size);
    dot(size);
  }
}
