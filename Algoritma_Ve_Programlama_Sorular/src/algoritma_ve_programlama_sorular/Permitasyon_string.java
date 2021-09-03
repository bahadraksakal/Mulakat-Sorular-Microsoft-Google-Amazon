/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_ve_programlama_sorular;

import java.util.HashSet;

/**
 *
 * @author bahad
 */
public class Permitasyon_string {
     public static void main(String[] args) {
        String str0 = "abc";
        String str1 = "acb";
        String str2 = "ab";
        String str3 = "abx";
        System.out.println(Permitasyon_string.Str_per(str0, str1));
        System.out.println(Permitasyon_string.Str_per(str0, str2));
        System.out.println(Permitasyon_string.Str_per(str0, str3));
    }

    public static boolean Str_per(String str0, String str1) {
        if (str0.length() != str1.length()) {
            return false;
        }
        HashSet<Character> cumlenin_charlari = new HashSet<Character>();
        int hash_uzunluk = 0;
        for (int i = 0; i < str0.length(); ++i) {
            ++hash_uzunluk;
            cumlenin_charlari.add(Character.valueOf(str0.charAt(i)));
            cumlenin_charlari.add(Character.valueOf(str1.charAt(i)));
        }
        return cumlenin_charlari.size() == str0.length();
    }
}
