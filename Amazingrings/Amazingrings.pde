void setup() {
  size(800, 400);
  smooth();
  background(0);
  noFill();
}
int k=10;
int speed=2;
void draw() {
  k-=speed;
  background(255);
  for (int j=350; j>=25; j-=10) {
    ellipse(200-k, 200, j, j);
  }
  for (int j=350; j>=25; j-=10) {
    ellipse(600+k, 200, j, j);
  }
  if (k>200||k<-600) {
  speed=- speed;
  }
}