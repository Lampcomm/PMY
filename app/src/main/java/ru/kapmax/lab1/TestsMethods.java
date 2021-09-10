package ru.kapmax.lab1;

/**
 * Класс для вычисления min и max.
 * @autor Максим Капустин
 * @version 1.0
 */
class TestsMethods {
    /**
     * Метод для нахождения максимума между двумя целыми числами
     * @param int a, int b
     * @return Максимум между a и b
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }


    /**
     * Метод для нахождения минимума между двумя целыми числами
     * @param int a, int b
     * @return Минимум между a и b
     */
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}