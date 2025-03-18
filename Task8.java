abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract void displayInfo();
}

class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public void displayInfo() {
        System.out.println("Fruit: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println();
    }
}

class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public void displayInfo() {
        System.out.println("Vegetable: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println();
    }
}

class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public void displayInfo() {
        System.out.println("Grocery: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println();
    }
}
public class Task8 {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        Product apple = new Fruit("Apple", 2.5, 50);
        Product carrot = new Vegetable("Carrot", 1.2, 30);
        Product rice = new Grocery("Rice", 3.0, 100);

        store.addProduct(apple);
        store.addProduct(carrot);
        store.addProduct(rice);

        System.out.println("Products in Store:");
        store.displayProducts();

        store.editProduct("Apple", 2.8, 60);

        System.out.println("Updated Products:");
        store.displayProducts();

        store.removeProduct("Carrot");

        System.out.println("Products after removal:");
        store.displayProducts();
    }
}