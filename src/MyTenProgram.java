import java.util.Scanner;

public class MyTenProgram {

    // vynimnky
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        //System.out.println(number);
        int number = 0;
        while (true) {
            try {
                number = scanner.nextInt();
                if (number >= 1 && number <= 10) {
                    break;
                } else {
                    System.out.println("Must be between 1 and 10");
                }
            } catch (Exception e) {
                System.out.println("Invalid input:  " + e.toString());
                scanner.nextLine();
            }
        }
        System.out.println("Your number is " + number);
    }
}
