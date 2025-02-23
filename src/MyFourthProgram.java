public class MyFourthProgram {

    // Ternarny operator
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int biggerOrEqual;

        if(a >= b) {
            biggerOrEqual = a;
        } else {
            biggerOrEqual = b;
        }

        biggerOrEqual = a >= b ? a : b;

        System.out.println("Bigger or equal is " + biggerOrEqual);
    }
}
