import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        
        
        Passenger passenger = new Passenger(pickup, destination);
        
        
        return company.schedulePickup(passenger);
    }
}
