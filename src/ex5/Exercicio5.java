package ex5;

public class Exercicio5 {
        public static boolean validatePin(String pin) {
            return pin.matches("\\d{4}") || pin.matches("\\d{6}");
        }
}
