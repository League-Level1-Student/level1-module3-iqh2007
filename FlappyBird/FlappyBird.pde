int birdY = 250;
int birdX = 200;
int birdYVelocity = 60;
int gravity = 2;
int pipeX = 500;
int upperPipeHeight = 400;
int lowerPipeHeight = 200;
int pipeGap = 150;

void setup(){
  size(700, 700);
  
}

void draw(){
  background(0,0,0);
  
  ellipse(birdX, birdY, 30, 30);
  
  //birdY = birdY + birdYVelocity;
  
  birdY = gravity + birdY;
  
  rect(pipeX, 0, 50, upperPipeHeight);
  
  pipeX = pipeX - 1;
  
  if(pipeX < 0){
  pipeX = 500;  
 upperPipeHeight = (int)random(325)+75;
 lowerPipeHeight = upperPipeHeight + 200;
      }
      
 rect(pipeX, 500, 50, lowerPipeHeight);
 
 
 
}

void mousePressed(){
  birdY = birdY - birdYVelocity;
}            
