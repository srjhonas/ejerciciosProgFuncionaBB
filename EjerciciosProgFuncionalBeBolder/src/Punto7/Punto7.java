package Punto7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Punto7 {
    public static void main(String[] args) {
        List<LocalDateTime> fechas = new ArrayList<>();
        fechas.add(LocalDateTime.of(2023, 8, 12, 10, 0));
        fechas.add(LocalDateTime.of(2022, 7, 15, 15, 30));
        fechas.add(LocalDateTime.of(2024, 6, 20, 8, 45));

        fechas.forEach(Punto7::textFecha);


    }
    static void textFecha(LocalDateTime fecha){
        System.out.println("La fecha es " + fecha.getDayOfMonth() + " del mes " + fecha.getMonth() + " del año " + fecha.getYear());
    }
}
