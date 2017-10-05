package OfferTest;

import java.util.Stack;

/**
 * 反转链表
 */
public class Demo14 {
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

        ListNode  listNode = med(root);
        System.out.print(listNode.val+"->");
        while (listNode.next!=null){
            listNode = listNode.next;
            System.out.print(listNode.val+"->");

        }
        System.out.println("null");

    }

    public static ListNode med(ListNode listNode){
        Stack<ListNode> stack = new Stack<>();
        if (listNode == null){
            return null;
        }

        if (listNode.next == null){
            return listNode;
        }
        while (listNode.next != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
     ListNode  listNode1 = stack.pop();
        while (!stack.empty()){
          listNode1.next = stack.pop();
          listNode1 = listNode1.next;
        }
        return  listNode1;
    }
}
