//Salma Ayman Sharaf 20196025
//Doaa Gamal Saleh   20196020
import java.util.Scanner;


import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JWindow;


public class Demo  {
	

	public static void main(String[] args) {
		
		while(true) {
			try {
		int choice;
		//choose options
		System.out.println("1-Rectangle ");
		System.out.println("2-Circle ");
		System.out.println("3-Square "); 
		System.out.println("enter your choice: ");
		Scanner c=new Scanner(System.in);
        choice=c.nextInt();

        int vertical;
        int horizantal;
        int colour=1;
        String label="rectangle";
        if(choice==1)
        {
        	
        // Rectangle test
        double width , length ;
      
       
        System.out.println("enter Rectangle length: ");
        Scanner len=new Scanner(System.in);
        length=len.nextDouble();
        System.out.println("enter Rectangle width: ");
        Scanner wid=new Scanner(System.in);
        width=wid.nextDouble();
        
        System.out.println("enter vertical position: ");
        Scanner v=new Scanner(System.in);
        vertical=v.nextInt();
        
        System.out.println("enter horizantal position: ");
        Scanner h=new Scanner(System.in);
        horizantal=h.nextInt();
        
        System.out.println("1-blue ");
        System.out.println("2-green ");
        System.out.println("3-red");
        Scanner co=new Scanner(System.in);
        colour=co.nextInt();
        
        
        //the original rectangle
        
        Shape rectangle = new Rectangle(vertical,horizantal,width, length,colour,label);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
        /////////////
        /////////////
        //test go functions
        System.out.println("1-go right");
        System.out.println("2-go down");
        System.out.println("3-go Up");
        System.out.println("4-go left");
        int shift;
        Scanner sh=new Scanner(System.in);
        shift=sh.nextInt();
        if(shift==1) {
        int vertical2=480;
        rectangle.goRight(vertical2, horizantal, shift);
        Shape rectangle1 = new Rectangle(vertical2,horizantal,width, length,colour,label);}
        
        if(shift==2) {
            int horizantal2=480;
            rectangle.goDown(vertical, horizantal2, shift);
            Shape rectangle1 = new Rectangle(vertical,horizantal2,width, length,colour,label);}
        
        if(shift==3) {
            int horizantal2=480;
            rectangle.goUp(vertical, horizantal2, shift);
            horizantal2=horizantal-200;
            Shape rectangle1 = new Rectangle(vertical,horizantal2,width, length,colour,label);}
        if(shift==4) {
            int vertical2=480;
            rectangle.goUp(vertical2, horizantal, shift);
            vertical2=vertical-200;
            Shape rectangle1 = new Rectangle(vertical2,horizantal,width, length,colour,label);}
        
        ////////////
        ///////////
        //test resize function
        System.out.println("1-resize 50%");
        System.out.println("2-resize 200%");
        int size;
        Scanner si=new Scanner(System.in);
        size=si.nextInt();
        if(size==1) {
            double width2=200;
            double length2=100;
            width2=width/2;
            length2=length/2;
            rectangle. resize50(vertical, horizantal, width2, length2);          
            Shape rectangle1 = new Rectangle(vertical,horizantal,width2, length2,colour,label);}
        if(size==2) {
            double width2=200;
            double length2=100;
            width2=width*2;
            length2=length*2;
            rectangle. resize200(vertical, horizantal, width2, length2);
            Shape rectangle1 = new Rectangle(vertical,horizantal,width2, length2,colour,label);}
        
        ///////////////
        //////////////
        
        
       
      
        }
        
if (choice==2) {
	
        // Circle test
        double radius ;
        System.out.println("enter Circle radius: ");
        Scanner rad=new Scanner(System.in);
        radius=rad.nextDouble();
        System.out.println("enter vertical position: ");
        Scanner v=new Scanner(System.in);
        vertical=v.nextInt();
        
        System.out.println("enter horizantal position: ");
        Scanner h=new Scanner(System.in);
        horizantal=h.nextInt();
        
        System.out.println("1-blue ");
        System.out.println("2-green ");
        System.out.println("3-red");
        Scanner co=new Scanner(System.in);
        colour=co.nextInt();
        
        //the original circle
        Shape circle = new Circle(vertical,horizantal,radius,colour,label);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");
        
        ///////////////
        //////////////
        //test go functions
        System.out.println("1-go right");
        System.out.println("2-go down");
        System.out.println("3-go Up");
        System.out.println("4-go left");
        int shift;
        Scanner sh=new Scanner(System.in);
        shift=sh.nextInt();
        if(shift==1) {
        int vertical2=480;
        circle.goRight(vertical2, horizantal, shift);
        Shape circle2 = new Circle(vertical2,horizantal,radius,colour,label);}
        
        if(shift==2) {
            int horizantal2=480;
            circle.goDown(vertical, horizantal2, shift);
            Shape circle2 = new Circle(vertical,horizantal2,radius,colour,label);}
        
        if(shift==3) {
            int horizantal2=480;
            circle.goUp(vertical, horizantal2, shift);
            horizantal2=horizantal-200;
            Shape circle2 = new Circle(vertical,horizantal2,radius,colour,label);}
        if(shift==4) {
            int vertical2=480;
            circle.goUp(vertical2, horizantal, shift);
            vertical2=vertical-200;
            Shape circle2 = new Circle(vertical2,horizantal,radius,colour,label);}
      ////////////
      ///////////
        //test the resize function
      System.out.println("1-resize 50%");
      System.out.println("2-resize 200%");
      int size;
      Scanner si=new Scanner(System.in);
      size=si.nextInt();
      if(size==1) {
          double radius2=200;
          radius2=radius/2;
          circle. resize50(vertical, horizantal,radius2);          
          Shape circle2 = new Circle(vertical,horizantal,radius2,colour,label);}
      if(size==2) {
          double radius2=200;
          radius2=radius*2;
          circle. resize200(vertical, horizantal,radius2);
          Shape circle2 = new Circle(vertical,horizantal,radius2,colour,label);}
      
      ///////////////
      //////////////
        
        
        }




if (choice==3) {
	
        //Square test
        double side ;
        System.out.println("enter Square side: ");
        Scanner s=new Scanner(System.in);
        side=s.nextDouble();
        
        System.out.println("enter vertical position: ");
        Scanner v=new Scanner(System.in);
        vertical=v.nextInt();
        
        System.out.println("enter horizantal position: ");
        Scanner h=new Scanner(System.in);
        horizantal=h.nextInt();
        
        System.out.println("1-blue ");
        System.out.println("2-green ");
        System.out.println("3-red");
        Scanner co=new Scanner(System.in);
        colour=co.nextInt();
        //the original square
        
        Shape square = new Square(vertical ,horizantal, side,  colour,label) ;
        System.out.println("Square side lengths: " + side
                + "\nResulting Area: " + square.area()
                + "\nResulting Perimeter: " + square.perimeter() + "\n");
        
        ///////////////
        //////////////
        //test go functions
        System.out.println("1-go right");
        System.out.println("2-go down");
        System.out.println("3-go Up");
        System.out.println("4-go left");
        int shift;
        Scanner sh=new Scanner(System.in);
        shift=sh.nextInt();
        if(shift==1) {
        int vertical2=480;
        square.goRight(vertical2, horizantal, shift);
        Shape square2 = new Square(vertical2,horizantal,side,colour,label);}
        
        if(shift==2) {
            int horizantal2=480;
            square.goDown(vertical, horizantal2, shift);
            Shape square2 = new Square(vertical,horizantal2,side,colour,label);}
        
        if(shift==3) {
            int horizantal2=480;
            square.goUp(vertical, horizantal2, shift);
            horizantal2=horizantal-200;
            Shape square2 = new Square(vertical,horizantal2,side,colour,label);}
        if(shift==4) {
            int vertical2=480;
            square.goUp(vertical2, horizantal, shift);
            vertical2=vertical-200;
            Shape square2 = new Square(vertical2,horizantal,side,colour,label);}
        
        ////////////
        ///////////
        //test the resize functions
        System.out.println("1-resize 50%");
        System.out.println("2-resize 200%");
        int size;
        Scanner si=new Scanner(System.in);
        size=si.nextInt();
        if(size==1) {
            double side2=200;
            side2=side/2;
            square. resize50(vertical, horizantal,side2);          
            Shape square2= new Square(vertical,horizantal,side2,colour,label);}
        if(size==2) {
            double side2=200;
            square. resize200(vertical, horizantal,side2);
            Shape square2 = new Square(vertical,horizantal,side2,colour,label);}
        
        ///////////////
        //////////////
        }
			}
			
			catch(Exception e){System.out.println("There is error");}

	}
			}

}

