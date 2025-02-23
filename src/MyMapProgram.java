import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MyMapProgram {

    public static HashSet<String> uniqueValues(HashMap<Integer, String> map) {
        return new HashSet<>(map.values());
    }

    public static ArrayList<Integer> keepOnlyEven(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();  //ak chceme nieco removnut, tak pouzijem iterator
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }
        return list;
    }

    public static double calculateAverageStudentGrade(HashMap<String, Set<Integer>> studentGrades) {
        for (Map.Entry<String, Set<Integer>> entry: studentGrades.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
            HashSet<Integer> grades = (HashSet<Integer>) entry.getValue();
        }
        return 1;
    }

    public static HashSet<String> findBooksByAuthor(String author, HashMap<String, HashSet<String>> booksByAuthors) {
        HashSet<String> books = new HashSet<>();
        for (String book: booksByAuthors.keySet()) {
            if (booksByAuthors.get(book).contains(author)) {
                books.add(book);
            }
        }
        return books;
    }

    public static ArrayList<Integer> findUsersWithSharedPreference(
            HashMap<Integer, HashMap<String, String>> usersAndTheirPreferences,
            Map.Entry<String, String> preference
    ) {
        ArrayList<Integer> users = new ArrayList<>();
        for (Map.Entry<Integer, HashMap<String, String>> userPreferences: usersAndTheirPreferences.entrySet()) {
            for (Map.Entry<String, String> userPreference: userPreferences.getValue().entrySet()) {
                if (userPreference.getKey().equals(preference.getKey()) && userPreference.getValue().equals(preference.getValue())) {
                    users.add(userPreferences.getKey());
                }
            }
        }
        return users;
    }

    public static double calculateAverageStudentGrade2(HashMap<String, Set<Integer>> studentGrades) {
        double sum = 0;
        int count = 0;
        for (Set<Integer> gradesForStudent: studentGrades.values()) {
            for (int grade: gradesForStudent) {
                count ++;
                sum += grade;
            }
        }
        return sum / count;
    }

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Jablko","Ovocie, ktore je okruhle");
        dictionary.put("Cucoriedky","Ovocie, ktore rastie na krikoch");
        System.out.println(dictionary);

        System.out.println(dictionary.get("Jablko"));

        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        dictionary.getOrDefault("Jablcko","default");

        // iteracia
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("banana");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("....................");

        Iterator<String> iterator = fruits.iterator();  //ak chceme nieco removnut, tak pouzijem iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("mango")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);

        System.out.println();
        System.out.println("Mapy...2.uloha");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"b");

        System.out.println("Vstup");
        System.out.println(map);

        HashSet<String> result = uniqueValues(map);
        System.out.println(result);

        System.out.println();
        System.out.println("Iterator...1.uloha");

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i <= 10; i++) {
            numbers.add(i);
        }
        numbers = keepOnlyEven(numbers);
        System.out.println(numbers);

        System.out.println();
        System.out.println("Mix uloh...1.uloha");

        HashMap<String, Set<Integer>> studentGrades = new HashMap<>();
        HashSet<Integer> grades = new HashSet<>();
        grades.add(1);
        grades.add(2);
        grades.add(1);
        grades.add(4);
        studentGrades.put("Jozo",grades);
        grades.clear();
        grades.add(1);
        grades.add(3);
        grades.add(3);
        grades.add(4);
        studentGrades.put("Fero",grades);

        System.out.println(calculateAverageStudentGrade(studentGrades));


    }



    // kedy pouzit list a kedy pole
    // pole je jednoduchcsie na pamat
    // viem pocet prvkov v poli



}
