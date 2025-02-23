public class MySevenProgram {
    public static void main(String[] args) {
        // ako su stringy ulozene v pamati
        String name = "Palo";
        String anotherName = "Palo";  // String pool ->
        String marek = "Marek";

    //    System.out.println(name == anotherName);
    //    System.out.println(name.equals(anotherName));

        String anotherPalo = new String("Palo"); // nova polozka v string poole

        System.out.println(name == anotherPalo);
        System.out.println(name.equals(anotherPalo));

        //stringbuilder
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            s.append(i);
        }
        String finalString = s.toString();
        System.out.println(finalString);

    }
}
