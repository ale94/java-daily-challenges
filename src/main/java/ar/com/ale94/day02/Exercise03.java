/*
 * Crea un sistema básico de orden de compras
 * Requisitos:
    1. Crear una clase Producto con nombre, cantidad y precio.
    2. Crear una clase Proveedor con nombre y contacto.
    3. Crear una clase OrdenDeCompra que contenga una lista de productos.
    4. Leer varios productos desde teclado.
    5. Agregar los productos a una orden.
    6. Mostrar el detalle de la orden (productos + total).
*/
package ar.com.ale94.day02;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PurchaseOrder order = new PurchaseOrder();

        System.out.print("¿Cuántos productos vas a ingresar? ");
        int quantityProduct = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantityProduct; i++) {
            System.out.println("\nProducto #" + (i + 1));

            System.out.print("Nombre: ");
            String name = scanner.nextLine();

            System.out.print("Cantidad: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.print("Precio unitario: ");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(name, quantity, price);
            order.add(product);
        }

        System.out.println("\n-----------------------------");
        order.detail();
        scanner.close();
    }

}
