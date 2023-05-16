package References.exercise_4;

public class Dog {
    int size;
    String name;

    public void bark() {
        if (size > 60) {
            System.out.println("WOOF WOOF!!");
        } else if (size > 14) {
            System.out.println("RUFF RUFF!!");
        } else {
            System.out.println("YIP YIP");
        }
    }
}
