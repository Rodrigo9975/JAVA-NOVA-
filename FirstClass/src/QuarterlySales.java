import java.util.Scanner;

public class QuarterlySales 
{
	public static void main(String[] args) 
	{
        final int division = 6;
        final int quaters = 4;

        Scanner keyboard = new Scanner(System.in);

        double[][] sales = new double[division][quaters];

        for (int i = 0; i < division; i++) 
        {
            System.out.println("Enter sales for Division " + (i+1) + ":");
            for (int j = 0; j < quaters; j++) 
                 {
                do 
                {
                    System.out.print("Quarter " + (j+1) + ": $");
                    sales[i][j] = keyboard.nextDouble();
                    if (sales[i][j] < 0)
                          {
                               System.out.println("Sales cannot be negative.");
                          }
                    } 
                    while (sales[i][j] < 0);
                 }
        }

        for (int i = 0; i < division; i++) {
            System.out.print("Division " + (i+1) + " sales: ");
            for (int j = 0; j < quaters; j++) {
                System.out.print("$" + sales[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < quaters; j++) 
        {
            double totalsales = 0;
            double avgsales = 0;
            double maxsales = 0;
            int supersales = -1;

            System.out.println("Quarter " + (j+1) + " data:");

            for (int i = 0; i < division; i++) 
            {
                totalsales += sales[i][j];
                avgsales += sales[i][j];
                if (sales[i][j] > maxsales) 
                {
                    maxsales = sales[i][j];
                    supersales = i;
                }
            }
            avgsales /= division;

            System.out.println("Total sales: $" + totalsales);
            System.out.println("Average sales: $" + avgsales);
            System.out.println("Division with highest sales: " + (maxsales+1));

            if (j > 0) {
                double prevSales = 0;
                for (int i = 0; i < division; i++) 
                {
                	prevSales += sales[i][j-1];
                }
                double salesDiff = totalsales - prevSales;
                double percentChange = (salesDiff / prevSales) * 100;
                String changeDirection = salesDiff >= 0 ? "increase" : "decrease";
                System.out.printf("Total sales %s by $%.2f (%.2f%%)%n", changeDirection, Math.abs(salesDiff), Math.abs(percentChange));
            }

            System.out.println();
        }
    }
}


