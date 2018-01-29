package com.problem.solving.algorithms.linkedlist;

import java.util.Objects;

/**
 * Created by VijaySidhu on 1/28/2018.
 */
public class ReverseList {

    /**
     * Divide List into two parts - first node and rest of the linked list
     * Call reverse for the rest of the linked list
     * Link rest to the first
     * Fix the head pointer
     * Time Complexity O(n) and Space Complexity O(1)
     *
     * @param head
     * @return
     */
    public static Node reverseList(Node head) {
        // If list has only one element
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        // Save the next Node in variable
        Node next = head.next;
        // As we already saved next element in variable set next to null
        head.next = null;
        Node rest = reverseList(next);
        next.next = head;
        return rest;
    }
}
