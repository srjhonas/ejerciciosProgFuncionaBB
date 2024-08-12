package Punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MisLibros {
    public static void main(String[] args) {
        Supplier<List<Libro>> generar = () -> {
            List<Libro> libros = new ArrayList<>();
            crearLibro(libros,"La Odisea", "Homero", 10);
            crearLibro(libros,"Cien años de soledad", "Gabriel García Márquez", 9);
            crearLibro(libros,"Don Quijote de la Mancha", "Miguel de Cervantes", 10);
            crearLibro(libros,"Moby Dick", "Herman Melville", 8);
            crearLibro(libros,"Orgullo y Prejuicio", "Jane Austen", 9);
            crearLibro(libros,"1984", "George Orwell", 10);
            crearLibro(libros,"Ulises", "James Joyce", 7);
            crearLibro(libros,"El Gran Gatsby", "F. Scott Fitzgerald", 6);
            crearLibro(libros,"Crimen y Castigo", "Fiódor Dostoyevski", 10);
            crearLibro(libros,"En busca del tiempo perdido", "Marcel Proust", 6);
            crearLibro(libros,"El Señor de los Anillos", "J.R.R. Tolkien", 10);
            crearLibro(libros,"El retrato de Dorian Gray", "Oscar Wilde", 9);
            crearLibro(libros,"Guerra y Paz", "León Tolstói", 8);
            crearLibro(libros,"Matar a un ruiseñor", "Harper Lee", 9);
            crearLibro(libros,"Las aventuras de Huckleberry Finn", "Mark Twain", 6);
            crearLibro(libros,"Fahrenheit 451", "Ray Bradbury", 8);
            crearLibro(libros,"El guardián entre el centeno", "J.D. Salinger", 6);
            crearLibro(libros,"La metamorfosis", "Franz Kafka", 9);
            crearLibro(libros,"El lobo estepario", "Hermann Hesse", 8);
            crearLibro(libros,"Cumbres Borrascosas", "Emily Brontë", 6);
            return libros;
        };

        Predicate<Integer> esRecomendado = x -> x >= 7;

        UnaryOperator<String> show = libro -> "El libro " + libro + " es Recomendado";

        Consumer<List<Libro>> consumerMisLibros = libros -> {
            libros.forEach(libro -> {
                if(esRecomendado.test(libro.getPuntaje())){
                    System.out.println(show.apply(libro.getNombre()));
                }
            });
        };

        consumerMisLibros.accept(generar.get());
    }
    public static void crearLibro(List<Libro> libros, String libro, String autor, Integer puntaje){
        Libro libroNuevo = new Libro(libro, autor, puntaje);
        libros.add(libroNuevo);
    };
}
