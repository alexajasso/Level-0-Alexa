PImage donkey;
PImage tail;
PImage turtle;
void setup() {
  size(1328, 747);
  donkey=loadImage("California.jpg");
  background(donkey);
  tail=loadImage("Donkeytail.jpg");
  turtle=loadImage("babyturtle.png");
  turtle.resize(1328,747);
  background(turtle);
  rect(0, 0, 53, 55);
}


void draw() {

  if (mousePressed==true) {
    image(tail, mouseX-40, mouseY-20);
  }
}

