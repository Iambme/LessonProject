package lesson.binaryTree;

public class Node {
    int val;
    Node leftNode;
    Node rightNode;

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
