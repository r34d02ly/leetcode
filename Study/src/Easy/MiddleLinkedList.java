package Easy;


public class MiddleLinkedList {


    ListNode testL1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
    ListNode testL2 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6))))));

    public ListNode middleNode01(ListNode head) {
        ListNode cur = head;
        int cnt = 1;
        while (cur.next != null) {
            cur = cur.next;
            cnt++;
        }

        int middle = (int)Math.floor(cnt/2)+1;
        cur = head;
        for(int i=0; i<middle-1; i++) {
            cur = cur.next;
        }

        return cur;
    }

    public ListNode middleNode02(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next == null ? fast.next : fast.next.next;

        }
        return slow;
    }

    public void methodTest() {
        System.out.println(middleNode02(testL2));
        System.out.println("=================");
    }
}
