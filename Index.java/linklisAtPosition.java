class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class linklisAtPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);

        System.out.println("Original List:");
        list.display();

        list.insertAtPosition(25, 2);

        System.out.println("After Inserting 25 at Position 2:");
        list.display();
    }
}