/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_ve_programlama_sorular;

import java.util.Random;

/**
 *
 * @author bahad
 */
public class Matris_satir_sutun_sifirla {
    public static int N = 5;

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < matrix.length; ++i) {
            System.out.print("| ");
            for (int j = 0; j < matrix[0].length; ++j) {
                matrix[i][j] = rand.nextInt(N);
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println(" |");
        }
        Matris_satir_sutun_sifirla.satir_sutun_0(matrix);
    }

    public static void satir_sutun_0(int[][] matrix) {
        int j;
        int i;
        boolean[] X_row_koordinat = new boolean[matrix.length];
        boolean[] Y_column_koordinat = new boolean[matrix[0].length];
        int k = 0;
        for (i = 0; i < matrix.length; ++i) {
            for (j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] != 0) continue;
                X_row_koordinat[i] = true;
                Y_column_koordinat[j] = true;
                System.out.println(i + "," + j);
                ++k;
            }
        }
        for (i = 0; i < X_row_koordinat.length; ++i) {
            for (j = 0; j < Y_column_koordinat.length; ++j) {
                if (!X_row_koordinat[i] && !Y_column_koordinat[j]) continue;
                matrix[i][j] = 0;
            }
        }
        for (i = 0; i < matrix.length; ++i) {
            System.out.print("| ");
            for (j = 0; j < matrix[0].length; ++j) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println(" |");
        }
    }
}
