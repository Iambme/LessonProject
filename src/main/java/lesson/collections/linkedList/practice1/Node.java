package lesson.collections.linkedList.practice1;

import java.util.ArrayList;

public class Node {
    int val;
    Node nextNode;

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
