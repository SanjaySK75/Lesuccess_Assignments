class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class ImplementAQueueUsingLinkedList {
    Node front, rear;
    public ImplementAQueueUsingLinkedList() {
        front = rear = null;
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
    }
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ImplementAQueueUsingLinkedList q = new ImplementAQueueUsingLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
