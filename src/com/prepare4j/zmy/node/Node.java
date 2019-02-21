package com.prepare4j.zmy.node;


public class Node {

    private Integer data;//数据域
    private Node next;//指针域

    public Node() {
    }

    public Node(Integer data){
        this.data = data;
    }

    public Node(Integer data,Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void fmtNode(Node head){
        boolean f = true;
        while (f){
            System.out.println(head.getData());
            if (null != head.getNext()){
                head = head.getNext();
            }else{
                f=false;
            }
        }
    }

    public static Node reverseListNode(Node head){
//单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null){
            return head;
        }
        //前一个节点指针
        Node preNode = null;
        //当前节点指针
        Node curNode = head;
        //下一个节点指针
        Node nextNode = null;

        while (curNode != null){
            nextNode = curNode.getNext();//nextNode 指向下一个节点
            curNode.setNext(preNode);//将当前节点next域指向前一个节点
            preNode = curNode;//preNode 指针向后移动
            curNode = nextNode;//curNode指针向后移动
        }

        return preNode;
    }
}