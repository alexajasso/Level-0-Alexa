void setup() {
  size(650, 650);
  background(0, 0, 0);
}



void draw() {
  fill(255, 255, 255);
  ellipse(200, 200, 200, 100);
  ellipse(500, 200, 200, 100);
  fill(0, 0, 0 );
  if (mouseX>100 && mouseX<400 && mouseY>150 && mouseY<300) {

    ellipse(mouseX, mouseY, 50, 50 );
    ellipse(mouseX+300, mouseY, 50, 50 );
  }
}