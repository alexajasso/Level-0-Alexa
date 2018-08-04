PImage creeper;
int x=0;
int y=0;
void setup() {
  size(1750, 1166);
  PImage minecraft = loadImage("minecraft.jpg");    
  minecraft.resize(1750, 1166);          
  background(minecraft);         
  creeper=loadImage("creeper.png");
  creeper.resize(10, 4);
}


void draw() {
  image(creeper, x, y);
  fill(255,0,0);
  ellipse(mouseX, mouseY, 20,20);
//if(mousePress){
}
//}