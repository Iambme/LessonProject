package homework.genericTwoLinkedList;

public class genericTwoLinkedList<T> {
    Node<T> head;
    Node<T> last;
    int size;


    public int getSize() {
        return size;
    }

    private boolean isIndexOut(int index) {
        return index < 0 || index > size - 1;
    }

    private Node<T> getNodeByIndexFromHead(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentNode = currentNode.linkToNextNode;
            currentIndex++;
        }
        return currentNode;
    }

    private Node<T> getNodeByIndexFromLast(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = last;
        int currentIndex = size - 1;
        while (currentIndex > index) {
            currentNode = currentNode.linkToPrevNode;
            currentIndex--;

        }
        return  currentNode;
    }

    public void add(T val) {
        Node<T> node = new Node<T>(val);
        size++;
        if (head == null) {
            head = node;

        } else {
            last.linkToNextNode = node;
            node.linkToPrevNode = last;
        }
        last = node;
    }

    public T get(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        } else {
            if (size - index > index) {
                return getNodeByIndexFromHead(index).val;
            } else {
                return getNodeByIndexFromLast(index).val;
            }

        }

    }

    public boolean contains(T val){
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentIndex < size) {
            if(currentNode.val.equals(val)){
                return true;
            }
            currentNode = currentNode.linkToNextNode;
            currentIndex++;


        }
        return false;
    }
    public void remove(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        } else {

            if (index == 0) {
                head = head.linkToNextNode;
                head.linkToPrevNode = null;
            } else {
                Node<T> prevNode = getNodeByIndexFromHead(index - 1);
                if (index == size - 1) {
                    prevNode.linkToNextNode = null;
                    last.linkToPrevNode = null;
                    last = prevNode;
                } else {
                    Node<T> removableNode;
                    if (size - index > index) {
                        removableNode = getNodeByIndexFromHead(index);
                    } else {
                        removableNode = getNodeByIndexFromLast(index);
                    }
                    Node<T> nextNode = removableNode.linkToNextNode;
                    prevNode.linkToNextNode = nextNode;
                    nextNode.linkToPrevNode = prevNode;
                }
            }
        }
                    size--;
    }

}
