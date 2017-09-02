void setup() {
  size(500, 500);
  PImage catPic = loadImage("viciousCat.jpg");
  catPic.resize(500, 500);  // to match your size
  background(catPic);
}

void draw() {
  ellipse(200, 200, 20, 20);
}  




