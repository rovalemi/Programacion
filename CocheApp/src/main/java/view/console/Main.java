
package view.console;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Car;
import model.Coche;
import model.ColorEnum;
import model.CombustibleEnum;
import model.Truck;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        // ARRAYLIST - Lista dinamica que va creaciendo a medida que vamos añadiendo elementos
        ArrayList<Car> listCars = new ArrayList<Car>();
        
        Car car1 = new Car("Ford", "AAAA-789", "Mustang", 450, 5, ColorEnum.ROJO, "Manual", 80, CombustibleEnum.Diesel, LocalDate.parse("10/03/2020", dtf), 1000, 5);
        Car car2 = new Car("Ferrari", "ABCD-123", "Testarrosa", 450, 6, ColorEnum.AZUL, "Automatico", 100, CombustibleEnum.Electrico, LocalDate.parse("10/03/2020", dtf), 950, 4);
        Car car3 = new Car("Ferrari", "DEFC-789", "Testarrosa", 450, 5, ColorEnum.NEGRO, "Automatico", 70, CombustibleEnum.Gasolina, LocalDate.parse("10/03/2020", dtf), 1200, 5);
//        Truck truck1 = new Truck();
//        
//        // EXAMPLES
//        System.out.println("Tamanyo listaCoches: " + listCars.size());
//        listCars.add(car1);
//        System.out.println("Tamanyo listaCoches: " + listCars.size());
//        listCars.add(car2);
//        System.out.println("Tamanyo listaCoches: " + listCars.size());
//        listCars.add(car3);
//        Car carFound = null;
//        
//        // IMPRIMIR SOLO FERRARIS
//        System.out.println("\n------ Solo Ferraris ------");
//        for (Car elemCar : listCars) {
//            if (elemCar.getBrand() != null && elemCar.getBrand().equalsIgnoreCase("Ferrari")) {
//                System.out.println("");
//                System.out.println(elemCar);
//                carFound = elemCar;
//            }
//        }
//        
//        listCars.remove(carFound);
//        System.out.println("\n------ Final bucle Solo Ferraris ------");
//        
//        System.out.println("Lista actualizada de coches");
//        for (Car car : listCars) {
//            System.out.println("");
//            System.out.println(car);
//        }
//        
//        System.out.println("\nCantidad de coches: " + listCars.size());
        
        String opcion = "";
       
        System.out.print("Ingresa tu nombre: ");
        String name = sc.next();
        System.out.println("Hola " + name + "!");
        
        Coche coche0 = new Coche("Toyota", "Yaris", 400, 5, ColorEnum.AZUL, "Manual", CombustibleEnum.Electrico, "24/02/2010");
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Metodo mostrar()");
            System.out.println("2 - Metodo frenar()");
            System.out.println("3 - Metodo acelerar()");
            System.out.println("4 - Metodo frenar(float num)");
            System.out.println("5 - Metodo acelerar(float num)");
            System.out.println("6 - Metodo calcularAntiguedad()");
            System.out.println("7 - Metodo toString()");
            System.out.print("Ingresa opcion: ");
            opcion = sc.next();
            
            float num;
            
            switch (opcion) {
                case "1" -> System.out.println("Velocidad actual: "+ coche0.getSpeed()+ " km/h");
                case "2" -> System.out.println("Nueva velocidad: "+ coche0.frenar() + " km/h");
                case "3" -> System.out.println("Nueva velocidad: "+ coche0.acelerar() + " km/h");
                case "4" -> {
                    System.out.print("Ingresa el numero a restar: ");
                    num = sc.nextFloat(); 
                    System.out.println("Nueva velocidad: "+ coche0.frenar(num) + " km/h");
                }
                case "5" -> {
                    System.out.print("Ingresa el numero a sumar: ");
                    num = sc.nextFloat(); 
                    System.out.println("Nueva velocidad: " + coche0.acelerar(num) + " km/h");
                }
                case "6" -> System.out.println("Antiguedad: " + coche0.calcularAntiguedad() + " años.");
                case "7" -> System.out.println(coche0.toString());
                default -> System.out.println("Goodbye!");
            }
        }
        

        
//        Coche coche1;
//        coche1 = new Coche();
//        
//        coche1.setMarca("Ferrari");
//        coche1.setMatricula("9654-FHJ");
//        coche1.setModelo("288 GTO");
//        coche1.setPotencia(2000);
//        coche1.setPlazas(5);
//        coche1.setColor(ColorEnum.GRIS);
//        coche1.setMotor("Automático");
//        coche1.setCombustible(CombustibleEnum.Gasolina);
//        
//        System.out.println("------- DATOS DE COCHE 1 -------");
//        System.out.println("Marca: " + coche1.getMarca());
//        System.out.println("Matricula: " + coche1.getMatricula());
//        System.out.println("Modelo: " + coche1.getModelo());
//        System.out.println("Potencia: " + coche1.getPotencia());
//        System.out.println("Plazas: " + coche1.getPlazas());
//        System.out.println("Color: " + coche1.getColor());
//        
//        Coche coche2 = new Coche("Toyota", "1111KYP", "Yaris", 400, 5, ColorEnum.AZUL, "Manual", 0.0, CombustibleEnum.Eléctrico);
//        
//        System.out.println("coche2: " + coche2.getMatricula());
//        
//        System.out.println("");
//        
//        System.out.println(coche2.toString());
//        
//        Coche coche3;
//        
//        coche3 = coche2;
//        
//        coche3.setMatricula("2222KYP");
//        
//        System.out.println("coche2: " + coche2.getMatricula());
//        
//        Coche coche4 = new Coche("Toyota", "1111KYP", "Yaris", 400, 5, ColorEnum.AZUL);
//        
//        if (coche4 == coche2) {
//            System.out.println("iguales");
//        } else {
//            System.out.println("diferentes");
//        }
    }
    
    private void CalcularConsumo() {
        System.out.println("El consumo es de: " );
    }
}