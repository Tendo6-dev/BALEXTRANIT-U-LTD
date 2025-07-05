import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    
    @Test
    public void testSchedulePickupWithAvailableVehicle() {
        Company company = new Company();
        // Add a vehicle to the company
        company.addVehicle(new Taxi("T1", 4));
        
        Passenger passenger = new Passenger(new Location(10, 10), new Location(20, 20));
        assertTrue(company.schedulePickup(passenger));
    }
    
    @Test
    public void testSchedulePickupWithNoAvailableVehicle() {
        Company company = new Company();
        // Don't add any vehicles
        
        Passenger passenger = new Passenger(new Location(10, 10), new Location(20, 20));
        assertFalse(company.schedulePickup(passenger));
    }
}
