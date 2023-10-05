import java.util.ArrayList;

public class DatabaseManager {
    ArrayList<Service> services = new ArrayList<>();

    public void addToList(Service services) {
        this.services.add(services);
        for (Service s : this.services) {
            System.out.println(s.cost + " " + s.mileage);
        }
    }

}
