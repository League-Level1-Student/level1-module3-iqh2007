
int birdY = 250;
int birdX = 200;
int birdYVelocity = 50;
int gravity = 2;
int pipeX = 500;
int upperPipeHeight = (int)random(325)+75;;
int lowerPipeHeight = upperPipeHeight + 200;
int pipeGap = 300;
int lowerY = upperPipeHeight + pipeGap;
int pipeWidth = 50;

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
      
 rect(pipeX, lowerPipeHeight, 50,700-lowerPipeHeight);
 
 
  fill(255,255,255);
  rect(0, 680, 700, 20);
 
 
 if (intersectsPipes( )== true){
   exit();
 }
 
 if(birdY > 680){
   
   exit();
   
 }
 
}

void keyPressed(){
  birdY = birdY - birdYVelocity;
} 


boolean intersectsPipes() {
     if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
          return true; 
     }
     else if (birdY > lowerY && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
          return true; }
     else { return false; }
}
