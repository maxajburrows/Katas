package MergeKLinkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeKLinkedListsTest {

    ListNode list1Node3;
    ListNode list1Node2;
    ListNode list1Node1;
    ListNode list2Node3;
    ListNode list2Node2;
    ListNode list2Node1;
    ListNode list3Node3;
    ListNode list3Node2;
    ListNode list3Node1;
    ListNode[] test1List;
    MergeKLinkedLists merger;
    @BeforeEach
    void setUp() {
        list1Node3 = new ListNode(5);
        list1Node2 = new ListNode(4, list1Node3);
        list1Node1 = new ListNode(1, list1Node2);
        list2Node3 = new ListNode(4);
        list2Node2 = new ListNode(3, list2Node3);
        list2Node1 = new ListNode(1, list2Node2);
        list3Node2 = new ListNode(6);
        list3Node1 = new ListNode(2, list3Node2);
        test1List = new ListNode[]{list1Node1, list2Node1, list3Node1};
        merger = new MergeKLinkedLists();
    }

    @Test
    void testListBuilding() {
        assertEquals(1, list1Node1.val);
        assertEquals(4, list1Node1.next.val);
        assertEquals(5, list1Node1.next.next.val);
    }
    @Test
    void test1() {
        merger.mergeKLists(test1List);
    }

}