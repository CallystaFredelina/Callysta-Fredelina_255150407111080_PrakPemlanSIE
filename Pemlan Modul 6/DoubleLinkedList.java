public class DoubleLinkedList {
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
            head.prev = data;
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
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    //a.
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
    //b.
  Node findByIndex(int index) {
    if (index < 0 || index >= size) return null;
    Node current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
    return current;
}
    //c.
void removeByIndex(int index) {
    if (index < 0 || index >= size) return;
    if (index == 0) {
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
    } else {
        Node current = findByIndex(index);
        current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
        else tail = current.prev;
    }
    size--;
}
    //d.
  void removeByValue(Object value) {
    Node current = head;
    while (current != null) {
        if (current.data.equals(value)) {
            if (current.prev != null) current.prev.next = current.next;
            else head = current.next;
            if (current.next != null) current.next.prev = current.prev;
            else tail = current.prev;
            size--;
            return;
        }
        current = current.next;
    }
  }
    //e.
    void addAtIndex(Node data, int index) {
    if (index <= 0) {
        addFirst(data);
    } else if (index >= size) {
        addLast(data);
    } else {
        Node current = findByIndex(index);
        data.next = current;
        data.prev = current.prev;
        current.prev.next = data;
        current.prev = data;
        size++;
    }
  }
    //f.
  void addAfterValue(Object value, Node data) {
    Node current = findByValue(value);
    if (current == null) return;
    data.next = current.next;
    data.prev = current;
    if (current.next != null) current.next.prev = data;
    else tail = data;
    current.next = data;
    size++;
  }
  // g.
    void addBeforeValue(Object value, Node data) {
        Node current = findByValue(value);
        if (current == null) return;
        data.next = current;
        data.prev = current.prev;
        if (current.prev != null) current.prev.next = data;
        else head = data;
        current.prev = data;
        size++;
    }
    public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    list.addLast(new Node("A"));
    list.addLast(new Node("B"));
    list.addLast(new Node("D")); 

    list.addBeforeValue("D", new Node("C"));
    System.out.println("Tambah C sebelum D: "); list.print();
    }
  } 
