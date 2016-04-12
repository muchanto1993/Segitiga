/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.Scanner;

/**
 *
 * @author Anto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pil, nb;

        while (true) {
            System.out.println("--MENU--");
            System.out.println("1. Bintang Segitiga Siku-Siku Rata Kiri");
            System.out.println("2. Bintang Segitiga Siku-Siku Rata Kanan");
            System.out.println("3. Bintang Segitiga Sama Kaki");
            System.out.println("-----------------------------------------");
            System.out.println("0. Exit");
            System.out.print("Pil : ");
            pil = scn.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("--SEGITIGA SIKU-SIKU A--");
                    System.out.print("Masukkan nilai baris : ");
                    nb = scn.nextInt();

                    for (int i = 1; i <= nb; i++) {
                        System.out.print(i + ".");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("--END--\n");
                    break;
                case 2:
                    System.out.println("--SEGITIGA SIKU-SIKU B--");
                    System.out.print("Masukkan nilai baris : ");
                    nb = scn.nextInt();

                    for (int i = nb; i >= 1; i--) {
                        System.out.print(i + ".");
                        for (int j = i; j >= 1; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("--END--\n");
                    break;
                case 3:
                    System.out.println("--SEGITIGA SAMA KAKI--");
                    System.out.print("Masukkan nilai baris : ");
                    nb = scn.nextInt();

                    for (int i = 1; i <= nb; i++) {
                        System.out.print(i + ".");
                        for (int j = nb; j > i; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    System.out.println("--END--\n");
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("MENU TIDAK TERSEDIA!!!");
                    break;
            }
        }
    }

}
