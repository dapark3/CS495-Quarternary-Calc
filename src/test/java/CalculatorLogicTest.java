package main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorLogicTest {
    private CalculatorLogic calculator;

    @BeforeEach
    public void setUp(){
        calculator = new CalculatorLogic();
    }

    @Test
    public void testconvertBaseFourToBaseTen(){
        assertEquals(0, calculator.convertBaseFourToBaseTen("0"));
        assertEquals(1, calculator.convertBaseFourToBaseTen("1"));
        assertEquals(4, calculator.convertBaseFourToBaseTen("10"));
        assertEquals(15, calculator.convertBaseFourToBaseTen("33"));
        assertEquals(60, calculator.convertBaseFourToBaseTen("120"));
    }

    @Test
    public void testconvertBaseTenToBaseFour(){
        assertEquals("0", calculator.convertBaseTenToBaseFour("0"));
        assertEquals("1", calculator.convertBaseTenToBaseFour("1"));
        assertEquals("2", calculator.convertBaseTenToBaseFour("2"));
        assertEquals("10", calculator.convertBaseTenToBaseFour("4"));
        assertEquals("33", calculator.convertBaseTenToBaseFour("15"));
        assertEquals("120", calculator.convertBaseTenToBaseFour("60"));
    }

    @Test
    public void testsumOfNumbers(){
        assertEquals("10", calculator.sumOfNumbers("2", "2"));
        assertEquals("23", calculator.sumOfNumbers("13", "10"));
        assertEquals("0", calculator.sumOfNumbers("0", "0"));
    }

    @Test
    public void testtimesOfNumbers(){
        assertEquals("20", calculator.timesOfNumbers("2", "2"));
        assertEquals("30", calculator.timesOfNumbers("3", "10"));
        assertEquals("0", calculator.timesOfNumbers("0", "10"));
    }

    @Test
    public void testdivisionOfNumbers(){
        assertEquals("1", calculator.divisionOfNumbers("2", "2"));
        assertEquals("2", calculator.divisionOfNumbers("4","2"));
        assertEquals("0", calculator.divisionOfNumbers("0", "10"));
    }

    @Test
    public void testminusOfNumbers(){
        assertEquals("0", calculator.minusOfNumbers("2", "2"));
        assertEquals("33", calculator.minusOfNumbers("33", "0"));
        assertEquals("1", calculator.minusOfNumbers("3", "2"));
    }

    @Test
    public void defaultTest() {

    }

}
