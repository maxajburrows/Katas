package MergeKLinkedLists;

import java.util.Arrays;

public class MergeKLinkedLists {

    ListNode mergedList = new ListNode();


    public ListNode mergeKLists(ListNode[] lists) {
        int counter = 0;
        if (lists.length == 0 || lists[0] == null) {
            return null;
        }
        int lowValue = 10001;
        int lowNode = 0;
        counter++;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].val < lowValue) {
                lowValue = lists[i].val;
                lowNode = i;
            }
        }
        addNodeToMergedList(lowValue, counter);
        System.out.println("Made it here");
        return null;
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
