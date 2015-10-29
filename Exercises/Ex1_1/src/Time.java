import java.time.LocalDateTime;

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
		StringBuilder sb = new StringBuilder();
		sb.append(hour).append(":");
		if (min<10)
		{
			sb.append(0).append(String.valueOf(min)).append(":");
		}
		else
			sb.append(min).append(":");
		if (sec<10)
		{
			sb.append(0).append(String.valueOf(sec));
		}
		else
			sb.append(sec);
		return sb.toString();
	}
}
