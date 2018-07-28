void setup() {
  size(600, 400);  
  PImage   face   =   loadImage("viciousCat.jpg");
  image(face, 0, 0);
  face.resize(900, 900);
}
void draw() {

  fill(mouseX, mouseY, 7);
  ellipse(320, 160, 20, 20);
  ellipse(378, 155, 20, 20);

  fill(0, 0, 0);
  ellipse(320, 160, 10, 10);
  ellipse(378, 155, 10, 10);
}