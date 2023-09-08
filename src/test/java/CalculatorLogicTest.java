import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import main.CalculatorLogic;



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
        assertEquals(2, calculator.convertBaseFourToBaseTen("2"));
        assertEquals(4, calculator.convertBaseFourToBaseTen("10"));
        assertEquals(15, calculator.convertBaseFourToBaseTen("33"));
        assertEquals(60, calculator.convertBaseFourToBaseTen("330"));
    }

    @Test
    public void testconvertBaseTenToBaseFour(){
        assertEquals(0, calculator.convertBaseTenToBaseFour("0"));
        assertEquals(1, calculator.convertBaseTenToBaseFour("1"));
        assertEquals(2, calculator.convertBaseTenToBaseFour("2"));
        assertEquals(10, calculator.convertBaseTenToBaseFour("4"));
        assertEquals(33, calculator.convertBaseTenToBaseFour("15"));
        assertEquals(330, calculator.convertBaseTenToBaseFour("60"));
    }

    @Test
    public void testSumOfNumbersBase4(){
        assertEquals(10, calculator.sumOfNumbers("2", "2", false));
        assertEquals(23, calculator.sumOfNumbers("13", "10", false));
        assertEquals(0, calculator.sumOfNumbers("0", "0", false));
    }

    @Test
    public void testSumOfNumbersBase10(){
        assertEquals(4, calculator.sumOfNumbers("2", "2", true));
        assertEquals(23, calculator.sumOfNumbers("13", "10", true));
        assertEquals(0, calculator.sumOfNumbers("0", "0", true));
    }
    
    @Test
    public void testTimesOfNumbersBase4(){
        assertEquals(10, calculator.timesOfNumbers("2", "2", false));
        assertEquals(30, calculator.timesOfNumbers("3", "10", false));
        assertEquals(0, calculator.timesOfNumbers("0", "10", false));
    }

    public void testTimesOfNumbersBase10(){
        assertEquals(4, calculator.timesOfNumbers("2", "2", true));
        assertEquals(30, calculator.timesOfNumbers("3", "10", true));
        assertEquals(0, calculator.timesOfNumbers("0", "10", true));
    }

    @Test
    public void testDivisionOfNumbersBase4(){
        assertEquals(1, calculator.divisionOfNumbers("2", "2", false));
        assertEquals(2, calculator.divisionOfNumbers("10","2", false));
        assertEquals(10, calculator.divisionOfNumbers("110", "11", false));
    }

    @Test
    public void testDivisionOfNumbersBase10(){
        assertEquals(1, calculator.divisionOfNumbers("2", "2", true));
        assertEquals(5, calculator.divisionOfNumbers("10","2", true));
        assertEquals(10, calculator.divisionOfNumbers("110", "11", true));
    }

    @Test
    public void testMinusOfNumbersBase4(){
        assertEquals(23, calculator.minusOfNumbers("33", "10", false));
        assertEquals(10, calculator.minusOfNumbers("12", "2", false));
    }

    @Test
    public void testMinusOfNumbersBase10(){
        assertEquals(0, calculator.minusOfNumbers("2", "2", true));
        assertEquals(23, calculator.minusOfNumbers("33", "10", true));
        assertEquals(4, calculator.minusOfNumbers("6", "2", true));
    }

    @Test
    public void testRootOfNumberBase4(){
        assertEquals(10, calculator.rootOfNumber("100", false));
        assertEquals(2, calculator.rootOfNumber("10", false));
    }
    
    @Test
    public void testRootOfNumberBase10(){
        assertEquals(4, calculator.rootOfNumber("16", true));
        assertEquals(2, calculator.rootOfNumber("4", true));
    }

    @Test
    public void defaultTest() {

    }

}
