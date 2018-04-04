package com.prowo.offer.string;

public class ReplaceSpace {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.err.println(replaceSpace2(sb));
    }

    public static String replaceSpace2(StringBuffer str) {
        if (str == null) {
            return null;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }
}
