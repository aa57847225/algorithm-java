package com.whl.demo.linkedlist;

public class SingleLinkedList {

    static class Node{
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    Node head = null;

    // 插入链表数据
    public void insert(Object value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // 删除链表数据
    public void delete(int index){
        int i = 1;

        Node preNode = head;
        Node currentNode = preNode.next;
        while (currentNode != null){
            if (i == index){
                preNode.next = currentNode.next;
                return;
            }
            preNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
    }

    //  打印链表
    public void printlist(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    // 链表反转
    public void ReverseIteratively(){
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null){
            Node pNext = pNode.next;
            if (pNext == null){
                pReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReversedHead;
    }

    // 茶渣单链表中间节点
    public Node searchMid(){
        Node p = this.head,q = this.head;
        while (p != null && p.next != null
                && p.next.next != null){
            p = p.next.next;
            q = q.next;
        }
        System.out.println("mid "+q.data);
        return q;
    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.insert(12);
        s.insert("s");
        s.insert("c");
        s.insert("a");
        s.insert("v");
        s.insert("w");
        s.insert("4c");
        s.insert("5c");
        s.insert("7c");
        s.insert("8c");
        s.insert("81c");
        s.insert("28c");
        s.insert("83c");
        s.insert("84c");
        s.insert("85c");

        s.printlist();
        System.out.println("");
//        s.delete(1);
//        s.printlist();

//        Node node = new Node("c");
        s.ReverseIteratively();
        s.printlist();

        System.out.println("");
        s.searchMid();
    }
}
