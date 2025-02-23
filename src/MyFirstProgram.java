import java.awt.*;
import java.util.Arrays;

public class MyFirstProgram {
    public static void main(String[] args) {
        //this prints hello world
        System.out.println("Hello world!");
        System.out.println("Hello Street of Code!");
        System.out.println("dfsdsfff");
        int myAge = 49;
        String myName = "Palo";
        System.out.println(myAge);
        System.out.println(myName);

        boolean myBoolean = true;
        byte myByte = -128;
        short myShort = 32_767;
        System.out.println(myShort);
        char myChar = 'C';
        int myInt = 4212315;
        long myLong = 545345554L;
        float myFloat = 3.55f;
        double myDouble = 5454545454.545454;

        /*
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        */

        int result = 3 * (2 * 3) / 2;
        System.out.println("result = " + result);

        //int x = 10;
        //x--;
        //System.out.println(x++);  //10
        //System.out.println(x);    //11
        //System.out.println(x--); //10
        //System.out.println(x); //9
        //System.out.println(++x); //11
        //System.out.println(--x); //9

        int p = 5;
        int q = 3;

        p += q;  //p = p + q;
        System.out.println(p);
        p += 3;
        System.out.println(p);

        // Ify A ELSY
        if (true) {
            System.out.println("Jup");
        }
        System.out.println("BA BLA");

        /* porovnavacie operatory
          <
          >
          <=
          >=
          ==
          !=
         */
        int a = 5;
        int b = 5;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        if(a > b) {
            System.out.println("a is bigger or equal then b");
        } else {
            System.out.println("b is bigger than a");
        }

        if(a > b) {
            System.out.println("a is bigger then b");
        } else if (a < b) {
            System.out.println("a is smaller then b");
        } else {
            System.out.println("a is equal to b");
        }

        /* logicke opratory
            && (and)
            || (or)
            ! (not)
         */

        int x = 2;

        // je x medzi 50 az 100 ?
        if (x >= 50 && x <= 100) {
            System.out.println("x is between 50 and 100");
        }
        // je x mensie ako 50 alebo vacsie ako 100
        if (x < 50 || x > 100) {
            System.out.println("x is smaller then 50 or bigger then 100");
        }

        if (!(x >= 10)) {
            System.out.println("x is bigger or equal then 10");
        }

        // je x parne a zaroven vacsie ako 5 ?

        if (x % 2 == 0 && x > 5) {
            System.out.println("X is even and bigger then 5");
        }
        // stringy
        String soc = "Street of Code";
        System.out.println(soc.toUpperCase());
        System.out.println(soc.toLowerCase());
        System.out.println(soc.replaceAll("e","o"));

        String part1 = "Street";
        String part2 = "of";
        String part3 = "Code";
        String res = part1 + " " + part2 + " " + part3;
        System.out.println(res.contains("Street"));

        // referencne datove typy
        int age = 30; //primitivny datovy typy
        Point point = new Point(5,5);  // referencny
        System.out.println("Point = " + point);

        point.move(10,10);
        System.out.println("Point = " + point);

        // polia
        String[] fruits = new String[3];
        fruits[0] = "apple";
        //String[] fruits = {"apple", "orange", "lemon" };
        int[] numbers = new int[3];
        //Arrays.fill(numbers, 10);
        numbers[0] = 5;
        //numbers[1] = 2;
        //numbers[2] = 3;

        System.out.println(Arrays.toString(fruits));
        //System.out.println(Arrays.toString(numbers));
        System.out.println(fruits[0] + fruits[1]);

        double[] myDoubles = new double[3];
        System.out.println(Arrays.toString(myDoubles));
    }
}