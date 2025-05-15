/*
    Programa que te pida ingresar números por el teclado
    y determinar los números pares y su media.
 */
package ar.com.ale94.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Digite la cantidad de números: ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print(i + 1 + ": ");
            numbers.add(scanner.nextInt());
        }

        List<Integer> pairs = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Números pares: " + pairs);
        int total = pairs.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La suma de los números pares: " + total);

    }
}
