package lab3;

import java.util.Scanner;

public class Task_8 {
    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void createHead(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            addFirst(values[i]);
        }
    }

    public void createTail(int[] values) {
        for (int i = 0; i < values.length; i++) {
            addLast(values[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void removeLast() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }
    public void createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент списка (для окончания ввода введите 0): ");
        int value = scanner.nextInt();
        if (value == 0) {
            return;
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            createHeadRec();
        }
    }
    public void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент списка (для окончания ввода введите 0): ");
        int value = scanner.nextInt();
        if (value == 0) {
            return;
        } else {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            createTailRec();
        }
    }
    public String toStringRec(Node current, StringBuilder sb) {
        if (current == null) {
            return sb.toString();
        }
        sb.append(current.value).append(" ");
        return toStringRec(current.next, sb);
    }

}