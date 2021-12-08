package ru.geekbrains.hw1;

public class Main {
    public static void main(String[] args) {

        //2. Создание переменных пройденных типов
        byte byteVariable = 126;
        int intVariable = 0;
        long longVariable = 200000L;
        float floatVariable = 123.5f;
        double doubleVariable = 22.2;
        char charVariable = 'y';
        boolean booleanVariable = true;

        //3. Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, все переменные float
        System.out.println("------=========== 3 ===========------");
        float a = 2.32f;
        float b = 5.56f;
        float c = 7.93f;
        float d = 1.77f;
        float calc = calculate(a, b, c, d);
        System.out.printf("a * (b + (c / d)) = %.2f \n\n", calc);

        //4. Проверка суммы двух чисел
        System.out.println("------=========== 4 ===========------");
        int first = 5;
        int second = 11;
        if (checkSum(first, second)) {
            System.out.printf("Сумма чисел %d и %d, входит в диапазон от 10 до 20 (включительно)\n\n", first, second);
        } else {
            System.out.printf("Сумма чисел %d и %d равна %d, и не входит в диапазон от 10 до 20 (включительно)\n\n", first, second, (first + second));
        }

        //5. Проверка на числа и печать в консоль
        System.out.println("------=========== 5 ===========------");
        int num = -5;
        chekNum(num);
        num = 0;
        chekNum(num);
        System.out.println();

        //6. Проверка на числа и возврат boolean
        System.out.println("------=========== 6 ===========------");
        int numBool = -5;
        if (chekNumBool(numBool)) {
            System.out.printf("Число %d положительное\n\n", numBool);
        } else {
            System.out.printf("Число %d отрицательное\n\n", numBool);
        }

        //7. Приветствие
        System.out.println("------=========== 7 ===========------");
        String name = "Станислав";
        sayHello(name);

        //8. Проверка года на високосность...
        System.out.println("------=========== 8 ===========------");
        checkYaer(1900);
        checkYaer(2000);
        checkYaer(2004);
        checkYaer(2021);
    }

    public static float calculate(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean checkSum(int fisrt, int second) {
        boolean checkSumm = false;
        int summa = fisrt + second;
        if (summa >= 10 && summa <= 20) {
            checkSumm = true;
        }
        return checkSumm;
    }

    public static void chekNum(int num) {
        if (num < 0) {
            System.out.printf("Число %d отрицательное.\n", num);
        } else {
            System.out.printf("Число %d положительное.\n", num);
        }
    }

    public static boolean chekNumBool(int num) {
        boolean result = false;
        if (num >= 0) {
            result = true;
        }
        return result;
    }

    public static void sayHello(String name) {
        System.out.printf("Привет %s\n\n", name);
    }

    public static void checkYaer(int year) {
        if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0))) {
            System.out.printf("Год %d високосный.\n", year);
        } else {
            System.out.printf("Год %d НЕ високосный\n", year);
        }
    }
}
