class ImplementAQueueUsingArray {
    int front, rear;
    int[] queue;
    public ImplementAQueueUsingArray() {
        queue = new int[100];
        front = 0;
        rear = 0;
    }
    public void enqueue(int value) {
        if (rear == 100) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = value;
    }
    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
    }
    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ImplementAQueueUsingArray q = new ImplementAQueueUsingArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
