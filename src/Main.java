import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Person> p = new HashSet<>();
        p.add(new Person("Jane", 61));
        p.add(new Person("Michael", 36));
        p.add(new Person("Basil", 36));
        p.add(new Person("Aly", 45));
        p.add(new Person("Nick", 61));
        p.add(new Person("Jane", 61)); //incercam sa adaugam duplicat

        for (Person person : p)

        System.out.println("HashSset contains: " + p);
        System.out.println("Persons older then 60: ");

    }
}