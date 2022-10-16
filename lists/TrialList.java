import java.util.LinkedList;

public class TrialList<T> {
  private Node<T> head;
  private Node<T> tail;
  private Node<T> curr;
  private int numElements;

  private static class Node<E> {
    E data;
    Node<E> next;
    Node<E> prev;

    Node(E data) {
      this.data = data;
    }
  }

  public ShelterList() {
    head = null;
    tail = null;
    curr = null;
    numElements = 0;
  }
  
  public Node<T> addLast(T data) {
    Node<T> node = new Node<>(data);
    //linked list empty
    if(head == null && tail == null) {
      head = node;
      curr = node;
      tail = node;
      
      curr.prev = null;
      curr.next = null;
    } else if (curr != null) {
      curr = node;
      tail = node;
      
      node.next = null;
      tail = node;
    }
    
  
    numElements++;
    return node;
  }
  
  
  public int length() {
    return numElements;
  }
  
  public T get(int index) {
    Node<T> target = tail;
    for (int i = numElements - 1; i > index; i--) {
      target = target.prev;
    }
    return target.data;
  }
  
  public void delete(Node<T> target) {
    Node<T> prevNode = target.prev;
    Node<T> nextNode = target.next;

    prevNode.next = nextNode;
    nextNode.prev = prevNode;
    numElements--;
  }

  public void insertAfter(Node<T> target, T data) {
    Node<T> nodeToInsert = new Node<>(data);
    Node<T> nextNode = target.next;

    target.next = nodeToInsert;
    nodeToInsert.prev = target;
    nodeToInsert.next = nextNode;
    nextNode.prev = nodeToInsert;
    numElements++;
  }
  
  public void insertBefore(Node<T> target, T data) {
    Node<T> nodeToInsert = new Node<>(data);
    Node<T> prevNode = target.prev;

    target.prev = nodeToInsert;
    nodeToInsert.next = target;
    nodeToInsert.prev = prevNode;
    prevNode.next = nodeToInsert;
    numElements++;
  }
  
}