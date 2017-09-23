void setup() {
  size(500, 500);
  fill(249, 203, 156);
  ellipse(250, 250, 350, 350);
  fill(255, 0, 0);  
  ellipse(250, 250, 300, 300);
  fill(255, 217, 102);
  ellipse(250, 250, 250, 250);
}

void draw() {

  PImage cheese = loadImage("cheese .jpg"); 
  image(cheese, 20, 20);
  cheese.resize(10, 10);
  PImage pepperoni = loadImage("pepperoni.jpg"); 
  image(pepperoni, 20, 70);
  pepperoni.resize(10, 10);
  if (mousePressed) {
    image(pepperoni, mouseX,mouseY);
    image(cheese, mouseX,mouseY);
  }
}

