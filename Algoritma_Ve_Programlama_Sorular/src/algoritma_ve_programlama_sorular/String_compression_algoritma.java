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
public class String_compression_algoritma {
    public static void main(String[] args) {
        String str = "aaaaabb   ccccdfgKKKKK xccaaaaaaafffrrttttt   xx";
        System.out.println(String_compression_algoritma.compression_data(str));
    }

    public static String compression_data(String str) {
        boolean kontrol = false;
        int sayac = 1;
        StringBuilder new_str_b = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            char kontrolchar = str.charAt(i);
            if (i < str.length() - 2) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                    while (str.charAt(i) == str.charAt(i + 1)) {
                        ++sayac;
                        if (i == str.length()) break;
                        ++i;
                    }
                    kontrol = false;
                    System.out.println(kontrolchar);
                    System.out.println(sayac);
                    new_str_b.append(kontrolchar);
                    new_str_b.append(sayac);
                    sayac = 1;
                    continue;
                }
                new_str_b.append(kontrolchar);
                continue;
            }
            new_str_b.append(kontrolchar);
        }
        String new_str = new_str_b.toString();
        return new_str;
    }
}
