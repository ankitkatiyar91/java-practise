package leetcode;

public class RotateList {


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int nodes = 0;
        ListNode rotateNode = null, tail = head;
        while (tail.next != null) {
            nodes++;
            tail = tail.next;
        }

        int nodesToRotate = nodes - k % nodes;
        rotateNode = head;
        for (int i = 0; i < nodesToRotate; i++) {
            rotateNode = rotateNode.next;
        }

        tail.next = head;
        head = rotateNode.next.next;
        rotateNode.next.next = null;

        return head;
    }
}

