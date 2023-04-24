public class Television 
{
    private final String MANUFACTURER;
    private final int SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;
    private int portable;

    public Television(String manufacturer, int screenSize)
    {
        this.MANUFACTURER = manufacturer;
        this.SIZE = screenSize;
        this.powerOn = false;
        this.channel = 2;
        this.volume = 20;
        
    }

    public void setChannel(int channel)
    {
        this.channel = channel;
    }

    public void power()
    {
        this.powerOn = !this.powerOn;
    }

    public void increaseVolume() 
    {
        this.volume++;
    }

    public void decreaseVolume() 
    {
        this.volume--;
    }

    public int getChannel() 
    {
        return this.channel;
    }

    public int getVolume() 
    {
        return this.volume;
    }

    public String getManufacturer() 
    {
        return this.MANUFACTURER;
    }

    public int getScreenSize() 
    {
        return this.SIZE;
    }
    
}
