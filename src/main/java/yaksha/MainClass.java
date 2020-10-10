package yaksha;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		String source = null;
		String destination = null;
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		FlightManagementSystem flightManagementSystem = new FlightManagementSystem();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter source");
		source = scanner.next();
		System.out.println("Enter destination");
		destination = scanner.next();
		flightList = flightManagementSystem.viewFlightBySourceDestination(source, destination);
		System.out.println("Flight details\n");
		for (Flight flightList1 : flightList) {
			System.out.println(
					flightList1.getFlightId() + " " + flightList1.getSource() + " " + flightList1.getDestination() + " "
							+ flightList1.getNoOfSeats() + " " + flightList1.getFlightFare());
		}
		scanner.close();
	}
}
