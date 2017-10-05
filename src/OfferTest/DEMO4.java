package OfferTest;

/**
 * 从尾到头打印链表
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 定义链表
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode() {

    }
}
public class DEMO4 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
     //   root.val = 1;
        root.next = new ListNode(2);
      //  root.next.val = 2;
        root.next.next = new ListNode(3);
      //  root.next.next.val = 3;
        root.next.next.next = new ListNode(4);
       // root.next.next.next.val = 4;
        root.next.next.next.next = new ListNode(5);
       // root.next.next.next.next.val = 5;
        Med(root);

    }
    public static void Med(ListNode listNode){
     //   ArrayList list = new ArrayList<Integer>();
        Stack stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }


        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
