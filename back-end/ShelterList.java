import java.util.LinkedList;

public class ShelterList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int numElements;

    public ShelterList() {
        head = null;
        tail = null;
        numElements = 0;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        Node<T> temp = head;

        //empty
        if(temp == null) {
            head = node;
            //head.next = null;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
        numElements++;
    }


    public int length() {
        return numElements;
    }

    // Pre: 0 <= index < length()
    // Pre: length() != 0
    public T get(int index) {
        Node<T> target = head;
        
        if(target == null) {
            return null;
        }
        
        for (int i = 0; i < index; i++) {
          target = target.next;
        }

        return target.data;
    }

    //edge case done
    public void delete(Node<T> target) {
        Node<T> prevNode = target.prev;
        Node<T> nextNode = target.next;

        if (head == null || target == null) {
            // Pre: target != null
            return;
        }

        if (head == target) {
            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.prev = prevNode;
        }

        if (prevNode != null) {
            prevNode.next = nextNode;
        }

        numElements--;
    }



    public static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data) {
            this.data = data;
        }
    }
}
