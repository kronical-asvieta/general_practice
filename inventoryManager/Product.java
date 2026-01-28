package general_practice.inventoryManager;

public class Product {
    private String name;
    private double preis;

    public Product(String n, double p) {
        this.name = n;
        this.preis = p;
    }

    public double getPrice() {
        return this.preis;
    }

    public String toString() {
        return name + " (" + String.format("%.2f", preis) + " EUR) ";
    }
}