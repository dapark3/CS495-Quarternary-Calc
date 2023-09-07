package main;

import java.lang.Math;

public class CalculatorLogic {
    public int convertBaseFourToBaseTen(String base4){
       String radixConversion = Integer.toString(Integer.parseInt(base4, 4), 10);
       return Integer.parseInt(radixConversion);
    }

    public int convertBaseTenToBaseFour(String base10){
        String radixConversion = Integer.toString(Integer.parseInt(base10, 10), 4);
        return Integer.parseInt(radixConversion);
    }

    public int sumOfNumbers(String num1, String num2){
        String result = Integer.toString(convertBaseFourToBaseTen(num1) +  convertBaseFourToBaseTen(num2));
        return convertBaseTenToBaseFour(result);
    }

    public int timesOfNumbers(String num1, String num2){
        String result = Integer.toString(convertBaseFourToBaseTen(num1) *  convertBaseFourToBaseTen(num2));
        return convertBaseTenToBaseFour(result);
    }

    public int divisionOfNumbers(String num1, String num2){
        String result = Integer.toString(convertBaseFourToBaseTen(num1) /  convertBaseFourToBaseTen(num2));
        return convertBaseTenToBaseFour(result);
    }
    public int minusOfNumbers(String num1, String num2){
        String result = Integer.toString(convertBaseFourToBaseTen(num1) -  convertBaseFourToBaseTen(num2));
        return convertBaseTenToBaseFour(result);
    }
    public int rootOfNumber(String num){
        String result = Double.toString(Math.sqrt(convertBaseFourToBaseTen(num)));
        return convertBaseTenToBaseFour(result);
    }
}
