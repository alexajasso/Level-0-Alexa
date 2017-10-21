PImage donkey;
PImage tail;
PImage turtle;
void setup() {
  size(1328, 747);
  donkey=loadImage("California.jpg");
  donkey.resize(1328, 747);
  tail=loadImage("Donkeytail.jpg");
  turtle=loadImage("babyturtle.png");
  turtle.resize(1328, 747);
  rect(0, 0, 53, 55);
}


void draw() {
  System.out.println(mouseX);
  if (mouseX<53 && mouseY<55) {
    background(donkey);
  } else {
    //background(turtle);
    
  }
}
void mousePressed() {
  image(tail, mouseX-10, mouseY-20);
}

