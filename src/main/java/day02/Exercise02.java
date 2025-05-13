/*
 * Crea un programa que permita gestionar un inventario de productos.
 * El usuario podrá:
    1. Agregar productos con su cantidad.
    2. Actualizar la cantidad de un producto.
    3. Consultar la cantidad disponible.
    4. Mostrar todo el inventario.
 * Usa un Map<String, Integer> donde:
 * La clave es el nombre del producto.
 * El valor es la cantidad disponible.
 */
package day02;

import java.util.*;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Map<String, Integer>> products = new ArrayList<>();

        // Agregar Productos
        Map<String, Integer> product = new HashMap<>();
        product.put("Smart Tv Sony 42", 2);
        products.add(product);

        Map<String, Integer> product2 = new HashMap<>();
        product2.put("Samsung J5", 12);
        products.add(product2);

        Map<String, Integer> product3 = new HashMap<>();
        product3.put("Notebook HP", 5);
        products.add(product3);


        // Actualizar cantidad de producto
        System.out.print("Digite el producto a modificar: ");
        String search = scanner.nextLine();
        System.out.print("Digite la nueva cantidad del producto: ");
        Integer newQuantity = Integer.parseInt(scanner.nextLine());

        for (Map<String, Integer> p : products) {
            for (Map.Entry<String, Integer> entry : p.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(search)) {
                    entry.setValue(newQuantity);
                    System.out.println("Producto modificado con éxito...");
                }
            }
        }

        // Mostrar todos
        for (Map<String, Integer> p : products) {
            for (Map.Entry<String, Integer> entry : p.entrySet()) {
                System.out.println("Producto modificado con éxito...");
                System.out.println("Producto: " + entry.getKey());
                System.out.println("Cantidad: " + entry.getValue());
                System.out.println("----");
            }
        }
    }

}
