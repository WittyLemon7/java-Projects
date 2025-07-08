package dev.TinkerLabSandbox.MiddleOfTheLinkedList;

public class MiddleLinkedList {

        public static void main(String[] args) {

            // Build a linked list: 1 → 2 → 3 → 4 → 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6); // Adding a 6th node for even length

            // Call the fast & slow pointer solution
            ListNode middle = middleNode(head);
            System.out.println("Middle node value: " + middle.val);  // Expected: 3
        }

        public static ListNode middleNode(ListNode head) {
            ListNode slow = head;// Initialize slow pointer, which will move one step at a time
            ListNode fast = head;// Initialize fast pointer, which will move two steps at a time

            while (fast != null && fast.next != null) {// Loop until fast reaches the end of the list
                slow = slow.next;// Move slow pointer one step
                fast = fast.next.next;// Move fast pointer two steps
            }

            return slow;// When fast reaches the end, slow will be at the middle node
        }
    }

    class ListNode {// Definition for singly-linked list.
        int val;       // Value of the node
        ListNode next;// Pointer to the next node in the list

        ListNode(int val) {// Constructor to initialize the node with a value
            this.val = val;// Set the value of the node
            this.next = null;// Initialize the next pointer to null
        }


}
