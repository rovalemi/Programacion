package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    // ATRIBUTOS
    String brand;
    String plate;
    String model;
    int power;
    int seats;
    ColorEnum color;
    String motor;
    CombustibleEnum fuel;
    LocalDate manufactureDate;
    double weight;

    // CONSTRUCTORES
    public Vehicle(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, LocalDate manufactureDate, double weight) {
        this.brand = brand;
        this.plate = plate;
        this.model = model;
        this.power = power;
        this.seats = seats;
        this.color = color;
        this.motor = motor;
        this.fuel = fuel;
        this.manufactureDate = manufactureDate;
        this.weight = weight;
    }
    
    public Vehicle() {
    }
    
    // GETTERS Y SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public CombustibleEnum getFuel() {
        return fuel;
    }

    public void setFuel(CombustibleEnum fuel) {
        this.fuel = fuel;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // MÉTODOS PÚBLICOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (brand != null && !brand.isEmpty()) sb.append("marca = ").append(brand);
        if (plate != null && !plate.isEmpty()) sb.append("\nmatricula = ").append(plate);
        if (model != null && !model.isEmpty()) sb.append("\nmodelo = ").append(model);
        if (power > 0) sb.append("\npotencia = ").append(power);
        if (seats > 0) sb.append("\nplazas = ").append(seats);
        if (color != null) sb.append("\ncolor = ").append(color);
        if (motor != null && !motor.isEmpty()) sb.append("\nmotor = ").append(motor);
        if (fuel != null) sb.append("\ncombustible = ").append(fuel);
        if (manufactureDate != null) sb.append("\nfecha de fabricacion = ").append(manufactureDate.format(dtf));
        return sb.toString();
    }
}