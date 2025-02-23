import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordProblems {

    /**
     *  Pomoz vypocitat cenu zmzlinarovi
     *  Ak si objedna parny pocet kopcekov, tak jeden kopcek stoji 1,5 eur.
     *  ale ak si objedna neparny pocet kopcekov, tak jeden kopcek stoji 1,25 eur.
     *
     *  Sprav funkciu, ktora vypocita cenu na zaklade poctu kopcekov
     *  Priklady:
     *  1 kopcek = 1,25
     *  2 kopceky = 3
     *  3 kopceky = 3,75
     *  4 kopceky = 6
     *
     */

    public static double calcurlatePrice(int scoopsCount) {
        double even = 1.5;
        double odd = 1.25;

        /*
        if (scoopsCount % 2 == 0) {
            return scoopsCount * even;
        } else {
            return scoopsCount * odd;
        }
         */

        return scoopsCount % 2 == 0 ?  scoopsCount * even :  scoopsCount * 1.25;
    }

    /**
     * Napis funkciu, ktora bude mat 2 parametre: start a stop
     * Funkcia vypocita sucet a priemer cisel medzi start a stop (vratane)
     * Vypis tento sucet a priemer
     *
     * Priklady:
     * start = 1, stop = 3
     * sucet = 1 + 2 + 3 = 6
     * priemer = 6 / 3 = 2
     *
     * start = 3, stop = 3
     * sucet = 3
     * priemer = 3
     *
     * start = 3, stop = 2
     * sucet = 0
     * priemer = 0
     */

    public static double[] calculateSumAndAvg(int start, int stop) {
        double[] result = new double[2];
        int count=0;

        if (start > stop) {
            result[0] = 0;
            result[1] = 0;
            return result;
        }

        for (int i = start; i <= stop; i++) {
            count++;
            result[0] += i;
        }
        result[1] = result[0] / count;

        return result;
    }

    // rieseni uja
    public static void printSumAndAvg(int start, int stop) {
        if (stop < start) {
            System.out.println("Sucet " + 0);
            System.out.println("Priemer " + 0);
        } else if (stop == start) {
            System.out.println("Sucet " + stop);
            System.out.println("Priemer " + stop);
        } else {
            double sum = 0;
            for (int i = start; i <= stop; i++) {
                sum += i;
            }

            System.out.println("Sucet " + sum);
            double avg = sum / (stop - start + 1);
            System.out.println("Priemer " + avg);
        }
    }

    /**
     * Napis program, ktory sa ta bude pytat, aby si napisal nejake cislo dokola az kym nenapises cislo 7
     * Potom program skonci. Na ziskanie cisla od pouzivatela pouzi sCanner
     *
     * Priklad:
     * Zadaj cislo: 5
     * Zadaj cislo: 3
     * Zadaj cislo: 7
     *
     */

    public static void getSeven() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Zadaj cislo: ");
            number = scanner.nextInt();
            if (number == 7) {
                break;
            } else {
                scanner.nextLine();
            }
        }
    }

    // rieseie uja
    public static void get7() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        while (userNumber != 7) {
            System.out.println("Zadaj cislo: ");
            try {
                userNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Neplatne cislo, napis este raz: ");
                scanner.nextLine();
            }
        }
        System.out.println("Koniec programu");
    }

    /**
     * V cykle nacitavaj vstup od pouzivatel, ktory vypisuje iba cisla dokola
     * Tento vstup dokola nacitavaj, pokym pouzivatel nanapise q
     * Ak pouzivatel napise q, tak vypise sucet a priemer vsetkych nacitanych cisel
     *
     * Priklad:
     * Zadaj cislo: 5
     * Zadaj cislo: 3
     * Zadaj cislo: 7
     * Zadaj cislo: q
     * Sucet: 15
     * Priemer: 5
     * Koniec programu
     */
    public static double checkNumber(String vstup) {
        double result;
        try {
            result = Double.parseDouble(vstup);
            return result;
        } catch(Exception e) {
            return -1;
        }
    }


    public static void printSumAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numbersCount = 0;
        while (true) {
            System.out.println("Zadaj cislo alebo q ak chces skoncit: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                break;
            }
            try {
                double number = Double.parseDouble(userInput);
                sum += number;
                numbersCount += 1;
            } catch (NumberFormatException e) {
                System.out.println("Neplatne cislo alebo znak");
                //scanner.nextLine();
            }
        }
        System.out.println("Sucet je " + sum);
        double avg = 0;
        if (numbersCount > 0) {
            avg = sum / numbersCount;
        }
        System.out.println("Priemer je " + avg);
    }

    /**
     * Vypis vsetky prvocisla od 1 po 1000. Prvocislo je take cislo, ktore je delitelne len 1 alebo sebou samym
     * Poznamka: 1 nie je prvocislo
     */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void printPrimeNumbers(int count) {
        for (int i = 2; i <= count; i++) {
            if (!isPrime(i))
                continue;
            System.out.println("prime: " + i);
        }
    }

    // 2.verzia
    public static void printPrimeNumbers2() {
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    /**
     * Napis funkciu, ktora bude vypisat fibonacciho postupnost do cisla 1000
     * Fibonnaciho postupnost zacina cislami 1 a 2
     * kazde dlasie cislo sa vypocita ako sucet predchadzajucich dvoch cisel
     *
     * cize postupnost by mala vyzerat takto: 1 2 3 5 8 13 21 64 55 ...
     */
    public static void printFibonnaci(int n) {
        int a = 1;
        int b = 2;
        int limit = n;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (a + b <= limit) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
        }
    }


    public static void main(String[] args) {

        System.out.println("1.uloha");
        System.out.println(calcurlatePrice(1));
        System.out.println(calcurlatePrice(2));
        System.out.println(calcurlatePrice(3));
        System.out.println(calcurlatePrice(4));

        System.out.println("2.uloha");
        printSumAndAvg(1, 3 );
        System.out.println();
        printSumAndAvg(2, 4 );
        System.out.println();
        printSumAndAvg(3, 3 );
        System.out.println();
        printSumAndAvg(3, 2 );
        System.out.println();
        printSumAndAvg(1, 100 );
        System.out.println();

        System.out.println("3.uloha");
        //getSeven();
        //get7();

        //printSumAvg();

        //printPrimeNumbers(1000);
        //printPrimeNumbers2();

        printFibonnaci(1000);

    }

}

