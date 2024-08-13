package Punto8;

import java.util.Scanner;

public class Calculadora {
    private double total;

    public Calculadora(double total){
        this.total = total;
        System.out.println("Valor Inicial " + total);
    }

    private Calculadora sumanding(double value){

        System.out.println("Acumulado de " + total + " mas " + value);
        total += value;
        System.out.println("es de " + total );
        return this;
    }

    private Calculadora restanding(double value){
        System.out.println("Acumulado de " + total + " menos " + value);
        total -= value;
        System.out.println("es de " + total );
        return this;
    }

    private Calculadora multiplicanding(double value){
        System.out.println("Acumulado de " + total + " multiplicado por  " + value);
        total *= value;
        System.out.println("es de " + total );
        return this;
    }

    public double getResult(){
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero inicial");
        int primerNum = scanner.nextInt();
        System.out.println("ingrese cuanto le quiere sumar");
        int segundoNum = scanner.nextInt();
        System.out.println("ingrese cuanto le quiere restar");
        int tercerNum = scanner.nextInt();
        System.out.println("ingrese por cuanto lo quiere multiplicar");
        int cuartoNum = scanner.nextInt();

        Calculadora calculadora = new Calculadora(primerNum);
        calculadora.sumanding(segundoNum)
                .restanding(tercerNum)
                .multiplicanding(cuartoNum);
        System.out.println("El resultado es " + calculadora.getResult());
    }

}
