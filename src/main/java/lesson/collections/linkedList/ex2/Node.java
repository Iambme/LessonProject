package lesson.collections.linkedList.ex2;

public class Node {
    int val;
    Node linkToNextNode;
    Node listToPrevNode;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
