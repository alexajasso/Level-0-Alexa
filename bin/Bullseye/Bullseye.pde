void setup() {
  size(400, 400);
}

void draw() {
  for (int i=350; i>=25; i-=25) {
    if (i % 2 == 0) {
      fill(255, 255, 255);
    } else {
      fill(255, 0, 0);
    }
    ellipse(200, 200, i, i);
  }
}