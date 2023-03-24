import java.util.Scanner;
public class TimeCalculator 
{
public static void main(String[] args)
    {
	 Scanner keyboard = new Scanner(System.in);
     System.out.print("Input seconds: ");
     
	    int seconds = keyboard.nextInt();
        int S = seconds;
        int M = seconds/60;
        int H = seconds/3600;
        int D = seconds/86400;
        
        
        
        if(seconds < 60)
        {
        	System.out.println(S +" "+ "seconds");
        }
        else if(seconds >= 60 && seconds < 3600)
        {
        	System.out.println(M +" "+ "minutes");
        }
        else if(seconds >=3600 && seconds < 86400)
        {
        	System.out.println(H +" "+ "hours");     	
        }
        else
        {
        	System.out.println(D +" "+ "days");
        	
        }      
		
    }
 }	
	 	
	


