package general_practice.inventoryManager;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<Product> generateProducts(int amt) {
        List<Product> out = new ArrayList<>();
        String[] names = {"Suppe", "Eisbergsalat", "Brot", "Orange"};

        for (int i = 0; i < amt; i++) {
            int randomInt = (int)(Math.random() * 4);
            double randomDouble = Math.random() * 10;
            out.add(new Product(names[randomInt], randomDouble));
        }

        return out;
    }

    public static List<Product> filterExpensive(List<Product> products, double threshold) {
        List<Product> filtered = new ArrayList<>();
        if (products == null) return filtered;

        for (Product p : products) {
            if (p.getPrice() > threshold) {
                filtered.add(p);
            }
        }

        return filtered;
    }
    public static void main(String[] args) {
        List<Product> stuff = generateProducts(20);
        System.out.println(filterExpensive(stuff, 0));
    }
}