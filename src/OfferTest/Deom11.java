package OfferTest;

/**
 * 删除单个链表结点
 */
public class Deom11 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);

        listNode.next.next.next.next = new ListNode(4);
        ListNode listNode1 = listNode.next.next.next.next;
        /**
        System.out.print(listNode.val+"->");
        while (listNode.next!=null){
            System.out.print(listNode.next.val+"->");
            listNode.next = listNode.next.next;

        }
        System.out.print("null");
        System.out.println();*/

        ListNode listNode2 = dete(listNode,listNode);
        System.out.print(listNode2.val+"->");
        while (listNode2.next!=null){
            System.out.print(listNode2.next.val+"->");
            listNode2.next = listNode2.next.next;

        }
        System.out.print("null");

    }

    public static ListNode dete(ListNode head ,ListNode listNode1){
        // 如果输入参数有空值就返回表头结点
        if (head == null || listNode1 == null) {
            return head;
        }
        if (head == listNode1){
            return  head = head.next;
        }
        if (listNode1.next == null) {
            // 找待删除元素的前驱
            ListNode tmp = head;
            while (tmp.next != listNode1) {
                tmp = tmp.next;
            }
            // 删除待结点
            tmp.next = null;

        }else {

            //连接
            // 将下一个结点的值输入当前待删除的结点
            listNode1.val = listNode1.next.val;
            // 待删除的结点的下一个指向原先待删除引号的下下个结点，即将待删除的下一个结点删除
            listNode1.next = listNode1.next.next;
        }

        // 返回删除节点后的链表头结点
        return head;
    }
}


