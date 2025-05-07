
package model;

import java.time.LocalDate;

public class Truck extends Vehicle {

    // CONSTRUCTORES
    public Truck(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, double currentSpeed, CombustibleEnum fuel, LocalDate manufactureDate, double weight) {
        super(brand, plate, model, power, seats, color, motor, currentSpeed, fuel, manufactureDate, weight);
    }

    public Truck() {
    } 
}