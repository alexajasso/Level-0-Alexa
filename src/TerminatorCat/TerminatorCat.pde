int X=335;
int Y=165;
int X2=389;
int Y2=163;
int acc=1;

void setup() {
  size(600, 400);
  PImage catPic = loadImage("viciousCat.jpg");
  catPic.resize(600, 400);  // to match your size
  background(catPic);
}

void draw() {
  if(keyPressed){
  keyPressed();
  }
  ellipse(X, Y, 20, 20);
  ellipse(X+54, Y-2, 20, 20);
  fill(232, 0, 0);

}  

void keyPressed() {
  noStroke();
  X+=2*acc;
  Y+=2*acc;
  
}  

