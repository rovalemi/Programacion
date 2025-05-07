package testing;

import com.mycompany.mavenjunittest.UserDataValidations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testCheckId_01() {
        System.out.println("1. testCheckId_01 - nif correcto");
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(1, "12345678Z");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckId_02() {
        System.out.println("1. testCheckId_02 - tipo de documento incorrecto");
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(2, "12345678Z");
        assertEquals(expResult, result, "El tipo de documento es incorrecto.");
    }
    
    @Test
    public void testCheckId_03() {
        System.out.println("1. testCheckId_03 - letra incorrecta");
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(1, "12345678J");
        assertEquals(expResult, result, "La letra es incorrecta.");
    }
    
    @Test
    public void testCheckId_04() {
        System.out.println("1. testCheckId_04 - nif nulo");
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(1, null);
        assertEquals(expResult, result, "El nif es nulo.");
    }
    
    @Test
    public void testCheckId_05() {
        System.out.println("1. testCheckId_05 - nif longitud incorrecta");
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(1, "123456A");
        assertEquals(expResult, result, "La longitud del nif es incorrecto.");
    }
    
    @Test
    public void testCheckFormatDate() {
        System.out.println("2. testCheckFormatDate");
        String date = "11/02/2025";
        boolean expResult = true;
        boolean result = UserDataValidations.checkFormatDate(date);
        assertEquals(expResult, result, "El formato de fecha es incorrecto.");
    }
    
    @Test
    public void testCalculateAge() {
        System.out.println("3. testCalculateAge");
        String birthDate = "09/12/2000";
        String actualDate = "11/02/2025";
        int expResult = 24;
        int result = UserDataValidations.calculateAge(birthDate, actualDate);
        assertEquals(expResult, result, "La edad es incorrecta.");
    }
    
    @Test
    public void testCheckPostalCode() {
        System.out.println("4. testCheckPostalCode");
        String zip = "08970";
        boolean expResult = true;
        boolean result = UserDataValidations.checkPostalCode(zip);
        assertEquals(expResult, result, "El email es incorrecto.");
    }
    
    @Test
    public void testIsNumeric() {
        System.out.println("5. testIsNumeric");
        String str = "12345";
        boolean expResult = true;
        boolean result = UserDataValidations.isNumeric(str);
        assertEquals(expResult, result, "La cadena no es numérico.");
    }
    
    @Test
    public void testIsAlphabetic() {
        System.out.println("6. testIsAlphabetic");
        String str = "Demo";
        boolean expResult = true;
        boolean result = UserDataValidations.isAlphabetic(str);
        assertEquals(expResult, result, "La cadena no es alfabético.");
    }
    
    @Test
    public void testCheckEmail() {
        System.out.println("7. testCheckEmail");
        String email = "alizon@gmail.com";
        boolean expResult = true;
        boolean result = UserDataValidations.checkEmail(email);
        assertEquals(expResult, result, "El email es incorrecto.");
    }
    
    @Test
    public void testCheckName() {
        System.out.println("8. testCheckName");
        String name = "Alizon";
        boolean expResult = true;
        boolean result = UserDataValidations.checkName(name);
        assertEquals(expResult, result, "El nombre es incorrecto.");
    }
}
