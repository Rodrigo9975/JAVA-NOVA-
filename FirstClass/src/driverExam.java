import java.util.Scanner;

public class driverExam
{
    public static void main(String[] args) 
    {
        char[] gabarito = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
        
        Scanner keyboard = new Scanner(System.in);
        char[] respostas = new char[20];
        
        for(int i = 0; i < respostas.length; i++) 
        {
            System.out.print("Enter answer for question " + (i+1) + ": ");
            respostas[i] = Character.toUpperCase(keyboard.nextLine().charAt(0));
            while (respostas[i] != 'A' && respostas[i] != 'B' && respostas[i] != 'C' && respostas[i] != 'D') 
            {
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                respostas[i] = Character.toUpperCase(keyboard.nextLine().charAt(0));
            }
        }
        
        driverExam2 exam = new driverExam2(gabarito, respostas);
        System.out.println("Total correct answers: " + exam.totalcorrect());
        System.out.println("Total incorrect answers: " + exam.totalincorrect());
        if (exam.passed()) 
        {
            System.out.println("Congratulations, you passed!");
        } 
        else 
        {
            System.out.println("Sorry, you failed.");
            System.out.print("Questions missed: ");
            int[] missed = exam.questionsmissed();
            for (int i = 0; i < missed.length; i++) 
            {
                System.out.print(missed[i]);
                if (i < missed.length - 1) 
                {
                    System.out.print(", ");
                }
            }
        }
    }
}
