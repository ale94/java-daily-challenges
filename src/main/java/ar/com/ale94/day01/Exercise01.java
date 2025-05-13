/*
 * Ejercicio 01 - Agenda telefónica simple.
 * El programa debe permitir:
     * Agregar contactos con nombre y número de teléfono.
     * Buscar un número por nombre.
     * Mostrar todos los contactos.
     * Usa un Map<String, String> donde:
     * La clave es el nombre del contacto.
     * El valor es el número de teléfono.
 */
package ar.com.ale94.day01;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        List<Map<String, Long>> contacts = new ArrayList<>();
        add(contacts);
        getByName(contacts);
        getAll(contacts);
    }

    public static void add(List<Map<String, Long>> contacts) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Long> contact = new HashMap<>();

        System.out.print("Cantidad de contactos: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.print("Ingrese nombre del contacto: ");
            String name = scanner.nextLine();
            System.out.print("Ingrese numero del contacto: ");
            Long number = Long.parseLong(scanner.nextLine());
            contact.put(name, number);
            contacts.add(contact);
        }
    }

    public static void getByName(List<Map<String, Long>> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buscar contacto: ");
        String searchByName = scanner.nextLine();
        for (Map<String, Long> c : contacts) {
            for (var k : c.keySet()) {
                if (k.equalsIgnoreCase(searchByName)) {
                    System.out.println("Contacto encontrado: " + k + " numero: " + c.get(k));
                    return;
                }
            }
            return;
        }
    }

    public static void getAll(List<Map<String, Long>> contacts) {
        System.out.println("Mostrar todos: ");
        for (Map<String, Long> c : contacts) {
            for (var k : c.keySet()) {
                System.out.println("Contacto: " + k + " numero: " + c.get(k));
            }
            return;
        }
    }

}
