package ejercicio02;

import java.util.function.BiFunction;

public class Init {
    public static void mostrarOperacion(BiFunction<Integer, Integer, Integer> operar) {
        System.out.println(operar.apply(2, 3));
    }
    public static void main(String[] args) {
        mostrarOperacion((z, y) -> z - y);
    }
}
