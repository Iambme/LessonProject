package lesson.collections.linkedList.ex1;

public class MyOneLinkedList {
    Node head; //Голова
    Node last; //хвост списка
    int size;

    public int getSize(){
        return size;
    }
    public void add(int val){
        Node node = new Node(val);
        size++;
        if(head==null){ //если список пуст
            //делаем элемент гловой и хвостом
            head = node;
            last = node;
        }else{
            last.linkToNextNode = node; //связываем текущий хвост с новым узлом
            last = node; //делаем новый узел новым хвостом
            //1->2
            //last = 2
            //добвим 3
            //1->2->3
            //last = 3
        }
    }

    public int get(int index){
        if(isIndexOut(index)){
            throw new IndexOutOfBoundsException();
        }else{
            return getNodeByIndex(index).val;
        }

    }

    public void remove(int index){
        //1->2->3
        //удалим 2
        //1->3
        if(isIndexOut(index)){
            throw new IndexOutOfBoundsException();
        }else{

            if(index == 0){
                //удалить голову
                head = head.linkToNextNode;
            }else{
                Node prevNode = getNodeByIndex(index-1); //элемент перед хвостом
               if(index == size - 1){
                    //удаляем хвост
                    prevNode.linkToNextNode = null; //удаляем ссылку у пред элемента на текущий хвост
                    last = prevNode; //делаем хвостом сам предыдущий элемент

                }else {
                    //удаление промежуточного элемента
                    Node currentNode = getNodeByIndex(index);
                    prevNode.linkToNextNode = currentNode.linkToNextNode; //удаление
                }
            }
        }

    }

    public void printOperationCount(){
        System.out.println("one list oper count: "+operationCount);
    }
    private int operationCount=0;
    private Node getNodeByIndex(int index){
        if(isIndexOut(index)){
            throw new IndexOutOfBoundsException();
        }
        operationCount=0;
        Node currentNode = head;
        int currentIndex = 0;
        while(currentIndex<index){
            currentNode = currentNode.linkToNextNode;
            currentIndex++;
            operationCount++;
        }
        return currentNode;
    }

    private boolean isIndexOut(int index){
        return index<0 || index > size-1;
    }


    public void print(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode);
            currentNode = currentNode.linkToNextNode;
        }
    }


}
