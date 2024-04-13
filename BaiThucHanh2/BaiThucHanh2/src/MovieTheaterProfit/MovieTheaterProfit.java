package MovieTheaterProfit;

public class MovieTheaterProfit {
	double ticketPrice;
	double performance;
	double service;
	public MovieTheaterProfit(double ticketPrice, double performance, double service) {
		this.ticketPrice = ticketPrice;
		this.performance = performance;
		this.service = service;
	}
	double totalProfit(int numberAttendees) {
		double result =0 ;
		double totalTicketPrice = this.ticketPrice * numberAttendees;
		double totalCost = this.performance + this.service * numberAttendees;
		result = totalTicketPrice - totalCost;
		return result;
	}
}
