package homework.genericTwoLinkedList;

public class Node <T> {
    T val;
    Node<T> linkToNextNode;
    Node<T> linkToPrevNode;

    public Node(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
