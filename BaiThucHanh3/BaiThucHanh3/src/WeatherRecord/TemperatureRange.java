package WeatherRecord;

public class TemperatureRange {
	double low;
	double high;
	public TemperatureRange(double low, double high) {
		this.low = low;
		this.high = high;
	}
	boolean withinRange(TemperatureRange that) {
		return (this.low >= that.low) && 
				(this.high <= that.high);
	}
}
