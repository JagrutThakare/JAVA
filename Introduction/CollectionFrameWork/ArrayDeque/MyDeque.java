package CollectionFrameWork.ArrayDeque;

public class MyDeque <E> {
    Node<E> head, tail;
    public static class Node<E> {
        E data ;
        Node<E> next, prev;

        public Node(E data) {
            this.data = data;
            next = prev = null;
        }
    }

    void add_To_Head(E data) {

        Node<E> toAdd = new Node<E>(data);

        if(head == null) {
            head = tail = toAdd;
            return; 
        }
        head.next = toAdd;
        toAdd.prev = head;
        head = toAdd;

    }

    public E remove_Last() {
        if(head == null) {
            return null;
        }

        Node<E> toRemove = tail;
        tail = tail.next;
        tail.prev = null;

        if(tail == null) {
            head = null;
        }
        return toRemove.data;
    }


    public static void main(String[] args) {
        


    }
}
