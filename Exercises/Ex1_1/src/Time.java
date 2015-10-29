import java.time.LocalDateTime;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time {
	
	

	private int hour =0;
	private int min = 0;
	private int sec = 0;
	
	/**
	 * Get the hour
	 * @return hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Set the hour
	 * @param hour
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}


	/**
	 * @return minute
	 */
	public int getMin() {
		return min;
	}



	/**
	 * @param min
	 */
	public void setMin(int min) {
		this.min = min;
	}



	/**
	 * @return
	 */
	public int getSec() {
		return sec;
	}



	/**
	 * @param sec
	 */
	public void setSec(int sec) {
		this.sec = sec;
	}



	
	
	public Time()
	{
		LocalDateTime currentTime =  LocalDateTime.now();
		hour = currentTime.getHour();
		min = currentTime.getMinute();
		sec = currentTime.getSecond();
	}
	
	public Time(int hour,int min,int sec)
	{
		if (validateTime(hour, min, sec))
		{
			this.hour = hour;
	
			this.min = min;
			
			this.sec = sec;
		}
	}
	
	public boolean validateTime(int hour,int min,int sec)
	{
		if (hour< 0 || hour>24) return false;
		if (min<0 || min >59) return false;
		if (sec<0 || sec >59) return false;
		return true;
	}
	
	
	@Override
	public String toString() 
	{
		Date date = new Date(0,0,0, hour, min, sec);
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		return timeFormat.format(date);
	}
}
