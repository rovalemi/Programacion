package model;

import java.time.LocalDate;

public class Moto extends Vehicle {
    
    // ATRIBUTOS
    boolean hasSideCar;
    
    // GETTERS Y SETTERS
    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
    
    // CONSTRUCTORES
    public Moto(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
    }
    
    public Moto(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight, boolean hasSideCar) {
        super(brand, plate, model, power, seats, color, motor, fuel, manufactureDate, weight);
        this.hasSideCar = hasSideCar;
    }

    public Moto() {
    }

    // MÉTODOS HEREDADOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INI-MOTO:\n");
        sb.append(super.toString());
        if (hasSideCar) { sb.append("\ntiene sidecar = Si"); } else { sb.append("\ntiene sidecar = No"); }
        sb.append("\nFIN-MOTO");
        return sb.toString();
    }
}