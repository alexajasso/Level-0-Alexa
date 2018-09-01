// 4. create three integer variables to  
//    represent the x, y, and the size of the ellipse
int x=200;
int y=200;
int size=200;


void setup() {
  size(400, 600);
}

void draw() {
  background(47, 203, 163);
  ellipse(x, y, size, size);
  if (mousePressed) {

    int distance=getDistance(x, y, mouseX, mouseY);
    System.out.println(distance);
    int halfDistance=size/2;
    if (distance >-halfDistance && distance < halfDistance) {
      x = int (random(400));
      y = int (random(600));
    }
  }
}

void mousePressed() {

  //8a. make an if statement to check if the distance variable
  //   is greater than negative half the size of the ellipse,
  //   and less than positive half the size of the ellipse.

  //8b.  set the x and y of the ellipse to a random location on the window
}

int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
}