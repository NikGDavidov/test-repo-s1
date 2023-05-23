package ru.geekbrains.lesson1.sample;


import ru.geekbrains.lesson1.other.Calc;
import ru.geekbrains.lesson1.other.Decorator;

/**
 https://www.docker.com/products/docker-desktop/
 https://hub.docker.com/

 javac -sourcepath ./java  -d out java/ru/geekbrains/lesson1/sample/Main.java
 *
 java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 javadoc -d docs -sourcepath ./java -cp ./out -subpackages ru
 * */

public class Main {
    public static void main(String[] args) {
        int a= 4;
        int b= 2;
        System.out.println(Decorator.decorate(Calc.add(a,b)));
        System.out.println(Decorator.decorate(Calc.deduct(a,b)));
        System.out.println(Decorator.decorate(Calc.mult(a,b)));
        System.out.println(Decorator.decorate(Calc.dev(a,b)));




    }
}
