void setup(){
size(800, 600);

fill(#DB7535);
ellipse(400, 300, 400, 350);

fill(255,0,0);
ellipse(400, 300, 350, 300 );

fill(#FFC903);
ellipse(400, 300, 330, 270);

}

void draw(){
  if(mousePressed){
     fill(255,0,0);
     ellipse(mouseX,mouseY, 50,50);
  }
  
}
