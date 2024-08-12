package Punto8;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculadora {



    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (x, y) -> {
            System.out.println("Sumando " + x + " por " + y);
            return x + y;
        };
        BiFunction<Integer, Integer, Integer> resta = (x, y) -> {
            System.out.println("restando " + x + " por " + y);
            return x - y;
        };
        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> {
            System.out.println("Multiplicando " + x + " por " + y);
            return x * y;
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int primerNum = scanner.nextInt();
        System.out.println("ingrese por cuanto lo quiere multiplicar");
        int segundoNum = scanner.nextInt();
        System.out.println(multiplicacion.apply(primerNum, segundoNum));
        System.out.println("ingrese cuanto le quiere sumar");
        int tercerNum = scanner.nextInt();
        System.out.println(suma.apply(multiplicacion.apply(primerNum, segundoNum), tercerNum));
        System.out.println("ingrese cuanto le quiere restar");
        int cuartoNum = scanner.nextInt();
        System.out.println(resta.apply((suma.apply(multiplicacion.apply(primerNum, segundoNum), tercerNum)),cuartoNum));


    }

}
