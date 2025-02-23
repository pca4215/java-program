import java.util.Scanner;

public class MyFifthProgram {

    public static void main(String[] args) {
        // scanovanie inputu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name ?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you ?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You cab buy beer in Slovakia");
        } else {
            System.out.println("Kofola ftw");
        }

        // Casting
        int a = 5;
        int b = 2;
        //int c = a / b;
        double c = (double) a / b;
        System.out.println(c);

        String s = "5";
        int i = Integer.parseInt(s); // primitivny typ
        System.out.println(i);

        Integer j = 5;  // objekt
    }
}
