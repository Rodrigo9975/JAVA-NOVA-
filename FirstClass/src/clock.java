
public class clock 
{
		private int seconds;
		private int minutes;
		private int hours;
		
		public clock(int s, int m,int h) 
		{
			settime(s,m,h);
			
		}
		public clock(clock r) 
		{
			seconds = r.seconds;
			minutes = r.minutes;
			hours = r.hours;
		}
		public void settime(int s, int m,int h)
		{
			if(s < 60 && s >= 0)
				seconds = s;
			else
				seconds = 0;
			if(m < 60 && m >= 0)
				minutes = m;
			else
				minutes = 0;
				
			if(h < 24 && h >= 0)
				hours = 0;
			else
				hours = 0;	
		}
		public void tick()
		{
			seconds++;
			if(seconds == 60) 
			{
				seconds = 0;	
			increminutes();
			}
			
		}
		public void increminutes()
		{
			minutes++;
			if(minutes == 60) 
			{
				minutes = 0;		
			increhours();
			}
			
		}
		public void increhours()
		{
			hours++;
			if(hours == 24) 
			{
				hours = 0;
			}
		}
		public String toString() 
		{
			return (" "+hours+" "+ minutes+" "+seconds);		
		}
		public boolean equals(clock r)
		{
			boolean b;
			if(seconds == r.seconds && minutes ==r.minutes && hours == r.hours)
				b =true;
			else
				b=false;
			return b;
		}	
}
