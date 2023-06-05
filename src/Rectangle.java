import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Rectangle extends Shape {
	
    private  double width, length; //sides
  
    
    public Rectangle() {}//default constructor
        
    //parameterized constructor
    public Rectangle(int vertical ,int horizantal,double width, double length,int colour,String label) {
    	try {
        this.width = width;
        this.length = length;
        this.vertical=vertical;
        this.horizantal=horizantal;
        this.colour=colour;
        this.label=label;
         Window();}
    	catch(Exception e){System.out.println("There is error");}
        
      
    }

    //to calculate rectangle area
    public double area() {
    	try {
        // A = w * l
        return width * length;}
    	catch(Exception e){System.out.println("There is error");
    	return 0;
    	}
    }

  //to calculate rectangle perimeter
    public double perimeter() {
    	try {
        // P = 2(w + l)
        return 2 * (width + length);}
    	catch(Exception e){System.out.println("There is error");
    	
    	return 0;
    	}
    	
    }
    //to draw the rectangle and paint it
    	public void paint(Graphics g) {
    		try {
    		int w=(int)width;
    		int l=(int)length;
    		if (colour==1) {
    			g.setColor(Color.BLUE);
    		}
    		else if(colour==2) {
    			g.setColor(Color.GREEN);
    		}
    		else if(colour==3) {
    			g.setColor(Color.RED);
    		}
    		
    		g.fillRect(vertical, horizantal, l, w);
    		}catch(Exception e){System.out.println("There is error");}
    }
    	
    	
    	
}

