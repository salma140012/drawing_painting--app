
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;



public abstract class Shape extends JFrame {
	//attributes
	int  colour;
	int vertical;
	int horizantal;
	String label;
	int shift;
	double s1;
	double s2;
	double r;
	
	
	public Shape() {}//defualt constructor
	public Shape(int vertical,int horizantal,double s1,double s2 ,int colour,String label) {}//parameterized constrctor1
    public Shape(int vertical,int horizantal,double radius,int colour,String label) {}//parameterized constrctor2
	
    public abstract double area();//abstract functions overidden in rectangle ,square,circle
    public abstract double perimeter();;//abstract functions overidden in rectangle ,square,circle
    public abstract void paint(Graphics g);//to draw shapes with paint
    
    //java window
    public   void Window() {
    	try {
    	setTitle("Window");
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
    	catch(Exception e){System.out.println("There is error");}
    	
    }
    //to go right by adjusting vertical
    public void goRight(int vertical,int horizantal,int shift) {
    	try {
    	this.shift=shift;
    	this.vertical=vertical-100;
        this.horizantal=horizantal;}
    	catch(Exception e){System.out.println("There is error");}
        
    	
     
    }
    //to go down by adjusting the horizantal
    public void goDown(int vertical,int horizantal,int shift) {
    	try {
    	this.shift=shift;
    	this.vertical=vertical;
        this.horizantal=horizantal+100;}
    	catch(Exception e){System.out.println("There is error");}
       
    	
     
    }
  //to go up by adjusting the horizantal
    public void goUp(int vertical,int horizantal,int shift) {
    	try {
    	this.shift=shift;
    	this.vertical=vertical;
    	this.horizantal=horizantal-100;}
    	catch(Exception e){System.out.println("There is error");}
       
    	
     
    }
  //to go left by adjusting the vertical
    public void goLeft(int vertical,int horizantal,int shift) {
    	try {
    	this.shift=shift;
    	this.vertical=vertical+100;
        this.horizantal=horizantal;}
    	catch(Exception e){System.out.println("There is error");}
        
    	
     
    }
    //resize shape to half for rectangle
    public void resize50(int vertical,int horizantal,double s1,double s2){
    	try {
    	  this.vertical=vertical;
          this.horizantal=horizantal;
          this.s1 = s1/2;
          this.s2 = s2/2;}
    	catch(Exception e){System.out.println("There is error");}
    	
    	
    	
    }
  //resize shape to double for rectangle
    public void resize200(int vertical,int horizantal,double s1,double s2){
    	try {
  	  this.vertical=vertical;
        this.horizantal=horizantal;
        this.s1 = s1*2;
        this.s2 = s2*2;}
    	
    	catch(Exception e){System.out.println("There is error");}
  	
  	
  	
  }
  //resize shape to half for square and circle
    public void resize50(int vertical,int horizantal,double r){
    	try {
  	  this.vertical=vertical;
        this.horizantal=horizantal;
        this.r = r/2;}
    	catch(Exception e){System.out.println("There is error");}
        
  	
  	
  	
  }
    ////resize shape to double for square and circle
    public void resize200(int vertical,int horizantal,double r){
    	try {
    	  this.vertical=vertical;
          this.horizantal=horizantal;
          this.r = r*2;}
    	catch(Exception e){System.out.println("There is error");}
          
    	
    	
    	
    }
}