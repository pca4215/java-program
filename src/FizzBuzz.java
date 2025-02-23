public class FizzBuzz {
    public static void main(String[] args) {
        /*
            FizzBuzz uloha
            Progrma vypise cisla od 1 do 100, avsak:
            1. Ak je cislo delitelne 3kou, tak namiesto cisla vypis "Fizz"
            2. Ak je cislo delitelne 5kou, tak namiesto cisla vypis "Buzz"
            3. Ak je cislo dlitelne 3kou a zaroven 5kou, tak napis "FizzBuzz"
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {  // zjednodusenie if (i % 15 == 0)
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }  else System.out.println(i);
        }
    }
}
