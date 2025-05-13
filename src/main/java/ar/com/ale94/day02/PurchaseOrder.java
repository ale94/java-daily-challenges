package ar.com.ale94.day02;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    private final List<Product> products;

    public PurchaseOrder() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void detail() {
        double total = 0;
        System.out.println("Detalle de la orden:");
        for (Product p : products) {
            System.out.println("- " + p.getName() +
                    " | Cantidad: " + p.getQuantity() +
                    " | Precio: $" + p.getPrice());
            total += p.getPrice() * p.getQuantity();
        }
        System.out.println("Total de la orden: $" + total);
    }
}
