public class VehicleRentalTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAT-5500", "Toyota", 3, 8000.0);
        Vehicle vehicle2 = new Bike("BJF-2026", "Yamaha", 5, 500.0);

        System.out.println("=== Vehicle 1 (Car) ===");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n=== Vehicle 2 (Bike) ===");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());

        System.out.println("Runtime polymorphism: Java chooses the overridden method at runtime based on the actual object type.");
    }
}