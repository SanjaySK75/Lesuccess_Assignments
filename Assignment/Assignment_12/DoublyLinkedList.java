import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class DoublyLinkedList {
    Node head;
    public void createList(int n, Scanner sc) {
        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            insertAtEnd(value);
        }
    }
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertAtPosition(int position, int value) {
        if (position <= 1) {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            insertAtEnd(value);
        }
        else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    public void deleteFirst() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
    }
    public void deleteAtPosition(int position) {
        if (head == null || position < 1)
            return;
        if (position == 1) {
            deleteFirst();
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        if (temp == null) return;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }
    public void displayForward() {
        Node temp = head;
        System.out.print("Doubly Linked List is: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        dll.createList(n, sc);
        dll.displayForward();
        dll.insertAtBeginning(10);
        System.out.println("After inserting 10 at beginning:");
        dll.displayForward();
        dll.insertAtEnd(20);
        System.out.println("After inserting 20 at end:");
        dll.displayForward();
        dll.insertAtPosition(3, 30);
        System.out.println("After inserting 30 at position 3:");
        dll.displayForward();
        dll.deleteFirst();
        System.out.println("After deleting first node:");
        dll.displayForward();
        dll.deleteLast();
        System.out.println("After deleting last node:");
        dll.displayForward();
        dll.deleteAtPosition(3);
        System.out.println("After deleting node at position 3:");
        dll.displayForward();
    }
}