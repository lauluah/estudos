package exLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamLambda {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Amanda", "Carlos", "Alice");

        List<String> nomesComA = nomes.stream()
                .filter(n -> n.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(nomes);

        //ex 2
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int numerosPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println(numerosPares);

        List<String> palavras = Arrays.asList("banana", "uva", "abacaxi", "kiwi", "laranja");

        List<String> ordemCrescente = palavras.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(ordemCrescente);

        //ex3
        List<String> palavras2 = Arrays.asList("sol", "montanha", "rio", "computador", "céu");
        long palavrasMais5Letras = palavras.stream().filter(p -> p.length() >= 5).count();
        System.out.println(palavrasMais5Letras);

    }
}
