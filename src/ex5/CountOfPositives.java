package ex5;

public class CountOfPositives {
        public static int[] countPositivesSumNegatives(int[] input) {
            if (input == null || input.length == 0) {
                return new int[0];
            }

            int countPositives = 0;
            int sumNegatives = 0;

            for (int num : input) {
                if (num > 0) {
                    countPositives++;
                } else if (num < 0) {
                    sumNegatives += num;
                }
            }

            return new int[]{countPositives, sumNegatives};
        }
    }

