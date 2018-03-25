package com.prowo.jdk.inf;

/**
 * @author prowo
 * @date 2018/1/2
 */
public class C implements Inf1, Inf2 {

    public static void aa() {
        System.err.println("c aa");
    }

    @Override
    public void bb() {
        System.err.println("c bb");
    }


    public static void main(String[] args) {
        C c = new C();
        c.bb();
//        c.aa();
    }

}
