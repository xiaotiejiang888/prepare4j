package com.prepare4j.zmy.node;

public class Test {
    public static void main(String[] args) {
        Node linkNode1 = new Node(1);
        Node linkNode2 = new Node(2);
        Node linkNode3 = new Node(3);
        Node linkNode4 = new Node(4);
        Node linkNode5 = new Node(5);
        Node linkNode6 = new Node(6);
        linkNode1.setNext(linkNode2);
        linkNode2.setNext(linkNode3);
        linkNode3.setNext(linkNode4);
        linkNode4.setNext(linkNode5);
        linkNode5.setNext(linkNode6);
        Node.fmtNode(linkNode1);
        Node node = Node.reverseListNode(linkNode1);
        System.out.println("===============");
        System.out.println(node.getData());
    }
}
