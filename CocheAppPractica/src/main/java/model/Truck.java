package model;

import java.time.LocalDate;

public class Truck extends Vehicle {
    
    // ATRIBUTOS
    int numWheels;
    double maxLoad;

    // GETTERS Y SETTERS
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    // CONSTRUCTORES
    public Truck(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
    }

    public Truck(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight, int numWheels, double maxLoad) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
        this.numWheels = numWheels;
        this.maxLoad = maxLoad;
    }

    public Truck() {
    }
    
    // MÉTODOS HEREDADOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INI-CAMION:\n");
        sb.append(super.toString());
        if (numWheels > 0) sb.append("\nllantas = ").append(numWheels);
        if (maxLoad > 0) sb.append("\ncarga maxima = ").append(maxLoad);
        sb.append("\nFIN-CAMION");
        return sb.toString();
    }
}