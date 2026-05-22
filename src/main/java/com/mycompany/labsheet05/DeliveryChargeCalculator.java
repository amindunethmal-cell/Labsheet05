public class DeliveryChargeCalculator {

    private static final double DISTANCE_RATE_PER_KM = 100.0;
    private static final double WEIGHT_RATE_PER_KG = 50.0;
    private static final double EXPRESS_DELIVERY_CHARGE = 500.0;

    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE_PER_KM);
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge
                + (distanceKm * DISTANCE_RATE_PER_KM)
                + (weightKg * WEIGHT_RATE_PER_KG);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        return baseCharge + (expressDelivery ? EXPRESS_DELIVERY_CHARGE : 0.0);
    }
}