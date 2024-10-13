/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg7;

/**
 *
 * @author 62898
 */
public class DeretPrima {
    public static void main(String[] args) {
        int input = 20;

        System.out.println("Bilangan Prima 0 - 20 adalah:");
        for (int i = 2; i <= input; i++) {
            boolean prima = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Bukan Prima 0 - 20 adalah:");
        for (int i = 0; i <= input; i++) {
            if (i < 2) {  
                System.out.print(i + " ");
                continue;
            }

            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                }
            }
            if (!prima) {
                System.out.print(i + " ");
            }
        }
    }
}