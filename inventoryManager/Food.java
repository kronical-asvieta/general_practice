package general_practice.inventoryManager;

public class Food extends Product {
    private String expiryDate;

    public Food(String n, double p, String e) {
        super(n, p);
        this.expiryDate = e;
    }

    public String toString() {
        return super.toString() + " | Mindestens haltbar bis: " + expiryDate;
    }
}