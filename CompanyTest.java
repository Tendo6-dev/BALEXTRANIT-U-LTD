import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    
    @Test
    public void testSchedulePickupWithAvailableVehicle() {
        Company company = new Company();
        
        company.addVehicle(new Taxi("T1", 4));
        
        Passenger passenger = new Passenger(new Location(10, 10), new Location(20, 20));
        assertTrue(company.schedulePickup(passenger));
    }
    
    @Test
    public void testSchedulePickupWithNoAvailableVehicle() {
        Company company = new Company();
        
        
        Passenger passenger = new Passenger(new Location(10, 10), new Location(20, 20));
        assertFalse(company.schedulePickup(passenger));
    }
}
