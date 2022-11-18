package CollectionFrameWork.Queue;

import CollectionFrameWork.My_Linked_List.Node;

public class MyQueue <E> {

    private Node <E> head, rear;

    public void enqueue(E e) {

        Node <E> toAdd = new Node<>(e);

        if(head == null) {
            head = rear = toAdd;
            return;
        }
        
        rear.next = toAdd;
        rear  = rear.next;
    }

    public E dequeue() {

        if(head == null) {
            return null;
        }
        Node<E> temp = head;
        head = head.next;

        return temp.data;
    }



    public static void main(String[] args) {
        
        MyQueue<Integer> queue = new MyQueue<Integer>();

        queue.enqueue(12);
        queue.enqueue(33);
        queue.enqueue(34);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
