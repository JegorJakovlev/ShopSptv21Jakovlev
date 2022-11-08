
package entity;


import java.util.Arrays;
import java.util.Scanner;


public class BookProduct {

    private final Scanner scanner;
    Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public BookProduct() {
        products = new Product[0];
        scanner = new Scanner(System.in);
    }


  

    @Override
    public String toString() {
        return "BookProduct{" +
                "scanner=" + scanner +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
