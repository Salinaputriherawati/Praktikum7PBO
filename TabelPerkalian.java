/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg7;

/**
 *
 * @author 62898
 */
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        System.out.println("Tabel Perkalian:");

        System.out.println("--------------------------");
        int i = 1;
        do {
            System.out.print("|");
            int j = 1;
            do {
                System.out.printf("%5d ", i * j);
                j++;
            } while (j <= n);
            System.out.println("|");
            i++;
        } while (i <= n);
        System.out.println("--------------------------");
    }
}