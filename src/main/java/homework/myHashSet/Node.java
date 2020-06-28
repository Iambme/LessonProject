package homework.myHashSet;

import java.util.LinkedList;

public class Node<T> {
   private LinkedList<T> linkedList;

    public LinkedList<T> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }
}
