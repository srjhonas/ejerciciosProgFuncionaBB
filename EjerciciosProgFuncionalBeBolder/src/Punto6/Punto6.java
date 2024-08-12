package Punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Punto6 {
    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Boolean> validateAge = (edad, calculo) -> edad.equals(calculo);

        TriFunction<String, Integer, LocalDate, String> validaEdad = (nombre, edad, fechaNacimiento) -> {
            int years = Period.between(fechaNacimiento, LocalDate.now()).getYears();
            if(validateAge.apply(edad, years)){
                return "La fecha de nacimiento de " + nombre + " corresponde con la edad ingresada: " + edad;
            }
            return "La fecha de nacimiento de " + nombre + " NO corresponde con la edad ingresada: " + edad;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de esta forma AAAA-MM-DD (Ej: 1983-10-30)");
        LocalDate fechaIngresada = LocalDate.parse(scanner.next());
        System.out.println("Ingrese el nombre");
        String nombreIngresado = scanner.next();
        System.out.println("Ingrese la edad de la persona");
        Integer edadIngresada = scanner.nextInt();
        System.out.println(validaEdad.apply(nombreIngresado, edadIngresada, fechaIngresada));

    }

}
