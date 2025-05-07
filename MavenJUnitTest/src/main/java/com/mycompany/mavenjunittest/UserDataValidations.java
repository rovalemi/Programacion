package com.mycompany.mavenjunittest;

public class UserDataValidations {
    
    /**
     * Devuelve true or false si el digito de control del NIF es valido
     * @param typeDoc
     * @param id
     * @return true or false
     */
    public static boolean checkId(int typeDoc, String id) {
        // Validar si el tipo de documento es diferente de 1 (NIF)
        if (typeDoc != 1) {
            return false;
        }
        
        // Validar que la cadena es nula o esta vacia o la longitud es diferente de 9
        if (id == null || id.isEmpty() || id.length() != 9) {
            return false;
        }

        // Arreglo con las letras a validar
        char letters[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Crear variables con los numeros y letra de la cadena
        String numbersDoc = id.substring(0, 8);
        char letterDoc = id.charAt(8);
        String letterS = String.valueOf(letterDoc);
        
        // Validar que sean numeros y letra
        if (isNumeric(numbersDoc) && isAlphabetic(letterS)) {
            int numbersInt = Integer.parseInt(numbersDoc);
            // Calcular el resto
            int numC = numbersInt % 23;
            // Validar si coincide con la letra
            if (!(letterDoc == letters[numC])) {
                return false;
            }
        } else {
            return false;
        }
        
        return true;
    }
    
    /**
     * Devuelve true or false si la fecha tiene un formato valido
     * @param date una cadena
     * @return true or false
     */
    public static boolean checkFormatDate(String date) {
        // Validar si la cadena es nula o esta vacia o la longitud es diferente de 10
        if (date == null || date.isEmpty() || date.length() != 10) {
            return false;
        }
        
        // Dividir la fecha usando el delimitador "/"
        String[] parts = date.split("/");
        
        // Validar que contenga exactamente 3 partes (dia, mes, año)
        if (parts.length != 3) {
            return false;
        }
        
        // Convertir las partes de las fechas a int
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int año = Integer.parseInt(parts[2]);
        
        // Validar si la fecha tiene cumple con el formato de fecha
        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 2 -> {
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        return (dia <= 29 && dia >= 1);
                    } else {
                        return (dia <= 28 && dia >= 1);
                    }
                }
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return (dia <= 31 && dia >= 1);
                }
                case 4, 6, 9, 11 -> {
                    return (dia <= 30 && dia >= 1);
                }
                default -> throw new AssertionError();
            }
        } else {
            return false;
        }
    }
    
    /**
     * Devuelve el numero de la edad calculada restando la fecha actual con la fecha de nacimiento
     * @param birthDate una cadena
     * @param actualDate una cadena
     * @return la edad actual
     */
    public static int calculateAge(String birthDate, String actualDate) {
        // Convertir las partes de la fecha de nacimiento a int
        String parts[] = birthDate.split("/");
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int año = Integer.parseInt(parts[2]);
        
        // Convertir las partes de la fecha actual a int
        String partsA[] = actualDate.split("/");
        int diaA = Integer.parseInt(partsA[0]);
        int mesA = Integer.parseInt(partsA[1]);
        int añoA = Integer.parseInt(partsA[2]);
        
        int age = -1;
        
        // Validar si la fecha tiene el formato de fecha
        if (checkFormatDate(birthDate)) {
            if (año <= añoA) {
                if (mes > mesA || (mes == mesA && dia > diaA)) {
                    age = añoA - año - 1;
                } else {
                    age = añoA - año;
                }
            }
        }
        
        // Retornar la variable "age"
        return age;
    }
    
    /**
     * Devuelve true or false si el codigo postal es valido o no
     * @param zip una cadena
     * @return true or false
     */
    public static boolean checkPostalCode(String zip) {
        // Validar si la cadena es nula o esta vacia
        if (zip == null || zip.length() != 5) {
            return false;
        }
        
        // Con un for se recorre cada caracter se valida y convierte en int
        for (int i = 0; i < zip.length(); i++) {
            int num = Integer.parseInt(String.valueOf(zip.charAt(i)));
            
            // Se valida que el primer digito no sea mayor a 5 y el segundo digito menor a 0
            if (i == 0 && num > 5) {
                return false;
            } else return !(i == 1 && num < 1);
        }
        
        return true;
    }
    
    /**
     * Devuelve true or false si la cadena se puede convertir a numero
     * @param str una cadena
     * @return true or false
     */
    public static boolean isNumeric(String str) {
        // Validar si la cadena es nula o esta vacia
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Con un for se recorre cada caracter y se valida que sea digito
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Devuelve true or false si las cadenas son letras
     * @param str una cadena
     * @return true or false
     */
    public static boolean isAlphabetic(String str) {
        // Validar si la cadena es nula o vacia
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Con un for se recorre cada caracter y se valida que sea letra
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Devuelve true or false si el email tiene un formato valido o no
     * @param email una cadena
     * @return true or false
     */
    public static boolean checkEmail(String email) {
        // Valida si la cadena es nula o vacia
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        // Se crean variables para calcular el numero de @'s y los caracteres permitidos
        int numAt = 0;
        boolean validC = true;

        // Con un for se recorre cada caracter
        for (int i = 0; i < email.length(); i++) {
            // Se crea una variable para obtener el @
            char c = email.charAt(i);
            if (c == '@') {
                numAt++;
                // Validar que la @ no sea el primer caracter
                if (i == 0) {
                    return false;
                }
                // Validar los caracteres permitidos
            } else if (!Character.isLetterOrDigit(c) && c != '_' && c != '.' && c != '@') {
                validC = false;
            }
        }
        
        // Validar si hay mas de una @ y que sea los caracteres permitidos
        if (numAt != 1 || !validC) {
            return false;
        }
        
        // Validar que termine con .com o .es
        if (!(email.endsWith(".com") || email.endsWith(".es"))) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Devuelve true or false si las cadenas son letras y tiene una longitud logica
     * @param name una cadena
     * @return true or false
     */
    public static boolean checkName(String name) {
        // Validar si la cadena tiene un maximo de 25 caracteres
        if (name.length() <= 25) {
            
            // Validar si cada caracter de la cadena es una letra con la funcion isAlphabetic
            return isAlphabetic(name);
        }
        
        return false;
    }
}