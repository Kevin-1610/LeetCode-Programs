class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode start = null;
        ListNode end = null;

        for(int i = 1; i < k; i++){
            first = first.next;
        }
        start = first;

        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        end = second;

        int temp = start.val;
        start.val = end.val;
        end.val = temp;

        return head;
    }
}
