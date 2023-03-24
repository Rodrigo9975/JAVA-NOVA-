import java.util.Scanner; // Needed for the Scanner class - to input data

/**
   Write a program that computes the tax and tip on a restaurant bill. 
The program should ask the user to enter the charge for the meal. 
The tax should be 6.75 percent of the meal charge. 
The tip should be 20 percent of the total after adding the tax. 
Display the meal charge, tax amount, tip amount, and total bill on the screen.
*/

public class Chap2_13
{
   public static void main(String[] args)
   {
	   //identificar os valores fixos
	   final double TAX_RATE = 0.0675; 
	   final double TIP_RATE = 0.2;
	   //identificar valores  variaveis
	   double charge;
	   double tip;
	   double tax;
	   double total;
	   
	   
	   Scanner keyboard = new Scanner(System.in); //keyboard conecta com o programa 
	   
	   System.out.print("how much is the bill : $ ");// perguntar para o usuario
	   charge = keyboard.nextDouble();
	   // calcular as formulas
	   tax = charge * TAX_RATE;
	   tip = (charge + tax)* TIP_RATE;
	   total = charge + tip + tax;
	   
	   // print o resultado como vc quer que apareça para o usuario
	      System.out.print("Your bill              $");
	      System.out.println(charge);
	      System.out.print("Tax                    $");
	      System.out.println(tax);
	      System.out.print("Tip                    $");
	      System.out.println(tip);
	      System.out.print("Total Bill             $");
	      System.out.println(total);
      
   }
}


/** INPUT   -  PROCESSING   -  OUTPUT
 *  custo      pedir ao         custo 
 *   da        usuario o        taxa de serviço
 *  conta      custo da         tip 
 *             conta            total somado 
               +
               calcular as taxes
               +
               calcular tip        
               +
               calcular o total        
               +
               mostrar os valores 
        */
