import java.util.Arrays;

public class FoodOrderApp {
    public static void main(String[] args) {

        String[] toppings = {"Mushroom", "Capsicum", "Cheese"};
        String[] ingredients = {"Lettuce", "Tomato", "Cucumber"};

        Pizza pz = new Pizza("Veggie Delight Pizza", 700, "Large", toppings);
        Burger bg = new Burger("Beef Burger", 400, true, "Beef");
        Salad sl = new Salad("Garden Salad", 300, ingredients);

        pz.displayMenuItem();
        bg.displayMenuItem();
        sl.displayMenuItem();
    }
}

abstract class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayMenuItem();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Pizza");
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Size: " + getSize());
        System.out.println("Toppings: " + Arrays.toString(getToppings()));
        System.out.println();
    }
}

class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public String getPattyType() {
        return pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Burger");
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Cheese: " + hasCheese());
        System.out.println("Patty Type: " + getPattyType());
        System.out.println();
    }
}

class Salad extends FoodItem {
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Salad");
        System.out.println("Name: " + getName());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Ingredients: " + Arrays.toString(getIngredients()));
        System.out.println();
    }
}