package hasCycle;

import java.util.HashSet;

public class HasCycle {
    HashSet<ListNode> seenNodes = new HashSet<>();
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (seenNodes.contains(head)) {
                return true;
            }
            seenNodes.add(head);
            head = head.next;
        }
        return false;
    }
}
