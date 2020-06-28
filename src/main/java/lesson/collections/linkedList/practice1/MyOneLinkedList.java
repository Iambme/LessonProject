package lesson.collections.linkedList.practice1;

public class MyOneLinkedList {

    Node head;
    Node last;
    private int size;

    public void add (int val){
        Node node = new Node(val);
        if(head == null){

            head = node;
            last = node;

        }
        else {
            last.nextNode = node;
            last = node;
        }


        size++;
    }

    public int get(int index){
        Node currentNode = head;

        if(index<0||index>size-1){
            throw new IndexOutOfBoundsException("Выход за пределы массива");
        }
        for (int i = 0; i <index ; i++) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.val;

    }

    public void remove (int index){
        if(index<0||index>size-1){
            throw new IndexOutOfBoundsException("Выход за пределы массива");
        }
        if (index==0){
            head=head.nextNode;
        }
        else{
            Node prevNode = head;
            for (int i = 0; i <index-1 ; i++) {
                prevNode = prevNode.nextNode;
            }
            if(index == size-1){
                last = prevNode;
                last.nextNode = null;
            }else{
                Node currentNode = head;
                for (int i = 0; i <index ; i++) {
                    currentNode = currentNode.nextNode;
                }
                prevNode.nextNode = currentNode.nextNode;
            }
        }

    }



}
