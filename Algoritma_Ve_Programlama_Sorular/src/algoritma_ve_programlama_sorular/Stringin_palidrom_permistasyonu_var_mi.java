/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_ve_programlama_sorular;

/**
 *
 * @author bahad
 */
public class Stringin_palidrom_permistasyonu_var_mi {
     public static void main(String[] args) {
        String metin0 = "abccba";
        String metin1 = "ab";
        String metin2 = "abcccba";
        String metin3 = "xdffdxy";
        String metin4 = "xdf fdx ";
        System.out.println(Stringin_palidrom_permistasyonu_var_mi.palidrom_permitasyon(metin0));
        System.out.println(Stringin_palidrom_permistasyonu_var_mi.palidrom_permitasyon(metin1));
        System.out.println(Stringin_palidrom_permistasyonu_var_mi.palidrom_permitasyon(metin2));
        System.out.println(Stringin_palidrom_permistasyonu_var_mi.palidrom_permitasyon(metin3));
        System.out.println(Stringin_palidrom_permistasyonu_var_mi.palidrom_permitasyon(metin4));
    }

    public static boolean palidrom_permitasyon(String str) {
        if (str.length() <= 2) {
            return false;
        }
        int[] ASCII_used = new int[256];
        if (str.length() % 2 == 0) {
            int i;
            for (i = 0; i < str.length(); ++i) {
                char c = str.charAt(i);
                ASCII_used[c] = ASCII_used[c] + 1;
            }
            for (i = 0; i < ASCII_used.length; ++i) {
                if (ASCII_used[i] % 2 == 0) continue;
                return false;
            }
            return true;
        }
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            ASCII_used[c] = ASCII_used[c] + 1;
        }
        int kontrol = 0;
        for (int i = 0; i < ASCII_used.length; ++i) {
            if (ASCII_used[i] % 2 == 0) continue;
            if (kontrol == 1 || ASCII_used[i] != 3) {
                return false;
            }
            ++kontrol;
        }
        return true;
    }
}
