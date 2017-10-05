package OfferTest;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * 链表倒数第k个结点
 */
public class Demo13 {
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


       // ListNode res =  med1(root,2);
       // System.out.println(res.val);
       // System.out.println(med1(root,0));
        System.out.println(med1(root,1).val);
       // System.out.println(med1(root,10));
        //System.out.println(root.val);
       /*
        System.out.print(res.val+"->");
        while (res.next != null){
            res = res.next;
            System.out.print(res.val+"->");
        }
        System.out.print("null");
        */
    }
    public static ListNode med1(ListNode listNode,int k){
        if (listNode==null||k<=0){
            return null;
        }

        if (k==1)
        {
            while (listNode.next!=null){
                listNode = listNode.next;
            }
            return listNode;
        }

        ListNode first = listNode;
        ListNode secend = listNode;
        for (int i = 1;i<k;i++){
            if (first.next != null){
                first = first.next;
            }else
                return null;

        }

        while (first.next!=null){
            first = first.next;
            secend = secend.next;
        }
        return secend;
    }


    public static ListNode med(ListNode head,int k) {
        if (head == null) {
            return head;
        }
        if (k==0) {
            return new ListNode(0).next;
        }
        ListNode pAhead = head;
        ListNode pBehind = null;

        for (int i=0; i<k-1; i++) {
            if (pAhead.next != null)
                pAhead = pAhead.next;
            else
                return pAhead.next; //k大于列表长度
        }
        pBehind = head;
        while (pAhead.next != null) {
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }
        return pBehind;
    }
}
