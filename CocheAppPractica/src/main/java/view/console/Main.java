package view.console;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.Car;
import model.ColorEnum;
import model.CombustibleEnum;
import model.Moto;
import model.Truck;
import model.Vehicle;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static ArrayList<Vehicle> listVehicles = new ArrayList<Vehicle>();

    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String opcion = "";
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Crear un objeto de tipo Coche");
            System.out.println("2 - Crear un objeto de tipo Moto");
            System.out.println("3 - Crear un objeto de tipo Bus");
            System.out.println("4 - Mostrar matriculas de todos los vehiculos");
            System.out.println("5 - Mostrar datos de vehiculo por matricula");
            System.out.println("6 - Mostrar total de vehiculos creados");
            System.out.println("7 - Mostrar total de coches creados");
            System.out.println("8 - Mostrar total de motos creados");
            System.out.println("9 - Mostrar total de camiones creados");
            System.out.println("10 - Mostrar y eliminar vehiculo por matricula");
            System.out.print("Ingresa opcion: ");
            opcion = sc.next();
            
            String plateSearch;
            
            switch (opcion) {
                case "1" -> createNewCar();
                case "2" -> createNewMoto();
                case "3" -> createNewTruck();
                case "4" -> showAllVehiclesPlates();
                case "5" -> {
                    System.out.print("Ingresa la matricula: ");
                    plateSearch = sc.next(); 
                    showVehicleInfo(plateSearch);
                }
                case "6" -> showTotalVehicles();
                case "7" -> showTotalCars();
                case "8" -> showTotalMotos();
                case "9" -> showTotalTrucks();
                case "10" -> {
                    System.out.print("Ingresa la matricula: ");
                    plateSearch = sc.next(); 
                    showAndDeleteVehicle(plateSearch);
                } 
                default -> System.out.println("Goodbye!");
            }
        }
    }
    
    private static void createNewVehicle(String typeVehicle) {
        System.out.print("Introduce la marca: ");
        String brand = sc.next();
        
        System.out.print("Introduce la placa: ");
        String plate = sc.next();
        
        System.out.print("Introduce el modelo: ");
        String model = sc.next();
        
        System.out.print("Introduce la potencia: ");
        int power = sc.nextInt();
        
        System.out.print("Introduce el numero de asientos: ");
        int seats = sc.nextInt();
        
        System.out.println("Colores: " + Arrays.toString(ColorEnum.values()));
        System.out.print("Introduce el color: ");
        String color = sc.next();
        ColorEnum colorEnum = ColorEnum.valueOf(color);
        
        System.out.print("Introduce el motor (Manual/Automatico): ");
        String motor = sc.next();
        
        System.out.println("Tipos de combustible:" + Arrays.toString(CombustibleEnum.values()));
        System.out.print("Introduce el tipo de combustible: ");
        String fuel = sc.next();
        CombustibleEnum combustibleEnum = CombustibleEnum.valueOf(fuel);
        
        System.out.print("Introduce la fecha de fabricacion (dd/MM/yyyy): ");
        String manufactureDate = sc.next();
        
        System.out.print("Introduce el peso: ");
        double weight = sc.nextDouble();
        
        switch (typeVehicle) {
            case "Car":
                System.out.print("Introduce el numero de puertas: ");
                int numDoors = sc.nextInt();
                Vehicle newCar = new Car(brand, plate, model, power, seats, colorEnum, motor, combustibleEnum, LocalDate.parse(manufactureDate, dtf), weight, numDoors);
                listVehicles.add(newCar);
                System.out.println("Coche creado y agregado a la lista.");
                break;
            case "Moto":
                System.out.print("La moto tiene sidecar? (si/no): ");
                String answer = sc.next();
                boolean hasSideCar;
                switch (answer.toLowerCase()) {
                    case "si":
                        hasSideCar = true;
                        break;
                    case "no":
                        hasSideCar = false;
                        break;
                    default:
                        throw new AssertionError();
                }
                Vehicle newMoto = new Moto(brand, plate, model, power, seats, colorEnum, motor, combustibleEnum, LocalDate.parse(manufactureDate, dtf), weight, hasSideCar);
                listVehicles.add(newMoto);
                System.out.println("Moto creada y agregada a la lista.");
                break;
            case "Truck":
                System.out.print("Introduce el numero de ruedas: ");
                int numWheels = sc.nextInt();
                System.out.print("Introduce la carga maxima (kg): ");
                double maxLoad = sc.nextDouble();
                Vehicle newTruck = new Truck(brand, plate, model, power, seats, colorEnum, motor, combustibleEnum, LocalDate.parse(manufactureDate, dtf), weight, numWheels, maxLoad);
                listVehicles.add(newTruck);
                System.out.println("Camion creado y agregado a la lista.");
                break;
            default:
                System.out.println("Tipo de vehiculo no reconocido.");
                break;
        }
    }

    private static void createNewCar() {
        createNewVehicle("Car");
    }

    private static void createNewMoto() {
        createNewVehicle("Moto");
    }

    private static void createNewTruck() {
        createNewVehicle("Truck");
    }

    private static void showAllVehiclesPlates() {
        if (listVehicles.size() <= 0) {
            System.out.println("No hay vehiculos registrados.");
        } else {
            System.out.println("Matriculas de los vehiculos:");
            for (Vehicle elemVeh : listVehicles) {
                System.out.println(elemVeh.getPlate());
            }
        }
    }

    private static void showVehicleInfo(String plateSearch) {
        boolean found = false;
        for (Vehicle elemVeh : listVehicles) {
            if (elemVeh.getPlate().equalsIgnoreCase(plateSearch)) {
                found = true;
                System.out.println("Vehiculo encontrado:");
                System.out.println(elemVeh);
                break;
            }
        }
        
        if (!found) {
            System.out.println("No se encontro un vehiculo con la matricula " + plateSearch + ".");
        }
    }

    private static void showTotalVehicles() {
        System.out.println("Total de vehiculos: " + listVehicles.size());
    }

    private static void showTotalCars() {
        int count = 0;
        for (Vehicle elemVeh : listVehicles) {
            if (elemVeh instanceof Car) {
                count++;
            }
        }
        System.out.println("Total de coches: " + count);
    }

    private static void showTotalMotos() {
        int count = 0;
        for (Vehicle elemVeh : listVehicles) {
            if (elemVeh instanceof Moto) {
                count++;
            }
        }
        System.out.println("Total de motos: " + count);
    }

    private static void showTotalTrucks() {
        int count = 0;
        for (Vehicle elemVeh : listVehicles) {
            if (elemVeh instanceof Truck) {
                count++;
            }
        }
        System.out.println("Total de camiones: " + count);
    }

    private static void showAndDeleteVehicle(String plateSearch) {
        boolean found = false;
        for (Vehicle elemVeh : listVehicles) {
            if (elemVeh.getPlate().equalsIgnoreCase(plateSearch)) {
                found = true;
                System.out.println("Vehiculo encontrado: " + elemVeh);
                listVehicles.remove(elemVeh);
                System.out.println("Vehiculo con matricula " + plateSearch + " ha sido eliminado.");
                break;
            }
        }
        
        if (!found) {
            System.out.println("No se encontro un vehiculo con la matricula " + plateSearch + ".");
        }
    }
}