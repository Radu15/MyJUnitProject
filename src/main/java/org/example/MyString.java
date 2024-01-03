package org.example;

public class MyString {

    public int method1(String str) {
        int i = str.length();
        return i;
    }

    public String method2(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

    public boolean method3(String x) {
        return Character.toLowerCase(x.charAt(0)) == 'a' || Character.toLowerCase(x.charAt(0)) == 'e' || Character.toLowerCase(x.charAt(0)) == 'i' || Character.toLowerCase(x.charAt(0)) == 'o' || Character.toLowerCase(x.charAt(0)) == 'u';
    }

    public String method4(String cuvant) {
        String invers = "";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            invers = invers + cuvant.charAt(i);
        }
        return invers;
    }
}
