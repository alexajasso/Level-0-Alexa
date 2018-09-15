boolean isBitten =false;
void setup() {
  size(500, 500);
}
void draw() {
  background(255, 255, 255);
  noStroke();
  fill(222, 64, 56);

  ellipse(150, 200, 150, 150);
  ellipse(212, 200, 150, 150);
  fill(79, 124, 4);
  rect(176, 103, 12, 32);
  if (isBitten == true) {
    fill(255, 255, 255);
    ellipse(98, 200, 50, 50);
    ellipse(98,220,50,50);
  }
}
void mousePressed() {
  isBitten = true;
}