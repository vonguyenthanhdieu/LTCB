package WeatherRecord;

public class WeatherRecord {
	Date d;
	TemperatureRange today;
	TemperatureRange normal;
	TemperatureRange record;
	double precipitation;
	/**Provides the data definition for a weather recording program.
	 * Example: 
	 * TemperatureRange today1 = new TemperatureRange(13.9 , 35.0 ); 
	 * TemperatureRange normal1 = new TemperatureRange(20.0 , 35.1 );
	 * TemperatureRange record1 = new TemperatureRange(4.3, 11.7);
	 * WeatherRecord w1= new WeatherRecord(new Date(12, 4, 2022), today1, normal1, record1 , 0.56);
	 * TemperatureRange today2 = new TemperatureRange(22.4, 37.0);
	 * TemperatureRange normal2 = new TemperatureRange(20.0 , 38.1 );
	 * TemperatureRange record2 = new TemperatureRange(4.3, 11.7);
	 * WeatherRecord w2= new WeatherRecord(new Date(13, 4, 2022), today2, normal2, record2 , 0.9);
	 */

	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
	/**
	 * withinRange, which determines whether today's high 
	 * and low were within the normal range;*/
	boolean withinRange() {
		return this.today.withinRange(normal);
	}
	/**rainyDay, which determines whether the precipitation 
	 * is higher than some given value;*/
	boolean rainyDay(double thatPercipitation) {
		return this.precipitation >= thatPercipitation;
	}
	/**recordDay, which determines whether the temperature 
	 * today broke either the high or the low record.*/
	boolean recordDay() {
		return !(this.today.withinRange(record));
	}
}