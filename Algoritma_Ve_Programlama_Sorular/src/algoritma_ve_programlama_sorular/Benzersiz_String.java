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
public class Benzersiz_String {
    public static void main(String[] args) {
        String cumle0 = "Benim adım bahadır";
        String cumle1 = "B";
        String cumle2 = "xxxxxxxxxx";
        String cumle3 = "zymnkljhgfdt";
        System.out.println(Benzersiz_String.isUniqieChars(cumle0));
        System.out.println(Benzersiz_String.isUniqieChars(cumle1));
        System.out.println(Benzersiz_String.isUniqieChars(cumle2));
        System.out.println(Benzersiz_String.isUniqieChars(cumle3));
    }

    public static boolean isUniqieChars(String str) {
        boolean[] char_set = new boolean[50111];
        for (int i = 0; i < str.length(); ++i) {
            char value = str.charAt(i);
            if (char_set[value]) {
                return false;
            }
            char_set[value] = true;
        }
        return true;
    }
}
