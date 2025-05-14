/*
Crear un programa que registre usuarios validando el nombre de usuario y edad.
Debe lanzar excepciones personalizadas si los datos no son válidos.
Reglas:
    1. El nombre de usuario no puede estar vacío ni tener menos de 3 caracteres.
    2. La edad debe ser mayor o igual a 18.
    3. Si se ingresan datos inválidos, se deben lanzar excepciones.
 */
package ar.com.ale94.day03;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese su nombre: ");
                String name = scanner.nextLine();
                System.out.print("Ingrese su edad: ");
                int age = Integer.parseInt(scanner.nextLine());
                register(name, age);
                break;
            } catch (UserNotFoundException ex) {
                System.err.println(ex.getMessage());
            } finally {
                System.out.println("Saludo hasta luego.");
            }
        }
    }

    public static void register(String name, int age) throws UserNotFoundException {
        if (name == null || name.trim().isEmpty()) {
            throw new UserNotFoundException("El nombre no puede estar vacío.");
        }
        if (name.length() < 3) {
            throw new UserNotFoundException("El nombre debe tener al menos 3 caracteres.");
        }
        if (age < 18) {
            throw new UserNotFoundException("Debe ser mayor de edad para registrarse.");
        }
    }
}
