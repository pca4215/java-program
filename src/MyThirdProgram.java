import java.util.Arrays;

public class MyThirdProgram {
    //metody
    /*
        - Acces Modifier
        - Optional static
        - Return type
        - Name
        - Optional Parameters
        - Method body
        - Optional return value
     */
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


    public static int add(int first, int second) {
        int result = first + second;
        return result;
    }


    public static void printLargerNumber(int first, int second) {
        if (first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

    public static void change(int[] nums) {
        System.out.println("v metode = " + nums);
        nums[0] = 5;
    }

    public static void main(String[] args) {  // void - metoda nic nevracia
        int a = 5;
        int b = 10;
        int result = add(a, b);

        System.out.println(result);
        printLargerNumber(a, b);

        //referencne datove typy v metodach
        int[] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        System.out.println("v maine = " + numbers);
        System.out.println(Arrays.toString(numbers));

        change(numbers);
        System.out.println(Arrays.toString(numbers));

        // if else poblem
        //String day = "monday";

        // switch
        Days day = Days.THURSDAY;

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("weekday");  //zapis java 12 a viac
            //case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("weekday");  //zapis java 12 a viac
                //System.out.println("weekday");
            case SATURDAY, SUNDAY -> System.out.println("weekend");
                //System.out.println("weekend");
            default -> System.out.println("unknown");
                //System.out.println("unknown");
        }

    }
}
