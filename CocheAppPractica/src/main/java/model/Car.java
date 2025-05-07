package model;

import java.time.LocalDate;

public class Car extends Vehicle {
    
    // ATRIBUTOS
    int numDoors;
    
    // GETTERS Y SETTERS
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }    

    // CONSTRUCTORES
    public Car(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
    }
    
    public Car(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight, int numDoors) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
        this.numDoors = numDoors;
    }
    
    public Car() {
    }
    
    // MÉTODOS HEREDADOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INI-COCHE:\n");
        sb.append(super.toString());
        if (numDoors > 0) sb.append("\npuertas = ").append(numDoors);
        sb.append("\nFIN-COCHE");
        return sb.toString();
    }
}