import java.util.Scanner;

public class Rodrigues_BMITracker_pseudo  
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to the BMI100 Tracker");

        // Ask for weight units
        System.out.print("Will you be entering your weight in pounds (lbs) or kilograms (kg)? ");
        String weightUnit = input.nextLine();

        // Ask for weight and convert to pounds if necessary
        double weight2021;
        if (weightUnit.equals("kg")) {
            System.out.print("Enter your weight in 2021 (in kilograms): ");
            weight2021 = input.nextDouble() * 2.20462;
        } else {
            System.out.print("Enter your weight in 2021 (in pounds): ");
            weight2021 = input.nextDouble();
        }

        // Ask for height in inches
        System.out.print("Enter your height in 2021 (in inches): ");
        double height2021 = input.nextDouble();

        // Calculate BMI for 2021
        double bmi2021 = weight2021 / (height2021 * height2021) * 703;

        // Print BMI for 2021
        System.out.println("Your BMI in 2021 is " + bmi2021);

        // Ask for weight and convert to pounds if necessary
        double weight2022;
        if (weightUnit.equals("kg")) {
            System.out.print("Enter your weight in 2022 (in kilograms): ");
            weight2022 = input.nextDouble() * 2.20462;
        } else {
            System.out.print("Enter your weight in 2022 (in pounds): ");
            weight2022 = input.nextDouble();
        }

        // Ask for height in inches
        System.out.print("Enter your height in 2022 (in inches): ");
        double height2022 = input.nextDouble();

        // Calculate BMI for 2022
        double bmi2022 = weight2022 / (height2022 * height2022) * 703;

        // Print BMI for 2022
        System.out.println("Your BMI in 2022 is " + bmi2022);

        // Calculate difference in BMI from 2021 to 2022
        double bmiDifference = bmi2022 - bmi2021;

        // Print difference in BMI
        System.out.println("The difference in your BMI from 2021 to 2022 is " + bmiDifference);

        // Print whether BMI increased or decreased
        if (bmiDifference > 0) {
            System.out.println("Your BMI increased from 2021 to 2022.");
        } else if (bmiDifference < 0) {
            System.out.println("Your BMI decreased from 2021 to 2022.");
        } else {
            System.out.println("Your BMI remained the same from 2021 to 2022.");
        }

        // Goodbye message
        System.out.println("Thank you for using the BMI100 Tracker. Have a great day!");
    }
}