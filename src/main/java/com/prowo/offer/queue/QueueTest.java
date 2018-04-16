package com.prowo.offer.queue;

import java.util.Stack;

/**
 * @author prowo
 * @date 2018/4/16
 */
public class QueueTest {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.err.println(pop());
        System.err.println(pop());
        System.err.println(pop());
        System.err.println(pop());
    }

    private static void push(int node) {
        stack1.push(node);
    }

    private static Integer pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Integer first = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return first;
    }

}
