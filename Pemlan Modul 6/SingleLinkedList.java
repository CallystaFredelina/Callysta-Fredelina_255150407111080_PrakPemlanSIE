public class SingleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }
    void print() {
    Node current = head;
    System.out.print("List: ");
    while (current != null) {
        System.out.print(current.data);
        if (current.next != null) System.out.print(" -> ");
        current = current.next;
    }
    System.out.println();
}

    // a. Mencari node dengan nilai tertentu
    Node findByValue(Object value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    // b. 
    Node findByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    // c.
    void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node prev = findByIndex(index - 1);
            Node toDelete = prev.next;
            prev.next = toDelete.next;
            if (toDelete.next == null) {
                // Node yang dihapus adalah tail
                tail = prev;
            }
        }
        size--;
    }
    //d.
    void removeByValue(Object value) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        // Cek jika head yang dihapus
        if (head.data.equals(value)) {
            head = head.next;
            if (head == null) tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println("Data " + value + " tidak ditemukan.");
    } 
    //e.
    void addAtIndex(int index, Node data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node prev = findByIndex(index - 1);
            data.next = prev.next;
            prev.next = data;
            size++;
        }
    }
    //f.
    void addAfterValue(Object value, Node data) {
        Node target = findByValue(value);
        if (target == null) {
            System.out.println("Data " + value + " tidak ditemukan.");
            return;
        }
        data.next = target.next;
        target.next = data;
        if (data.next == null) {
            tail = data; // update tail jika ditambah setelah node terakhir
        }
        size++;
    }
    //g.
    void addBeforeValue(Object value, Node data) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        if (head.data.equals(value)) {
            addFirst(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                data.next = current.next;
                current.next = data;
                size++;
                return;
            }
            current = current.next;
        }
        System.out.println("Data " + value + " tidak ditemukan.");
    }

 public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList();

    list.addLast(new Node("A"));
    list.addLast(new Node("B"));
    list.addLast(new Node("D"));

    list.addBeforeValue("C", new Node("y"));
    System.out.print("g. Tambah 'y' sebelum 'C': ");
    list.print();

    }
} 
