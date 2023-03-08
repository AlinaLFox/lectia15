public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override // rescriem metoda de baza toString
    public String toString() {
        return "Name: " + name + ", Age: " + age; // unim parametrii pe care dorim ca sa fiu afisate prin metoda asta
    }
    @Override // rescriem metoda de baza equals
    public boolean equals (Object obj) {
        if (this == obj) { // compara adresele obiectelor
            return true;
        }
        Person x = (Person) obj; // adaugam conditiile noastre de comparare
        if (this.name.equals(x.name) && this.age == x.age) { // compara nume si vairsta daca sunt egale
            return true;
        }
        return false; // daca nici o conditie n-a fost respectata, metoda o sa returneze"false"

        /* metoda equals se mai poate fi scrisa prin "instanceof"
         @Override public boolean equals(Object obj) {
         if ( !(obj instanceof Person)) return false;
         Person otherPerson = (person) obj;
         return (this.name.equals(x.name) && this.age == x.age)
         */
    }
    public int hashCode() { //parametru dupa care o sa efectueaza sortarea obiectelor
        return age;
    }
}
