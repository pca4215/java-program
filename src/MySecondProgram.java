import java.util.Arrays;

public class MySecondProgram {
    public static void main(String[] args) {
        //cykly
        // vypis cisla 1 do 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // vypis cisla od -5 do 5
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i = -5; i <= 5; i++) {
            System.out.println(i);
        }
        // vypis cisla od 5 do -5
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i = 5; i >= -5; i--) {
            System.out.println(i);
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        // lepsi cyklus for each
        for (int number : numbers) {
            System.out.println("Nova iteracia: " + number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = new String[]{"Jakub", "Peter", "Pavlina"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        // while cyklus
//        int i = 1;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        i = 10;
//        while (i > 10) {
//            System.out.println(i);
//            i--;
//        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Do while");

//        i = 10;
//        do {
//            System.out.println(i);
//            i--;
//        } while (i > 10);

//        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        System.out.println("Break");
//        for (int i = 0; i <= 10; i++ ) {
//            if (i > 5) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("here");
//
//        int i = 1;
//        while (true) {
//            if(i > 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//
//        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        System.out.println("Continue");
//        // vypis vsetky parne cisla
//        for (int j = 1; j <= 10; j++) {
//            if (j % 2 == 1) {
//                continue;
//            }
//            System.out.println(j);
//        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("vnoreny cyklus");

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        /**
         *  Vypis cisla od 1 po 10, ale po kazdom cisle vzdy do jedneho riadku za sebou
         *  napis to iste cislo toklo krat, aku hodnotu predstavuje
         *
         *  riesenie takto
         *  1
         *  1
         *  2
         *  22
         *  3
         *  333
         *  4
         *  4444
         *  5
         *  55555
         *  ...
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("ULOHA");

        String text = "oko";
        String revString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            revString = revString + text.charAt(i);
        }

        System.out.println("text: " + text );
        System.out.println("textBulid: " + revString );

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("result: " + checkAnagram("anagram","magnram"));


        System.out.println(("validParenthesis.result: " + validParenthesis("{{()}")));

        int[] numbs = {1,2,2,3,3,7,7,7};
        System.out.println(("countDuplicates.result: " + countDuplicates2(numbs)));
    }

    public static boolean checkAnagram(String a, String b) {
        char aa;
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            aa = a.charAt(i);
            if (b.indexOf(aa) < 0) {
                return false;
            }
            System.out.println("letter_a: " + aa);
            System.out.println();
        }
        return true;
    }

    public static boolean validParenthesis(String s) {
        boolean valid = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                valid = false;
                break;
            }
        }
        if (count != 0) {
            valid = false;
        }

        return valid;
    }

    public static int countDuplicates(int[] numbers) {
        int countDupl = 0;
        for (int i = 0; i < numbers.length; i++) {
            int isDupl = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isDupl = 1;
                }
            }
            if (isDupl == 1) {
                countDupl++;
            }
        }
        return countDupl;
    }

    public static int countDuplicates2(int[] numbers) {
        int count = 0;
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (duplicates.toString().contains(String.valueOf(numbers[i]))) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    duplicates.append(numbers[i]);
                    break;
                }
            }
        }
        return count;
    }

    public static boolean isIsogram(String s) {
        boolean isIsogram = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    isIsogram = false;
                    break;
                }
            }
        }
        return isIsogram;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotateMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                rotateMatrix[i][matrix.length - 1 - j] = matrix[j][i];
            }
        }
        return rotateMatrix;
    }


}
