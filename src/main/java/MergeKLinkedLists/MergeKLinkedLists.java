package MergeKLinkedLists;

import java.util.Arrays;

public class MergeKLinkedLists {

    ListNode mergedList = new ListNode();


    public ListNode mergeKLists(ListNode[] lists) {
        int counter = 0;
        if (lists.length == 0) {
            return null;
        }
        boolean allNodesEmpty = true;
        for (ListNode node : lists) {
            if (node != null) {
                allNodesEmpty = false;
                break;
            }
        }
        if (allNodesEmpty) {
            return null;
        }

        int lowValue = 10001;
        boolean listsRemaining = true;

        while (listsRemaining) {
            int lowNode = 0;
            counter++;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (lists[i].val < lowValue) {
                    lowValue = lists[i].val;
                    lowNode = i;
                }
            }
            addNodeToMergedList(lowValue, counter);
            if (lists[lowNode] == null) {
                return mergedList;
            }
            if (lists[lowNode].next == null ) {
                lists[lowNode] = null;
            } else if (lists[lowNode].next.next == null) {
                lists[lowNode] = new ListNode(lists[lowNode].next.val);
            } else {
                lists[lowNode] = new ListNode(lists[lowNode].next.val, lists[lowNode].next.next);
            }

            listsRemaining = false;
            for (ListNode list : lists) {
                if (list != null) {
                    listsRemaining = true;
                    break;
                }
            }
        }
        System.out.println("Made it here");
        return mergedList;
    }

    private void addNodeToMergedList(int lowValue, int counter) {
        if (counter == 1) {
            mergedList.val = lowValue;
            return;
        }
        ListNode currentNode = new ListNode();
        currentNode = mergedList;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(lowValue);
    }
}
