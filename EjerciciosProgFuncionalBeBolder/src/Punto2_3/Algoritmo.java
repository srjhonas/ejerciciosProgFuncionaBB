package Punto2_3;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Algoritmo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<Integer, Integer> potencia = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        Predicate<Integer> esImpar = x -> x % 2 == 0;

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();

        System.out.println("Punto 2: la potencia del numero ingresado " + numero + " es " + potencia.apply(numero));
        System.out.println("El resultado es par: " + esImpar.test(potencia.apply(numero)));
    }


}