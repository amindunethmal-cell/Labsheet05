# Labsheet 05 — Java Polymorphism

A Java project demonstrating the two core types of **polymorphism** in object-oriented programming: **compile-time (method overloading)** and **runtime (method overriding)** polymorphism.

## Project Structure

```
labsheet05/
├── Labsheet05.java               # Main entry point
├── Vehicle.java                  # Base class (parent)
├── Car.java                      # Subclass — runtime polymorphism
├── Bike.java                     # Subclass — runtime polymorphism
├── VehicleRentalTest.java        # Demonstrates runtime polymorphism
├── DeliveryChargeCalculator.java # Demonstrates compile-time polymorphism
└── DeliveryChargeTest.java       # Tests all overloaded charge methods
```

## Concepts Covered

### 1. Runtime Polymorphism — Vehicle Rental System

Implemented via **method overriding**. `Car` and `Bike` both extend `Vehicle` and override its `calculateRentalCost()` method. When called through a `Vehicle` reference, Java resolves the correct method at runtime based on the actual object type.

| Class     | Rental Calculation          |
|-----------|-----------------------------|
| `Vehicle` | Base class — returns `0.0`  |
| `Car`     | `numberOfDays × dailyRate`  |
| `Bike`    | `numberOfHours × hourlyRate`|

**Test class:** `VehicleRentalTest`
```
Vehicle vehicle1 = new Car("CAT-5500", "Toyota", 3, 8000.0);   // → 24000.0
Vehicle vehicle2 = new Bike("BJF-2026", "Yamaha", 5, 500.0);   // → 2500.0
```

### 2. Compile-Time Polymorphism — Delivery Charge Calculator

Implemented via **method overloading**. `DeliveryChargeCalculator` provides four versions of `calculateCharge()`, each accepting a different set of parameters. Java selects the correct version at compile time.

| Method Signature                                    | What it adds              |
|-----------------------------------------------------|---------------------------|
| `calculateCharge(baseCharge)`                       | Base charge only          |
| `calculateCharge(baseCharge, distanceKm)`           | + Rs. 100 per km          |
| `calculateCharge(baseCharge, distanceKm, weightKg)` | + Rs. 50 per kg           |
| `calculateCharge(baseCharge, expressDelivery)`      | + Rs. 500 for express     |

**Test class:** `DeliveryChargeTest`
```
calculator.calculateCharge(1000.0)              // → 1000.0
calculator.calculateCharge(1000.0, 5.0)         // → 1500.0
calculator.calculateCharge(1000.0, 5.0, 2.0)    // → 1600.0
calculator.calculateCharge(1000.0, true)         // → 1500.0
calculator.calculateCharge(1000.0, false)        // → 1000.0
```

## Requirements

- Java JDK 8 or later
- Any Java IDE (NetBeans, IntelliJ IDEA, Eclipse) or command-line `javac`

## Running the Project

### Using an IDE (NetBeans)
1. Open NetBeans and select **File → Open Project**.
2. Navigate to the `labsheet05` folder and open it.
3. Right-click the project and choose **Run**, or run each test class individually.

### Using the Command Line
```bash
# Compile all files
javac *.java

# Run the vehicle rental test
java VehicleRentalTest

# Run the delivery charge test
java DeliveryChargeTest
```

## Notes

- Package: `com.mycompany.labsheet05`
- Author: amidu
- `Vehicle.brand` is declared `protected` to allow direct access in subclasses.
- `Vehicle.calculateRentalCost()` is called via `super` in both `Car` and `Bike` before returning the subclass-specific cost.
