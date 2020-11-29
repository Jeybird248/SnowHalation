hide();
penUp();
//draws the background
Background();
var colors = ["lightblue","darkblue","red", "white", "black", "lightyellow"];


//draws 50 snowflakes 
for (var i = 0; i < 25; i++) {
  //uses random size and thickness
  moveTo(randomNumber(0, 300),randomNumber(110, 450));
  snowflake(randomNumber(5, 10), randomNumber(3,7));
}

//snowflakes by Jehyeok Yeon (Tommy)
function snowflake(size, thiccness) {
  for (var count = 0; count < 8; count++) {
    //puts the pen down to start drawing
    penDown();
    //randomizes thickness
    penWidth(thiccness);
    //sets pen color to random color from list
    penColor( colors[randomNumber(0,5)] );
    moveForward(size);
    turnRight(90);
    moveForward(size/2);
    turnRight(90);
    //draws big corner
    //sets pen color to random color from list
    penColor(colors[randomNumber(0,5)]);
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
  for (var i = 0; i < 4; i++) {
    drawCloud(randomNumber(size));
  }
}
//This makes sure that the cloud's position is randomized. 
function drawCloud(size){
  moveTo(randomNumber(25,200), randomNumber(25,100));
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
