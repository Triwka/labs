package lab3;

public class Task_7 {
    public static void main(String[] args) {
        //Создание с хвоста
        Node tail = null;
        for (int i = 9; i >=0; i--) {
            tail = new Node(i,tail);
        }
        Node ref = tail;
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
        //Создание с головы
        Node head = null;
        Node hvost = null;
        for (int i = 0; i < 9; i++) {
            Node newNode = new Node(i,null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        ref = head;
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }

    static class Node {
        public int value;
        public Node next;
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
