import java.util.ArrayList;
import java.util.HashSet;

// Zoznam (list)

// List v Jave je ako zoznam veci, nieco ako pole
// Prvky vieme pridavat, vymazavat, pristupovat cez index atd
// Nemusime nastavit pociatocnu velkost
// Zoznam funguje iba s referencnymi typmi (Integer, String
// ArrayList<String> names new ArrayList<>();
// names.add("Jakub");
// names.add("Kamila");

// Mnozina (Set)

// Mnozina je ako Zozn, avsak nemoze obsahovat duplicity
// Prvky vieme pridavat, vymazavat, pristupovat cez index atd
// Nemusime nastavit pociatocnu velkost
// Mnozina funguje iba s referencnymi typmi (Integer, String
// HashSet<Integer> numbers = new HAshSet<>();
// numbers.add(1);
// numbers.add(2);
// numbers.add(1); -- duplicitne cislo nebude pridane do mnoziny

// Mapa (Map)

// Mapa je ako slovnik, kde mame pary kluc-hodnota. kazdy kluc odkazuje ma svoju hodnotu
// jednu dvojicu kluc-hodnota nazyvaema par (pripadne aj entry ci item).
// kluce su jedinecne
// HashMap<String, Integer> fiendsAge = new HashMap<>();
// friendsAge.put("Marek", 18)
// friendsAge.put("Linda", 25)

// Java Collections
// List, Set ci Mapa - tieto struktury nazyvame datove struktury
// Java ich obsahuje v tzv. JAva Collections Fremeworku
// Okrem tychto struktur su vo frameworku aj ine
//
//           Collection                           Map         Iterator
//  ------------------------------                 |              |
//  |             |              |              SortedMap    ListIterator
// List          Set           Queue
//                |              |
//             SortedSet       Dequee

public class MyListProgram {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<>();
        HashSet<String> names = new HashSet<>();
        names.add("Jakub");
        names.add("Petra");
        names.add("Petra");

        System.out.println(names);
        /*
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
         */
        System.out.println(".................");
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println(names.contains("Jakub"));
        System.out.println(names.contains("Jakubko"));
    }
}
