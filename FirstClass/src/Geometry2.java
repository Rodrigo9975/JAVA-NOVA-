import java.util.Scanner;
/**
 This program demonstrates static methods
*/
public class Geometry2
{
 public static void main(String[] args)
 {
int choice; // The user's choice
double value = 0; // The method's return value
char letter; // The user's Y or N decision
double radius; // The radius of the circle
double length; // The length of the rectangle
double width; // The width of the rectangle
double height; // The height of the triangle
double base; // The base of the triangle
double side1; // The first side of the triangle
double side2; // The second side of the triangle
double side3; // The third side of the triangle
// Create a scanner object to read from the keyboard
Scanner keyboard = new Scanner(System.in);
// The do loop allows the menu to be displayed first
do
{
// TASK #1 Call the printMenu method
	/** Prints the menu of available calculations for the geometry calculator.	 */
	printMenu();
    choice = keyboard.nextInt();
    switch (choice)
{
case 1:
System.out.print("Enter the radius of " +
"the circle: ");
radius = keyboard.nextDouble();
// TASK #3 Call the circleArea method and
// store the result in the value variable
value = circlearea(radius);

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
value = rectanglearea(length,width);

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
value = trianglearea(height,base);

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
value = perimeter(length,width,0);

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
value = perimeter(side1,side2,side3);
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
 public static void printMenu()
 {
	 System.out.println("This is a geometry calculator");
	 System.out.println("Choose what you would like to calculate");
	 System.out.println("1.  Find the area of a circle");
	 System.out.println("2.  Find the area of a rectangle");
	 System.out.println("3.  Find the area of a triangle");
	 System.out.println("4.  Find the circumference of a circle");
	 System.out.println("5.  Find the perimeter of a rectangle");
	 System.out.println("6.  Find the perimeter of a triangle");
	 System.out.println("Enter the number of your choice: ");
 }
 
 // TASK #2 Create the value-returning methods here
 /**
  * Calculates and returns the area of a circle with the given radius.
  * @param radius  of the circle
  * @return the area of the circle */
  public static double circlearea(double radius) 
  {
	  return  radius *radius*3.14159265359;
  }
  /**
   * Calculates and returns the area of a rectangle with the given length and width.
   * @param length  of the rectangle
   * @param width of the rectangle
   * @return the area of the rectangle   */
  public static double rectanglearea(double length,double width)
  {
	  return length * width ; 
  }
  /**
   * Calculates and returns the area of a triangle with the given height and base. 
   * @param height  of the triangle
   * @param base  of the triangle
   * @return the area of the triangle   */
  public static double trianglearea(double height,double base)
  {
	  return height *base*0.5;
  }
  /**
   * Calculates and returns the circumference of a circle with the given radius.   
   * @param radius the radius of the circle
   * @return the circumference of the circle   */
  public static double circumference(double radius)
  {
	  return 2*radius*3.14159265359;
  }
  /**
   * Calculates and returns the perimeter of a rectangle with the given length and width,
   * or the perimeter of a triangle with the given side lengths.
   * @param length the length of the rectangle, or the length of side 1 of the triangle
   * @param width the width of the rectangle, or the length of side 2 of the triangle
   * @param side3 the length of side 3 of the triangle , or 0 for a rectangle
   * @return the perimeter of the rectangle or triangle   */
  public static double perimeter(double length,double width,double side3)  
  {
	  if (side3>0) 
	    { 
	        return length + width + side3;
	    } 
	    else 
	    { 
	        return 2*(length +width);
	    }
  }
}
// TASK #4 Write javadoc comments for each method

/** task 1 I created the options that appeared for the user to choose and 
 * called at the beginning of the code to initialize it.
 * Task 2  I created and calculated each option presented in task 1.
 * task 3 initialized all functions created in task 2.
 * 
 * */
