package References.exercise_1;

public class Person {
    String name;
    public static void main(String[] args) {
        // create new object to access references
        Person person1 = new Person();
        person1.name = "Mike";
        person1.walk();

        // Make 3 Person Array
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = person1;

        // references
        persons[0].name = "Katy";
        persons[1].name = "John";

        System.out.println("last dog's name is " + persons[2].name);

        int i = 0;
        while (i < persons.length) {
            persons[i].walk();
            ++i;
        }
    }

    public void walk() {
        System.out.println(name + " is walking!!");
    }
}

