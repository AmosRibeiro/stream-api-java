import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumeroPar);
    }
}