package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        String[][] srt = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "i"},
                {"1", "1", "1", "1"}
        };
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            arrayValueCalculator.doCalc(srt);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}