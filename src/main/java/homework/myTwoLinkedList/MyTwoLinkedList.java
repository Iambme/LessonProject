package homework.myTwoLinkedList;

public class MyTwoLinkedList {
    Node head;
    Node last;
    int size;


    public int getSize() {
        return size;
    }

    private boolean isIndexOut(int index) {
        return index < 0 || index > size - 1;
    }

    private Node getNodeByIndexFromHead(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentNode = currentNode.linkToNextNode;
            currentIndex++;
        }
        return currentNode;
    }

    private Node getNodeByIndexFromLast(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = last;
        int currentIndex = size - 1;
        while (currentIndex > index) {
            currentNode = currentNode.linkToPrevNode;
            currentIndex--;

        }
        return currentNode;
    }

    public void add(int val) {
        Node node = new Node(val);
        size++;
        if (head == null) {
            head = node;

        } else {
            last.linkToNextNode = node;
            node.linkToPrevNode = last;
        }
        last = node;
    }

    public void add(int index, int val) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        } else {
            Node node = new Node(val);
            Node currentNode;
            Node prevNode;

            if (index == 0) {
                head.linkToPrevNode = node;
                node.linkToNextNode = head;
                head = node;
            } else {


                if (size - index > index) {
                    currentNode = getNodeByIndexFromHead(index);
                    //prevNode = getNodeByIndexFromHead(index - 1);
                    prevNode = currentNode.linkToPrevNode;

                } else {
                    currentNode = getNodeByIndexFromLast(index);
                    //prevNode = getNodeByIndexFromLast(index - 1);
                    prevNode = currentNode.linkToPrevNode;

                }
                prevNode.linkToNextNode = node;
                currentNode.linkToPrevNode = node;
                node.linkToPrevNode = prevNode;
                node.linkToNextNode = currentNode;
                size++;
            }
        }

    }

    public int get(int index) {
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

    public void remove(int index) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        } else {

            if (index == 0) {
                head = head.linkToNextNode;
                head.linkToPrevNode = null;
            } else {
                Node prevNode = getNodeByIndexFromHead(index - 1);
                if (index == size - 1) {
                    prevNode.linkToNextNode = null;
                    last.linkToPrevNode = null;
                    last = prevNode;
                    //  last.linkToNextNode = null;  ???
                } else {
                    Node removableNode;
                    if (size - index > index) {
                        removableNode = getNodeByIndexFromHead(index);
                    } else {
                        removableNode = getNodeByIndexFromLast(index);
                    }
                    Node nextNode = removableNode.linkToNextNode;
                    prevNode.linkToNextNode = nextNode;
                    nextNode.linkToPrevNode = prevNode;
                }
            }
        }
        size--;

    }

    public void set(int index, int val) {
        if (isIndexOut(index)) {
            throw new IndexOutOfBoundsException();
        } else {
            Node node = new Node(val);
            Node nextNode;
            Node prevNode;
            Node currentNode;
            if (index == 0) {
                // 1 2 3
               nextNode = getNodeByIndexFromHead(1);
               nextNode.linkToPrevNode = node;
               head.linkToNextNode = null;
               head = node;
               node.linkToNextNode = nextNode;
            }
            else if(index == size-1){
                prevNode = getNodeByIndexFromLast(index-1);
                last.linkToPrevNode = null;
                prevNode.linkToNextNode = node;
                last = node;
                node.linkToPrevNode = prevNode;
            }
            else {

                if (size - index > index) {
                    currentNode = getNodeByIndexFromHead(index);
                    prevNode = getNodeByIndexFromHead(index-1);
                    nextNode = getNodeByIndexFromHead(index+1);
                } else {
                    currentNode = getNodeByIndexFromLast(index);
                    prevNode = getNodeByIndexFromLast(index-1);
                    nextNode = getNodeByIndexFromLast(index+1);
                }
                currentNode.linkToPrevNode = null;
                currentNode.linkToNextNode = null;
                nextNode.linkToPrevNode = node;
                prevNode.linkToNextNode = node;
                node.linkToPrevNode = prevNode;
                node.linkToNextNode = nextNode;

            }
        }
    }

    public boolean contains(int val){
        Node currentNode = head;
        int currentIndex = 0;
        while (currentIndex < size) {
            if(currentNode.val==val){
                return true;
            }
            currentNode = currentNode.linkToNextNode;
            currentIndex++;


        }
        return false;
    }
}
