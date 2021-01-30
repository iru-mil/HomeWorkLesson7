package ru.geekbrains.HomeWorkLesson7.Exceptions;

public class MainApp {
    public static void main(String[] args) throws RuntimeException {
        String[][] a = {
                {"1", "2", "3", "4"},
                {"2", "4", "5", "6"},
                {"3", "5", "6", "2"},
                {"4", "8", "2", "7"}};
        String[][] b = {
                {"1", "a", "3", "4"},
                {"2", "4", "5", "6"},
                {"3", "5", "b", "2"},
                {"4", "8", "2", "7"}};
        String[][] c = {
                {"1", "1", "3", "4", "5"},
                {"2", "4", "5", "6", "8"},
                {"3", "5", "b", "2", "1"},
                {"4", "8", "2", "7", "0"}};

        try {
            calcArray(a);
            calcArray(b);//calcArray(c);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calcArray(String[][] a) {
        if (a[0].length != 4 || a[1].length != 4 || a[2].length != 4 || a[3].length != 4 || a.length != 4)
            throw new MyArraySizeException();

        int sum = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива [" + i + "][" + j + "] не число");
                }
            }
        System.out.println("Сумма элементов массива: " + sum);
    }

}
