package OfferTest;

/**
 * 合并递增两个链表
 */


public class Demo15 {
    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        ListNode root2 = new ListNode(0);
        root2.next = new ListNode(2);
        root2.next.next = new ListNode(4);
        ListNode root = med(root1,root2);
        System.out.println(root.val);
        while (root.next!=null){
            System.out.println(root.next.val);
            root = root.next;
        }
        //      1 2 3 ......0 2 4


    }


    public static ListNode med(ListNode list1,ListNode list2){


        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode listNode ;
        if (list1.val<list2.val){
            listNode = list1;
            listNode.next = med(list1.next,list2);
        }else {
            listNode = list2;
            listNode.next = med(list1,list2.next);
        }

            return listNode;

    }
}
