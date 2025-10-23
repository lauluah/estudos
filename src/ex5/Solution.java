package ex5;

public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        int[] valor1 = new int[arr1.length];

        double soma = 0;
        for (int i = 0; i < arr1.length; i++) {
            int valorSub = arr1[i] - arr2[i];
            double quadrado = Math.pow(valorSub, 2);
            soma += quadrado;
        }

        double media = soma / arr1.length;

        return media;
    }
}
