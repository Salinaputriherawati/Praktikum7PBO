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

public class LaguAnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        do {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        } while (n > 1);
        System.out.println("Anak ayam turun 1, mati satu tinggal 0.");
    }
}