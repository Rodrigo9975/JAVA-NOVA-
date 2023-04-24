import java.util.Scanner;

public class Sum_digits_String // transformando uma string em int ***
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of single digit numbers: ");
        String num = scanner.nextLine();

        int sum = 0;
        int highes = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i < num.length(); i++) 
        {
            int digit = Character.getNumericValue(num.charAt(i));

            sum += digit;

            if (digit > highes) 
            {
                highes = digit;
            }

            if (digit < lowest) 
            {
                lowest = digit;
            }
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Highest digit: " + highes);
        System.out.println("Lowest digit: " + lowest);
    }
}
