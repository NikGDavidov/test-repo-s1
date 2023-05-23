package ru.geekbrains.lesson1.other;

public class Decorator {
    /**
     * Класс Декораратор. Возвращает отформатированную строку
     */
    public static String decorate(int result){
        /**
         * метод декорирует результат математической функции
         */
        return String.format("Result is %d.", result);
    }
}
