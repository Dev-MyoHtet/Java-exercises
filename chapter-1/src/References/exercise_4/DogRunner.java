package References.exercise_4;

public class DogRunner {
    public static void main(String[] args) {

        Dog one = new Dog();
        one.name = "Haler";
        one.size = 70;

        Dog two = new Dog();
        two.name = "Puppy";
        two.size = 8;

        Dog three = new Dog();
        three.name = "Roger";
        three.size = 35;

        System.out.print(one.name + " bark ");
        one.bark();
        System.out.print(two.name + " bark ");
        two.bark();
        System.out.print(three.name + " bark ");
        three.bark();
    }
}
