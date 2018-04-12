package com.prowo.offer.test.list;

/**
 * @author prowo
 * @date 2018/3/25
 */
public class LinkedListTest {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

//        System.err.println(getMidNode(node1).value);
        System.err.println(getBwNode(node1, 1));
    }

    public static Node getBwNode(Node head, int k) {
        if (getLength(head) < k) {
            throw new RuntimeException("k is more then list len.");
        }

        if (head == null) {
            return head;
        }

        Node next = head;
        do {
            next = next.next;
        } while (--k != 0);

        System.err.println(next);

        while (next != null) {
            head = head.next;
            next = next.next;
        }

        return head;
    }

    public static Node getMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node next = head.next;

        while (next != null && next.next != null) {
            head = head.next;
            next = next.next.next;
        }

        return head;
    }

    public static int getLength(Node head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node pre = null;
        Node next;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
