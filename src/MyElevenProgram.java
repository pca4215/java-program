public class MyElevenProgram {
    //ake vynimky pozname

    public static int divide(int a, int b) { // throws Exception {
        //if (b == 0) {
        //    throw new Exception("Ups, divide by zero");
        //} else {
            return a / b;
    }

    public static void main(String[] args) {


        int[] numbers = new int[3];
        // unchecked exceptions (runtime exception)
        //numbers[100] = 5;

        // Aritmetic exception (runtime exception)
        //int a = 5 / 0;

        // checked exception
//        try {
//            int a = divide(5, 0);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        int a = divide(5, 0);

    }
}
