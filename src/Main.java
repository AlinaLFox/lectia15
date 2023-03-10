import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Adaugarea unor persoane într-un HashSet
        Set<Person> p = new HashSet<>();
        p.add(new Person("Jane", 61));
        p.add(new Person("Michael", 36));
        p.add(new Person("Basil", 37));
        p.add(new Person("Aly", 45));
        p.add(new Person("Nick", 62));
        p.add(new Person("Jane", 61)); //incercam sa adaugam duplicat

        //Parcurgerea HashSet-ului și afișarea persoanelor cu vîrsta mai mare de 60 de ani
        for (Person older : p) {
            if (older.getAge() > 60) {
                System.out.println("Persons older then 60: " + older.toString());
            }
        }
    }
}