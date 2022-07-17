package laba10;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Number number = new Number(NumerationSystemType._10, "6");
        Number result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._3);
        System.out.println(result);    //expected 110

        number = new Number(NumerationSystemType._10, "558");
        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._3);
        System.out.println(result);    //expected 3337

        number = new Number(NumerationSystemType._10, "9658112");
        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._3);
        System.out.println(result);    //expected abcdefabcdef
    }
    public static Number convertNumberToOtherNumerationSystem(Number number, NumerationSystem expectedNumerationSystem) {
        Number result = null;
        int system = number.getNumerationSystem().getNumerationSystemIntValue();

        try {
            String strNum = "" + new BigInteger(number.getDigit(), system);
            BigInteger a= new BigInteger(strNum);
            String s = a.toString(expectedNumerationSystem.getNumerationSystemIntValue());
            result = new Number(expectedNumerationSystem, s);

        } catch (Exception e){
            throw new NumberFormatException();
        }
        return result;
    }

}
class Number {
    private NumerationSystem numerationSystem;
    private String digit;

    public Number(NumerationSystem numerationSystem, String digit) {
        this.numerationSystem = numerationSystem;
        this.digit = digit;
    }

    public NumerationSystem getNumerationSystem() {
        return numerationSystem;
    }

    public String getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Number{" +
                "numerationSystem=" + numerationSystem +
                ", digit='" + digit + '\'' +
                '}';
    }
}

enum NumerationSystemType implements NumerationSystem {
    _16,
    _12,
    _10,
    _9,
    _8,
    _7,
    _6,
    _5,
    _4,
    _3,
    _2;

    @Override
    public int getNumerationSystemIntValue() {
        return Integer.parseInt(this.name().substring(1));
    }
}

interface NumerationSystem {
    int getNumerationSystemIntValue();
}
