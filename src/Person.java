public class Person {
    // declararea variabilelor private
   private String name;
   private int age;

    // constructorul pentru clasa Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metodele getter si seter pentru ele
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // metoda toString - afiseaza reprezentarea string a obiectului
    @Override // rescriem metoda de baza toString
    public String toString() {
        return "Name: " + name + ", Age: " + age; // unim parametrii pe care dorim ca sa fiu afisate prin metoda asta
    }

    // metoda equals - compara doua obiecte de tip Person
    @Override // rescriem metoda de baza equals
    public boolean equals (Object obj) {
        if (this == obj) { // compara adresele obiectelor; // verificam daca cele doua obiecte sunt identice
            return true;
        }

        Person x = (Person) obj; // castam obiectul la tipul Person
        if (this.name.equals(x.name) && this.age == x.age) { // verificam daca cele doua obiecte au aceleasi variabile pentru name si age
            return true;
        }
        return false; // daca nici o conditie n-a fost respectata, metoda o sa returneze"false"

        /* metoda equals se mai poate fi scrisa prin "instanceof"
         @Override public boolean equals(Object obj) {
         if (obj == this) return true;
         if ( !(obj instanceof Person)) return false;  // verificam daca obiectul comparat este de tip Person
         Person other = (person) obj;
         return (this.name.equals(x.name) && this.age == x.age)
         */
    }

    // metoda hashCode - calculeaza valoarea hash a obiectului
    public int hashCode() { //parametru dupa care o sa efectueaza sortarea obiectelor
        return age;
    }
}
