package hasCycle;

import java.util.HashSet;

public class HasCycle {
    HashSet<ListNode> seenNodes = new HashSet<>();
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (seenNodes.contains(head)) {
            return true;
        }
        seenNodes.add(head);
        return hasCycle(head.next);
    }
}
