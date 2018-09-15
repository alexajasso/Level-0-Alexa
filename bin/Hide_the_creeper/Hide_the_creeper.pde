PImage creeper;
int x=50;
int y=50;
void setup() {
  size(1750, 1166);
  PImage minecraft = loadImage("minecraft.jpg");    
  minecraft.resize(1750, 1166);          
  background(minecraft);         
  creeper=loadImage("creeper.png");
  creeper.resize(10, 4);
}


void draw() {
  PImage minecraft = loadImage("minecraft.jpg");    
  minecraft.resize(1750, 1166);          
  background(minecraft);         
  if (mousePressed) {
    System.out.println(mouseY);
  }  
  image(creeper, x, y);
  if (mousePressed && mouseX<=53 && mouseX>=47 && mouseY<=56 && mouseY>=52) {
    System.out.println("Good Job!!!You found the Creeper!!!");
    fill(0, 255, 0);
    ellipse(mouseX, mouseY, 20, 20);
  } else if (mousePressed) {
    fill(255, 0, 0);
    ellipse(mouseX, mouseY, 20, 20);
  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}