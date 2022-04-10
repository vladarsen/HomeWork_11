package com.vladarsenjtev;

public class ArrayValueCalculator {
    public int doCalc(String[][] str) {
        int sum = 0;
        if (str.length > 4 || str[0].length > 4) {
            throw new MyArraySizeException("Передан неверный размер массива. Массив должен быть 4х4");
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException ex) {
                    String massage = String.format("Передан неверный формат ячейки, которая находиться в строке №: %s и столбце №: %s", i + 1, j + 1);
                    throw new MyArrayDataException(massage, ex);
                }
            }
        }
        return sum;
    }
}
