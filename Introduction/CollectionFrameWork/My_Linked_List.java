package CollectionFrameWork;

public class My_Linked_List<E> {

    Node<E> head; // first node

    public void add(E data) {
        Node<E> toAdd = new Node<E>(data);

        if (isEmpty()) {
            head = toAdd;
            return;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = toAdd;

    }

    void print() {
        Node<E> temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;

        }
        System.out.println("\b\b]");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    public E removeLast() throws Exception {
        Node<E> temp = head;

        if(temp == null) {
            throw new Exception("Cannot remove last element from linked list");
        }
        if(temp.next == null) {
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node<E> toRemove = temp.next;
        temp.next = null;

        return toRemove.data;
    }
    
    public E getLast() throws Exception {
        Node<E> temp = head;

        if(temp == null) {
            throw new Exception("Cannot peek last element from linked list");
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }
    
    public static void main(String[] args) {
        My_Linked_List<Integer> myLL = new My_Linked_List<>();
        
        for(int i = 0; i < 20; i++) {
            myLL.add(i);
        }
        myLL.print();
    }
}
