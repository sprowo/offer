package com.prowo.jdk.inf;

/**
 * @author prowo
 * @date 2018/1/2
 */
public interface Inf1 {

    static void aa() {
        System.err.println("inf1 aa");
    }

    default void bb() {
        System.err.println("inf1 bb");
    }

}
