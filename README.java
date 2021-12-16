#Wurmsimulator
//Wurm-Simulation

int xpos, ypos;
int dx, dy;

void setup(){
  size(300,300);
  frameRate(60);
  background(13,255,10);
  stroke(255,9,0);
  strokeWeight(1);
  xpos = width/2;
  ypos = height/2;
}

float x = 150;
float y = 150;
float xn = 150;
float yn = 150;


void draw(){
  
  if(random(1.0)>0.5)
  x = x+random(-20,20);
  else
  y = y+random(-20,20);
  x = constrain(x,0,width);
  y = constrain(y,0,height);
  line(x,y,xn,yn);
  xn = x;
  yn = y;
}
  
