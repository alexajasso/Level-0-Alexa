PImage creeper;
void setup() {
  size(1750, 1166);
  PImage minecraft = loadImage("minecraft.jpg");    
  minecraft.resize(1750, 1166);          
  background(minecraft);         
  creeper=loadImage("creeper.png");
  creeper.resize(20, 10);
}


void draw() {
  image(creeper, mouseX, mouseY);
}