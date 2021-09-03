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
public class String_space_to_char {
    public static void main(String[] args) {
        String str = "  Benim ad\u0131m  bahad\u0131r aksakal  ";
        System.out.println(String_space_to_char.URlify(str));
    }

    public static String URlify(String str) {
        int boyut_char = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                boyut_char += 3;
                continue;
            }
            ++boyut_char;
        }
        char[] chrs_str = new char[boyut_char];
        int j = 0;
        for (int i = 0; i < chrs_str.length; ++i) {
            if (str.charAt(i - j) == ' ') {
                j += 2;
                chrs_str[i++] = 37;
                chrs_str[i++] = 50;
                chrs_str[i] = 48;
                continue;
            }
            chrs_str[i] = str.charAt(i - j);
        }
        return new String(chrs_str);
    }
}
