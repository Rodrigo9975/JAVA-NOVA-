import java.util.Scanner;

public class speed_of_sound 
{
    public static void main(String[] args) 
    {
        // Store the speed of sound for each medium
        int speed_Air = 1100;
        int speed_Water = 4900;
        int speed_Steel = 16400;
        float time;
        
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter the medium and the distance
        System.out.print("Enter the medium (air, water, or steel): ");
        String medium = keyboard.nextLine();
        System.out.print("Enter the distance: ");
        float distance = keyboard.nextInt();

        // Calculate the time it takes for sound to travel in the medium
        
        if (medium ==("air || Air")) 
        {
            time = distance / speed_Air;
        } else if (medium.equals("water || Water")) 
        {
            time = distance / speed_Water;
        } else 
        {
            time = distance / speed_Steel;
        }

        // Display the result
        System.out.println("Time: " + time + " seconds");
    }
}
