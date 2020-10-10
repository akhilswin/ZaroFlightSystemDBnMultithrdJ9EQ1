package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MainClassTest {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	void testViewFlightBySourceDestination() throws Exception {
		// Test will pass
		ArrayList<Flight> resultFlightList = new ArrayList<Flight>();
		ArrayList<Flight> expectedFlightList = new ArrayList<Flight>();
		String stringExpected = null;
		String stringResult = null;
		FlightManagementSystem flightManagementSystem = new FlightManagementSystem();
		String source = "Dubai";
		String destination = "Kochi";
		resultFlightList = flightManagementSystem.viewFlightBySourceDestination(source, destination);
		Flight flight = new Flight(18222, "Dubai", "Kochi", 25, 50000.0);
		expectedFlightList.add(flight);
		for (Flight flightList2 : expectedFlightList) {
			stringExpected = (flightList2.getFlightId() + " " + flightList2.getSource() + " "
					+ flightList2.getDestination() + " " + flightList2.getNoOfSeats() + " "
					+ flightList2.getFlightFare()).toString();
		}
		for (Flight flightList1 : resultFlightList) {
			stringResult = (flightList1.getFlightId() + " " + flightList1.getSource() + " "
					+ flightList1.getDestination() + " " + flightList1.getNoOfSeats() + " "
					+ flightList1.getFlightFare()).toString();
		}
		yakshaAssert(currentTest(), (stringExpected.equals(stringResult) ? "true" : "false"), businessTestFile);
	}
}
