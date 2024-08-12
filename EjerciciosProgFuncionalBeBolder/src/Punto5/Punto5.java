package Punto5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryOperator<BigDecimal> division = (x, y) -> x.divide(y, 2, RoundingMode.HALF_UP);

        System.out.println("Ingrese el primer numero: ");
        BigDecimal numero1 = scanner.nextBigDecimal();
        System.out.println("Ingrese el numero por el cual va a dividir: ");
        BigDecimal numero2 = scanner.nextBigDecimal();

        if(numero2.equals(BigDecimal.ZERO)){
            System.out.println("No es posible dividir por 0");
        }else{
            System.out.println("El resultado es: " + division.apply(numero1, numero2));
        }


    }
}
