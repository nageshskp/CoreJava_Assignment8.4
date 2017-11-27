public class ReserveTickets{

public static void main(String[] args){

	BusReservation reserveBus = new BusReservation();

	PassengerThread pt1 = new PassengerThread(2,reserveBus ,"Johnson");

	PassengerThread pt2 = new PassengerThread(3, reserveBus , "Mike");
	pt1.start();	
	pt2.start();	
}
}