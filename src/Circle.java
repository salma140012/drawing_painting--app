import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Circle extends Shape {
    private double radius;
   
    

    public Circle() {}  //defualt constructor
    //parameterized constructor
    public Circle(int vertical ,int horizantal,double radius,int colour,String label) {
    	
    	try {
        this.radius = radius;
        this.vertical=vertical;
        this.horizantal=horizantal;
        this.colour=colour;
        this.label=label;
         Window();}
    	catch(Exception e){System.out.println("There is error");}
    }

    //to calculate circle area
    public double area() {
    	try {
        // A = π r^2
    	return Math.PI * radius * radius;}
    	catch(Exception e){System.out.println("There is error");
    	return 0;
    	}
    }
  //to calculate circle perimeter
    public double perimeter() {
    	try {
        // P = 2πr
    	 return 2 * Math.PI * radius;}
    	catch(Exception e){System.out.println("There is error");
    	return 0;
    	}
    }
    //to draw and paint the circle
    public void paint(Graphics g) {
    	try {
    	int r=(int)radius;
    	
		if (colour==1) {
			g.setColor(Color.BLUE);
		}
		else if(colour==2) {
			g.setColor(Color.GREEN);
		}
		else if(colour==3) {
			g.setColor(Color.RED);
		}
		
		g.fillOval(vertical, horizantal, r, r);}
    	catch(Exception e){System.out.println("There is error");}
}
}

