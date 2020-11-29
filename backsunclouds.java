start();
function start(){
  Background();
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
