void setup() {
  size(650, 650);
  background(0, 0, 0);
PImage face = loadImage("face1.jpg");
image(face, 0, 0);



}



void draw() {
  fill(255, 255, 255);
  ellipse(200, 300, 75, 40);
  ellipse(400, 300, 75, 40);
  fill(0, 0, 0 );
  if (mouseX>200 && mouseX<275 && mouseY>280 && mouseY<340) {

    ellipse(mouseX, mouseY, 30, 30 );
    ellipse(mouseX+200, mouseY, 30, 30 );
  }
}