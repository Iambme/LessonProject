package lesson.collections.linkedList.ex1;

public class Node {
    int val;
    Node linkToNextNode;

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
