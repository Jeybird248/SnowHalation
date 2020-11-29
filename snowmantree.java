penColor(rgb(224, 255, 255));
dot(1000);
drawAllSnowmen();
drawAllTree();
function drawAllTree() {
  for (var i = 0; i < 3; i++) {
    moveTo(randomNumber(0, 310), 320);
    drawTree(randomNumber(50, 230));
  }
}
function drawAllSnowmen() {
  for (var i = 0; i < 4; i++) {
    moveTo(randomNumber(0, 310), 445);
    drawSnowman(randomNumber(10, 50));
  }
}
function drawTree(size) {
  penColor(rgb(0,128,0));
  penDown();
  penWidth(25);
  turnTo(270);
  
    //tree leaves
  moveForward(size);
  turnRight(120);
  moveForward(size);
  turnRight(120);
  moveForward(size);
  turnRight(120);
  penUp();
    //bark
  penDown();
  moveForward(size/2);
  penColor(rgb(210,105,30));
  penWidth(25);
  turnLeft(90);
  moveForward(size);
  penUp();
  
}
function drawSnowman(size) {
//snow balls
penDown();

penColor(rgb(255, 255, 255));
dot(size);
moveForward(size);
dot(size);
moveForward(size);
dot(size);
moveForward(size);
penColor(rgb(255, 165, 0));
turnRight(120);
moveForward(size);
turnRight(120);
moveForward(size);
turnRight(120);
moveForward(size);
penUp();

}
