package yaksha;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FlightManagementSystem {
	public ArrayList<Flight> viewFlightBySourceDestination(String source, String destination) {
		String source1 = source;
		String destination1 = destination;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DB.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(
					"select * from flight where source='" + source1 + "' and destination='" + destination1 + "'");
			while (rs.next()) {
				int flightId2 = rs.getInt(1);
				String source2 = rs.getString(2);
				String destination2 = rs.getString(3);
				int noOfSeats2 = rs.getInt(4);
				double flightFare2 = rs.getDouble(5);
				Flight flight = new Flight(flightId2, source2, destination2, noOfSeats2, flightFare2);
				flightList.add(flight);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return flightList;
	}
}
