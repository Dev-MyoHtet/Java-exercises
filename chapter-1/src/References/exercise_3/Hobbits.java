package References.exercise_3;

public class Hobbits {
    String name;
    public static void main(String[] args) {

        Hobbits[] hobbit = new Hobbits[3];

        int i = 0;
        while (true) {
            i = i + 1;
            hobbit[i] = new Hobbits();
            hobbit[i].name = "coding";
            if (i == 1) {
                hobbit[i].name = "cycling";
            }
            if (i == 2) {
                hobbit[i].name = "swimming";
            }
            System.out.print(hobbit[i].name + " is ");
            System.out.println(" great hobbit");
        }
    }
}
