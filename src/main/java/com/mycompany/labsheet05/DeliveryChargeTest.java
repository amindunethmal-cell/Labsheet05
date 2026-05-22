public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double baseOnly = calculator.calculateCharge(1000.0);
        double baseAndDistance = calculator.calculateCharge(1000.0, 5.0);
        double baseDistanceWeight = calculator.calculateCharge(1000.0, 5.0, 2.0);
        double baseExpressYes = calculator.calculateCharge(1000.0, true);
        double baseExpressNo = calculator.calculateCharge(1000.0, false);

        System.out.println("=== Delivery Charge Calculator Tests ===");
        System.out.println("1) Base only: " + baseOnly);
        System.out.println("2) Base + Distance (5.0 km): " + baseAndDistance);
        System.out.println("3) Base + Distance (5.0 km) + Weight (2.0 kg): " + baseDistanceWeight);
        System.out.println("4) Base + Express (true): " + baseExpressYes);
        System.out.println("5) Base + Express (false): " + baseExpressNo);

        System.out.println("Compile-time polymorphism: Java selects the overloaded method using the parameter list at compile time.");
    }
}