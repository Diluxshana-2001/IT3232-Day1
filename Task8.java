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