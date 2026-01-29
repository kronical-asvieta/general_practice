package general_practice.inventoryManager;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String n, double p, int w) {
        super(n, p);
        this.warrantyMonths = w;
    }

    public String toString() {
        return super.toString() + " | Garantie: " + this.warrantyMonths + " Monate";
    }
}