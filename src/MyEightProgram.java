import java.util.Arrays;

public class MyEightProgram {

    // for cyklus a pole
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even");
            } else {
                System.out.println(numbers[i] + " is odd");
            }
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Super new feature");
    }
}
