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
