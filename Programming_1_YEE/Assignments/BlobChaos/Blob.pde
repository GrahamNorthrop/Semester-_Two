class Blob 
{
  int player;
  float x=100, y=100, left, top, right, bottom, r, g, b, r1, g1, b1, d=40, radius=d/2, xSpd=0, ySpd=0, lastX, lastY;
  boolean onGround=true;
  Blob(int player1) 
  {
    player = player1;
    if (player==1) 
    {
      x=100;
      r=30;
      g=0;
      b=255;
      r1=0;
      g1=255;
      b1=255;
    } else 
    {
      x=180;
      r=50;
      g=0;
      b=0;
      r1=255;
      g1=0;
      b1=100;
    }
  }

  void display() 
  {
    if (onGround==true && keyCode==UP)
    {
      ySpd=-12;
      onGround=false;
    }
    lastX=x;
    lastY=y;
    x+=xSpd;
    y+=ySpd;
    ySpd+=gravity;
    left = x-(d/2);
    top = y+(d/2);
    right = x+(d/2);
    bottom = y-(d/2);
    int a=0;
    float rdec=(r1-r)/radius, gdec=(g1-g)/radius, bdec=(b1-b)/radius, tr=r, tg=g, tb=b;
    while (a<d) 
    {
      strokeWeight(2);
      stroke(tr, tg, tb);
      noFill();
      ellipse(x, y, a, a);
      tr+=rdec;
      tb+=bdec;
      tg+=gdec;
      a+=2;
    }

    a=1;
    float trans=100;
    strokeWeight(2);
    while (a<=12)
    {
      stroke(tr, tg, tb, trans);
      ellipse(x, y, d+a, d+a);
      trans*=.8;
      a+=2;
    }
    strokeWeight(1);
  }
}