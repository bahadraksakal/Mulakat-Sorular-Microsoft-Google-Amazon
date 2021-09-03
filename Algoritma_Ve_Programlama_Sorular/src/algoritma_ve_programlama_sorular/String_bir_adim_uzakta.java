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
public class String_bir_adim_uzakta {
     public static void main(String[] args) {
        String str0 = "BAHADR";
        String str1 = "bahadr";
        String str2 = "BAHADRX";
        String str3 = "BAHADYR";
        String str4 = "YBAHA DR";
        String str5 = "BAHADr";
        String str6 = "BAHAdr";
        String str7 = "baHADr";
        String str8 = "bAHADR";
        String str9 = "BAHADR";
        String str10 = "BAH";
        String str11 = "BAHAD";
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str1));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str2));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str3));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str4));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str5));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str6));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str7));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str8));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str9));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str10));
        System.out.println(String_bir_adim_uzakta.String_mesafe_kontrol(str0, str11));
    }

    public static boolean String_mesafe_kontrol(String str0, String str1) {
        int[] adetler = new int[256];
        int sonuc = 0;
        if (str0.length() < str1.length()) {
            int i;
            for (i = 0; i < str0.length(); ++i) {
                char c = str0.charAt(i);
                adetler[c] = adetler[c] + 1;
            }
            for (i = 0; i < str1.length(); ++i) {
                char c = str1.charAt(i);
                adetler[c] = adetler[c] - 1;
            }
            for (i = 0; i < adetler.length; ++i) {
                if (adetler[i] >= 0) continue;
                sonuc += adetler[i];
            }
        } else {
            int i;
            for (i = 0; i < str1.length(); ++i) {
                char c = str1.charAt(i);
                adetler[c] = adetler[c] + 1;
            }
            for (i = 0; i < str0.length(); ++i) {
                char c = str0.charAt(i);
                adetler[c] = adetler[c] - 1;
            }
            for (i = 0; i < adetler.length; ++i) {
                if (adetler[i] >= 0) continue;
                sonuc += adetler[i];
            }
        }
        System.out.print("  uzaklık: " + -1 * sonuc + "  ");
        return sonuc == 0 || sonuc == -1;
    }
}
