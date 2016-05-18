Blob p1 = new Blob(1);
Blob p2 = new Blob(2);
float gravity=.5;
void setup() {
  size(1000, 700);
  frameRate(30);
}

void draw() {
  background(0);
  p1.display();
  p2.display();
}