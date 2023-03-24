import java.util.Scanner;
public class largest_smallest 
{

	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner(System.in);
	        
	     int maior = Integer.MIN_VALUE;
	     int menor = Integer.MAX_VALUE;
	     int numero;

	     System.out.println("enter any and as many numbers as you want. ");
	     System.out.println("If you are done writing the number, please insert -99 ");
		

	     while(true)
	     {
	    	 numero = keyboard.nextInt();

	            if(numero == -99) 
	            {
	                break;
	            }
	            if(numero > maior) 
	            {
	                maior = numero; 
	            }
	            if(numero < menor) 
	            {
	                menor = numero;    
	            }   
	        }
	        System.out.println("the biggest number is" + " " + maior);
	        System.out.println("The smallest number is " + " "+ menor);     

		    }
		}

	


