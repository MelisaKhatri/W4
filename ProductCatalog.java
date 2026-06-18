public class ProductCatalog {
    public static void main(String[] args) {
        Electronics electronic = new Electronics("Smart Watch", 4500, 2);
        Clothing clothing = new Clothing("Denim Jacket", 3500, "Large", "Denim");
        Grocery grocery = new Grocery("Orange Juice", 180, "August 10, 2026");

        electronic.displayDetails();
        clothing.displayDetails();
        grocery.displayDetails();
    }
}

abstract class Product{
    public String name;
    public double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Product : " + name);
        System.out.println("Price: " +  price);
    }
}

class Electronics extends Product{
    public int warrantyPeriod;

    public Electronics(String name, double price, int wp){
        super(name, price);
        this.warrantyPeriod = wp;
    }

    @Override
    public void displayDetails(){
        System.out.println("Electronic Product");
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyPeriod + " years\n");
    }
}

class Clothing extends Product{
    public String size;
    public String material;

    public Clothing(String name, double price, String size, String material){
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails(){
        System.out.println("Clothing Product");
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material + "\n");
    }
}

class Grocery extends Product{
    public String expiryDate;

    public Grocery(String name, double price, String expiryDate){
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails(){
        System.out.println("Grocery Product");
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Expiry: " + expiryDate);
    }
}