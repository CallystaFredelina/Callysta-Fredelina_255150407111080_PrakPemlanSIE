public class CustomQueue {
    
    private Node head, tail;
    private int size = 0;
        
    public void enqueue(int x) {
        Node n = new Node(x);
        if (tail != null) tail.next = n;
        tail = n;
        if (head == null) head = tail;
        size++;
    }

    public int dequeue() {
      if (head == null)
        throw new RuntimeException("Queue is empty.");
      int val = head.data;
      head = head.next;
      if (head == null) tail = null;
      size--;
      return val;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (head == null) {
            System.out.println("Queue kosong.");
            return;
        }
        System.out.print("Isi Queue: ");
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.data + "] ");
            current = current.next;
        }
        System.out.println();
    }
    public int peek() {
        if (head == null)
            throw new RuntimeException("Queue kosong.");
        return head.data; // hanya melihat, tidak menghapus
    }
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);

        //tambahan no.2 
        queue.dequeue();        
        queue.enqueue(35);      
        queue.enqueue(45);

        //fungsi print() no.3
        queue.print();

        //peek() no.4
        System.out.println("=== Sebelum peek() ===");
        queue.print();

        System.out.println("Hasil peek(): " + queue.peek());

        System.out.println("=== Sesudah peek() ===");
        queue.print();
        
    }
} 