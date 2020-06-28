package lesson.вложенные_классы.inner_class.linkedList;

public class MyLinkedList<T> {
    Node head;
//К Node За пределами класcа обращаться не нужно, поэтому делаем его private
    public T get(int index){
        Node node = new Node();

        return null;
    }
    private class Node<T>{
        T val;
        Node<T> nextNode;
    }
}
