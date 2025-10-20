package ex5;

public class ExercicioUpDown {
    public static String arrange(String strng) {
        String[] words = strng.split(" ");
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (i % 2 == 0) {
                    if (words[i].length() <= words[i + 1].length()) {

                    } else {
                        String temp = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = temp;
                        trocou = true;
                    }
                } else {
                    if (words[i].length() >= words[i + 1].length()) {

                    } else {
                        String temp = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = temp;
                        trocou = true;
                    }
                }
            }
        } while (trocou);

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].toUpperCase();
            }
        }
        return String.join(" ", words);
    }
}
