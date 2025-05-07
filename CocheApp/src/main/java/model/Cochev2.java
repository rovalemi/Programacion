package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cochev2 {
    
    // ATRIBUTOS
    String brand;
    String plate;
    String model;
    int power;
    int seats;
    ColorEnum color;
    String motor;
    double speed;
    CombustibleEnum fuel;
    String manufacturing_date;
    
    // CONSTRUCTORES
    public Cochev2() {
    }
    
    // Datos de fabrica
    public Cochev2(String brand, String model, int power, int seats, ColorEnum color, String motor, CombustibleEnum fuel, String manufacturing_date) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.seats = seats;
        this.color = color;
        this.motor = motor;
        this.fuel = fuel;
        this.manufacturing_date = manufacturing_date;
    }

    public Cochev2(String brand, String plate, String model, int power, int seats, ColorEnum color, String motor, double speed, CombustibleEnum fuel, String manufacturing_date) {
        this.brand = brand;
        this.plate = plate;
        this.model = model;
        this.power = power;
        this.seats = seats;
        this.color = color;
        this.motor = motor;
        this.speed = speed;
        this.fuel = fuel;
        this.manufacturing_date = manufacturing_date;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= 240) {
            this.speed = speed;
        }
    }

    public CombustibleEnum getFuel() {
        return fuel;
    }

    public void setFuel(CombustibleEnum fuel) {
        this.fuel = fuel;
    }

    public String getManufacturing_date() {
        return manufacturing_date;
    }

    public void setManufacturing_date(String manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INI-COCHE:\n");
        if (brand != null) sb.append("marca = ").append(brand);
        if (plate != null) sb.append("\nmatricula = ").append(plate);
        if (model != null) sb.append("\nmodelo = ").append(model);
        if (power > 0) sb.append("\npotencia = ").append(power);
        if (seats > 0) sb.append("\nplazas = ").append(seats);
        if (color != null) sb.append("\ncolor = ").append(color);
        if (motor != null) sb.append("\nmotor = ").append(motor);
        if (speed > 0) sb.append("\nvelocidad = ").append(speed);
        if (fuel != null) sb.append("\ncombustible = ").append(fuel);
        if (manufacturing_date != null) sb.append("\nfecha de fabricacion = ").append(manufacturing_date);
        sb.append("\nFIN-COCHE");
        return sb.toString();
    }
    
    public double frenar() {
        double velocidadActual;

        velocidadActual = getSpeed()- 10;
        
        if (velocidadActual > 0) {
            
            setSpeed(velocidadActual);
        }
        
        return getSpeed();
    }
    
    public double acelerar() {
        double velocidadActual;

        velocidadActual = getSpeed() + 10;
        
        if (velocidadActual < 240) {
            
            setSpeed(velocidadActual);
        }
        
        return getSpeed();
    }
    
    public double frenar(float num) {
        double velocidadActual;

        velocidadActual = getSpeed() - num;
        
        if (velocidadActual > 0) {
            
            setSpeed(velocidadActual);
        }
        
        return getSpeed();
    }

    public double acelerar(float num) {
        double velocidadActual;

        velocidadActual = getSpeed() + num;
        
        if (velocidadActual < 240) {
            
            setSpeed(velocidadActual);
        }
        
        return getSpeed();
    }
    
    public int calcularAntiguedad() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate madeDate = LocalDate.parse(manufacturing_date, dtf);
        
        Period period = Period.between(madeDate, today);

        return period.getYears();
    }
}