package com.prepare4j.zmy.datastructure;

/**
 * 每个链表都包括一个LinikedList对象和许多Node对象，LinkedList对象通常包含头和尾节点的引用，分别指向链表的第一个节点和最后一个节点。而每个节点对象通常包含数据部分data，以及对上一个节点的引用prev和下一个节点的引用next，只有下一个节点的引用称为单向链表，两个都有的称为双向链表。next值为null则说明是链表的结尾，如果想找到某个节点，我们必须从第一个节点开始遍历，不断通过next找到下一个节点，直到找到所需要的。栈和队列都是ADT，可以用数组来实现，也可以用链表实现。
 */
public class TwoWayLinkedList {
    private Node head;//表示链表头
    private Node tail;//表示链表尾
    private int size;//表示链表的节点个数

    private class Node{
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data){
            this.data = data;
        }
    }

    public TwoWayLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    //在链表头增加节点
    public void addHead(Object value){
        Node newNode = new Node(value);
        if(size == 0){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    //在链表尾增加节点
    public void addTail(Object value){
        Node newNode = new Node(value);
        if(size == 0){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //删除链表头
    public Node deleteHead(){
        Node temp = head;
        if(size != 0){
            head = head.next;
            head.prev = null;
            size--;
        }
        return temp;
    }

    //删除链表尾
    public Node deleteTail(){
        Node temp = tail;
        if(size != 0){
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return temp;
    }

    //获得链表的节点个数
    public int getSize(){
        return size;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return (size == 0);
    }

    //显示节点信息
    public void display(){
        if(size >0){
            Node node = head;
            int tempSize = size;
            if(tempSize == 1){//当前链表只有一个节点
                System.out.println("["+node.data+"]");
                return;
            }
            while(tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if(node.next == null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }

    }
}
