/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author usuari
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }   

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);     
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Ignore("El posarem com exepcio el dividit per 0")
    @Test    
    public void testDivide() {
        System.out.println("divide");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);        
    }
    /**
     * Test dividit per un numero no 0
     */    
     public void testDividePerNoZero() {
        System.out.println("divide");
        double number1 = 0.0;
        double number2 = 5.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);        
    }
}
