import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
    	 printMenu();//I called the printmenu to show the options for the user.

         choice = keyboard.nextInt();

         switch(choice)//I created several new public static to be able to call them in each case more organized.
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(height, base);


               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circumference(radius);


               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = perimeter(length, width, 0); // 2 parameters 


               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = perimeter(side1, side2, side3);


               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   public static void printMenu() //I put all the outputs in the printmenu.
   {
	    System.out.println("Geometry Calculator");
	    System.out.println("1. Calculate the Area of a Circle");
	    System.out.println("2. Calculate the Area of a Rectangle");
	    System.out.println("3. Calculate the Area of a Triangle");
	    System.out.println("4. Calculate the Circumference of a Circle");
	    System.out.println("5. Calculate the Perimeter of a Rectangle");
	    System.out.println("6. Calculate the Perimeter of a Triangle");
	    System.out.println("Enter your choice (1-6): ");
	}
   // TASK #2 Create the value-returning methods here 
   public static double circleArea(double radius) // here the program will return the area of the circle.
   {
       return  radius *radius*3.14159265359;
   }
   public static double rectangleArea(double length, double width) //here the program will return the area of the rectangle.
   {
       return length *width;
   }
   public static double triangleArea(double height, double base)// here the program will return the area of the triangle. 
   {
       return height *base*0.5;
   }
   public static double circumference(double radius) // here the program will return the area of the circumference.
   {
       return 2*radius *3.14159265359;
   }
   public static double perimeter(double length, double width, double side3) // here the program will return the area of the perimeter.
   {
	    if (side3>0) 
	    { 
	        return length + width +side3;
	    } else 
	    { 
	        return 2*(length +width);
	    }
	}
}
   
