public class RainFall 
{	
	public static void main(String[] args) 
    {
        double[] monthlyRainfall = {1.5, 2.0, 3.5, 0.8, 2.2, 1.0, 1.5, 2.8, 3.0, 2.5, 1.3, 0.5};
        RainFall rain = new RainFall(monthlyRainfall);
        

        System.out.println("Total rainfall: " + rain.getTotalRainfall() + " inches");
        System.out.println("Average monthly rainfall: " + rain.getAverageMonthlyRainfall() + " inches");
        System.out.println("Month with most rain: " + (rain.getMonthWithMostRain() + 1));
        System.out.println("Month with least rain: " + (rain.getMonthWithLeastRain() + 1));
    }

    public RainFall(double[] monthlyRainfall) 
    {
        this.monthlyRainfall = monthlyRainfall;
    }
	public double[] monthlyRainfall;
	
    public double getTotalRainfall() 
    {
        double total = 0.0;
        for(double rainfall : monthlyRainfall) 
        {
            total += rainfall;
        }
        return total;
    }
    public double getAverageMonthlyRainfall() 
    {
        return getTotalRainfall() / monthlyRainfall.length;
    }

    public int getMonthWithMostRain() 
    {
        int month = 0;
        double maxRainfall = monthlyRainfall[0];
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > maxRainfall) {
                maxRainfall = monthlyRainfall[i];
                month = i;
            }
        }
        return month;
    }

    public int getMonthWithLeastRain() 
    {
        int month = 0;
        double minRainfall = monthlyRainfall[0];
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < minRainfall) {
                minRainfall = monthlyRainfall[i];
                month = i;
            }
        }
        return month;
    }
  
}