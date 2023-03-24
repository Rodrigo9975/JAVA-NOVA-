import java.util.Scanner;

public class GAME 
{
	public static void main(String[] args)
	{
		String name;
		int age;
		String city;
		String college;
		String profession;
		String type_animal;
		String name_animal;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Your Name : ");// perguntar para o usuario
		   name = keyboard.nextLine();
		System.out.print("Your animal name : ");// perguntar para o usuario
		   name_animal = keyboard.nextLine();
	    System.out.print("Your city : ");// perguntar para o usuario
		   city = keyboard.nextLine();
		System.out.print("Your college : ");// perguntar para o usuario
		   college = keyboard.nextLine();
		System.out.print("Your profession : ");// perguntar para o usuario
		   profession = keyboard.nextLine();
		System.out.print("type of animal : ");// perguntar para o usuario
		   type_animal = keyboard.nextLine();
		System.out.print("Your age : ");// perguntar para o usuario
		   age = keyboard.nextInt();
		   
		System.out.print("There once was a person  named" +" "+ name +" " +"who lived in"+" " + city +"." + "At the age of"+" " + age +", "+ name +" "+ "went to college at" +" "+ college + "." + name +" " +"graduated and went to work as a"+" "
				+ profession+".Then,"+" "+ name +" "+"adopted a(n)"+" "+ type_animal +" "+"named" +" "+name_animal+" "+". They both lived\r\n"
				+ "happily ever after!");
		   
		   
	}
	
}
