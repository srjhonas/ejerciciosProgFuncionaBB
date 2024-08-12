package Punto9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Punto9 {

    public static void main(String[] args) {
        List<String> names = getList("Estiben", "Jana", "Johana", "anabel", "Luciana", "Carlos", "Valentina", "Mariana", "jhon");

        List<String> filteredNames = namesWithAna(names, "ana" );

        Optional<List<String>> optionalList = Optional.of(filteredNames);

        if(!optionalList.get().isEmpty()){
            System.out.println("Nombres que contienen ana ");
            filteredNames.forEach(System.out::println);
        }else{
            System.out.println("no exsiten nombres con el parametro");
        }

    }
    public static List<String> namesWithAna (List<String> names, String filtro){
        return names.stream().filter(name -> name.contains(filtro)).collect(Collectors.toList());
    }
    public static <T> List<T> getList(T ... elements){
        return Arrays.asList(elements);
    }

}
