import java.util.*;

class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    public static int linearSearch(Product[] products, String target) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(target))
                return i;
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String target) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = products[mid].productName.compareToIgnoreCase(target);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Bag", "Fashion"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Scale", "Home"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String target = sc.nextLine();

        if (linearSearch(products, target) != -1)
            System.out.println("Found using Linear Search");
        else
            System.out.println("Not Found using Linear Search");

        if (binarySearch(products, target) != -1)
            System.out.println("Found using Binary Search");
        else
            System.out.println("Not Found using Binary Search");

        sc.close();
    }
}