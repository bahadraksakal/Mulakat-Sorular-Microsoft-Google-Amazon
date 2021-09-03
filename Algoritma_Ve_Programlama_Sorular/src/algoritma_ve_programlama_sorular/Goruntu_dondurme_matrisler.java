/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_ve_programlama_sorular;

import java.util.Random;


public class Goruntu_dondurme_matrisler {
    public static int N = 5;
    public static int M = 4;

    public static void main(String[] args) {
        int j;
        int i;
        int[][] goruntu_matrisi = new int[M][M];
        Random rand = new Random();
        for (int i2 = 0; i2 < goruntu_matrisi.length; ++i2) {
            System.out.print("| ");
            for (int j2 = 0; j2 < goruntu_matrisi[i2].length; ++j2) {
                goruntu_matrisi[i2][j2] = rand.nextInt(N);
                System.out.print(goruntu_matrisi[i2][j2] + ",");
            }
            System.out.print(" |\n");
        }
        int[][] goruntu_matrisi_rotate = new int[M][M];
        for (i = 0; i < goruntu_matrisi.length; ++i) {
            for (j = 0; j < goruntu_matrisi[i].length; ++j) {
                goruntu_matrisi_rotate[j][goruntu_matrisi.length - i - 1] = goruntu_matrisi[i][j];
            }
        }
        System.out.println("\nDONDURULMUS HALİ \n");
        for (i = 0; i < goruntu_matrisi.length; ++i) {
            System.out.print("| ");
            for (j = 0; j < goruntu_matrisi[i].length; ++j) {
                goruntu_matrisi[i][j] = rand.nextInt(N);
                System.out.print(goruntu_matrisi_rotate[i][j] + ",");
            }
            System.out.print(" |\n");
        }
    }
}
