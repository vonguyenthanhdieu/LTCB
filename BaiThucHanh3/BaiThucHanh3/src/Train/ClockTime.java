package Train;

public class ClockTime {
	private int hour;
	private int minute;
	/**
	 * @param hour
	 * @param minute
	 * Example:
	 * ClockTime ct1 = new ClockTime(5, 17);
	 * ClockTime ct2 = new ClockTime(21, 30);
	 * ClockTime ct3 = new ClockTime(1, 20);
	 */
	public ClockTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public ClockTime(int minutes){
		this.hour = minutes / 60;
		this.minute = minutes % 60;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ClockTime ct1;
	 * ClockTime ct2 = new ClockTime(14, 30);
	 * Route ct3 = new Route("Thu Duc", "Binh Thuan");
	 * ct2.equals(ct1) => False;
	 * ct2.equals(new ClockTime(14, 30)) => True;
	 * ct2.equals(ct3) => false;
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ClockTime))
			return false;
		else{
			ClockTime that = (ClockTime)obj;
			return this.hour == that.hour
					&& this.minute == that.minute;
		}
	}
	
	public ClockTime sub(ClockTime that) {
		// TODO Auto-generated method stub
		if(this.greaterThan(that))
			return new ClockTime(this.changeMinute() - that.changeMinute());
		else
			return new ClockTime(24*60+this.changeMinute() - that.changeMinute());
	}
	private boolean greaterThan(ClockTime that) {
		// TODO Auto-generated method stub
		if(this.hour > that.hour)
			return true;
		else
			if(this.hour == that.hour)
				if(this.minute>=that.minute)
					return true;
				else
					return false;
			else
				return false;
	}
	private int changeMinute() {
		// TODO Auto-generated method stub
		return this.hour*60+ this.minute;
	}
	
	
}
