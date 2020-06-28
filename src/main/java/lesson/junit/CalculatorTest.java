package lesson.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void sumTest(){
        assertEquals(5, calculator.sum(2,3), 0);
    }

    @Test
    public void divideTest(){
        assertEquals(2.5, calculator.divide(5,2), 1);
    }

    @Test
    public void divideByZeroTest(){
        assertEquals(0, calculator.divide(5,0), 0);
    }
}
