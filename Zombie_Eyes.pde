void setup(){
 size(900,600); 
 PImage cat = loadImage("cat.jpg");
 cat.resize(900,600);
 background(cat);
  
}

void draw(){
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
  
  fill(mouseX,0,mouseY);
  ellipse(356,322,20,25);
  ellipse(512,325,25,30);
  
  fill(0,0,0);
  ellipse(356,322,5,10);
  ellipse(512,325,10,15);
  
}
