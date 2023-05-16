package References.exercise_2;

public class FoodDriver {
    public static void main(String[] args) {
        // to access 3 foods
        Foods[] myFoods = new Foods[3];
        myFoods[0] = new Foods();
        myFoods[1] = new Foods();
        myFoods[2] = new Foods();

        myFoods[0].name = "Pizza";
        myFoods[0].category = "lunch";
        myFoods[1].name = "Bubbles Tea";
        myFoods[1].category = "Breakfast";
        myFoods[2].name = "Fried Rice";
        myFoods[2].category = "Dinner";

        int x = 0;
        while (x < 3) {
            System.out.print(myFoods[x].name);
            System.out.print(" is ");
            System.out.println(myFoods[x].category);
            ++x;
        }
    }
}
