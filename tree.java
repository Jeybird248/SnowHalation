drawAllTree();
function drawAllTree() {
  for (var i = 0; i < 3; i++) {
    moveTo(randomNumber(0, 310), 320);
    drawTree(randomNumber(50, 230));
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
