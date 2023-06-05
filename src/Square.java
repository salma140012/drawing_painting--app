import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Square extends Shape {
    private  double side; //sides

    public Square() {}//default constructor
  //parameterized constructor
    public Square(int vertical ,int horizantal,double side, int colour,String label) {
    	try {
        this.side = side;
        this.vertical=vertical;
        this.horizantal=horizantal;
        this.colour=colour;
        this.label=label;
         Window();}
    	catch(Exception e){System.out.println("There is error");}
        
    }

    //to calculate area of the square
    public double area() {
    	try {
        // A = w * l
        return side * side;}
    	catch(Exception e){System.out.println("There is error");
    	return 0;
    	}
    }

    //to calculate perimeter of the square
    public double perimeter() {
    	try {
        // P = 2(w + l)
        return 4 * side;}
    	catch(Exception e){System.out.println("There is error");
        return 0;
    	}
    }
    //to draw the square and colour it 
    public void paint(Graphics g) {
    	try {
		
		int s=(int)side;
		if (colour==1) {
			g.setColor(Color.BLUE);
		}
		else if(colour==2) {
			g.setColor(Color.GREEN);
		}
		else if(colour==3) {
			g.setColor(Color.RED);
		}
		
		g.fillRect(vertical, horizantal,s, s);}
    	catch(Exception e){System.out.println("There is error");}
}
}


