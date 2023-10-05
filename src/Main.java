public class Main {
    public static void main(String[] args) {
        Service service = new Clutch();
        service.setCost(3000);
        service.setMileage(200000);
        int cost = 3000;
        int mileage = 200000;
        service.performService();
        DatabaseManager dm = new DatabaseManager();
        dm.addToList(service);

        System.out.println("Hello world!");
        System.out.println("jeffreys main");
    }
}