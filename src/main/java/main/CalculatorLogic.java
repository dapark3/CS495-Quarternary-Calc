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

    public int sumOfNumbers(String num1, String num2, boolean isDecimalMode){
        if (isDecimalMode){
            Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
            return result;
        } else{
            String result = Integer.toString(convertBaseFourToBaseTen(num1)+convertBaseFourToBaseTen(num2));
            return convertBaseTenToBaseFour(result);
        }
    }

    public int timesOfNumbers(String num1, String num2, boolean isDecimalMode){
        if(isDecimalMode){
            Integer result = Integer.parseInt(num1) * Integer.parseInt(num2);
            return result;
        } else{
            String result = Integer.toString(convertBaseFourToBaseTen(num1) *  convertBaseFourToBaseTen(num2));
            return convertBaseTenToBaseFour(result);
        }
    }

    public int divisionOfNumbers(String num1, String num2, boolean isDecimalMode){
        if(isDecimalMode){
            Integer result = Integer.parseInt(num1) / Integer.parseInt(num2);
            return result;
        } else {
            String result = Integer.toString(convertBaseFourToBaseTen(num1) /  convertBaseFourToBaseTen(num2));
            return convertBaseTenToBaseFour(result);
        }
    }
    public int minusOfNumbers(String num1, String num2, boolean isDecimalMode){
        if (isDecimalMode){
            Integer result = Integer.parseInt(num1) - Integer.parseInt(num2);
            return result;
        } else{
            String result = Integer.toString(convertBaseFourToBaseTen(num1) - convertBaseFourToBaseTen(num2));
            return convertBaseTenToBaseFour(result);
        }
    }
    public int rootOfNumber(String num, boolean isDecimalMode){
       if (isDecimalMode){
            Double result = Math.sqrt(Double.parseDouble(num));
            return result.intValue();
        } else{
            Double rootNum = Math.sqrt(convertBaseFourToBaseTen(num));
            String result = Integer.toString(rootNum.intValue());
            return convertBaseTenToBaseFour(result);
        }
    }
    //TODO Implement squared operation
    public int squareOfNumber(String num, boolean isDecimalMode){
        if(isDecimalMode){
            Integer result = Integer.parseInt(num) * Integer.parseInt(num);
            return result;
        } else {
            String result = Integer.toString(convertBaseFourToBaseTen(num) *  convertBaseFourToBaseTen(num));
            return convertBaseTenToBaseFour(result);
        }
    }
}
