import java.util.Random;
import java.util.Scanner;

public class ESP_Game 
{
	public static final int chutes = 10;
    public static final String[]cor={"red","green","blue","orange","yellow"};
    
    
    
    public static void main(String[]args) 
    {        
        int numCorrect = guess();
        System.out.println("You correctly guessed the color " + numCorrect + " times.");
    }
   
    public static int guess() 
    {
        Random generator = new Random();        
        Scanner keyboard = new Scanner(System.in);
        
        
        int numCorrect = 0;

        for(int i=0;i<chutes;i++) 
        {
        	String color = escolha(generator);
            System.out.print("Pick a color: ");
        	String guess = keyboard.nextLine();
            System.out.println("correct color was: "+color);
            
            if (guess.equalsIgnoreCase(color)) 
            {
                numCorrect++;
            }
        }
        return numCorrect;
    }
    public static String escolha(Random ran) 
    {
        int RECORD =ran.nextInt(cor.length);
        return cor[RECORD];
    }
}
