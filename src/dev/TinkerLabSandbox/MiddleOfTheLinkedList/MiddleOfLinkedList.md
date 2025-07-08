# Middle Node of a Linked List

## Problem Statement
Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

## Discussion
This problem is a classic exercise in linked list traversal. The goal is to find the middle node efficiently without using extra space for another data structure. The two-pointer technique (slow and fast pointers) is commonly used to solve this problem.

## Walkthrough
```java
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // Initialize slow pointer
        ListNode fast = head; // Initialize fast pointer

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {// Check if fast and fast.next are not null
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }

        return slow; // When fast reaches the end, slow will be at the middle
    }
}
```
### Logic & Explanation
- **Initialization**: Two pointers, `slow` and `fast`, are initialized to the head of the linked list.

- **Traversal**: The `while` loop continues as long as `fast` and `fast.next` are not null. Inside the loop:
  - The `slow` pointer moves one step forward.
  - The `fast` pointer moves two steps forward.

- **Finding the Middle**: When the `fast` pointer reaches the end of the list (either null or the last node), the `slow` pointer will be at the middle node. If there are two middle nodes, it will return the second one.
- **Return Value**: The method returns the `slow` pointer, which points to the middle node of the linked list.
- **Time Complexity**: O(n), where n is the number of nodes in the linked list, as we traverse the list once.
- **Space Complexity**: O(1), as we are using only two pointers and not any additional data structures.

## Edge Cases
- **Empty List**: If the linked list is empty (head is null), the method should handle it gracefully, possibly by returning null or throwing an exception.
- **Single Node**: If the linked list has only one node, that node is the middle node, and it should be returned.

## Related Concepts
- [[Linked Lists]]: Understanding the structure and traversal of linked lists is essential for solving this problem.
