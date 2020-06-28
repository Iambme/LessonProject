package lesson.collections.linkedList.ex2;

public class MyTwoLinkedList {
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
            node.listToPrevNode = last; //у нового элемента предыдущим будет текущий хвост
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
            if(size-index>index){
                return getNodeByIndexFromHead(index).val;
            }else{
                return getNodeByIndexFromLast(index).val;
            }

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
                //1<->2<->3
                //head = 2
                head = head.linkToNextNode;
                head.listToPrevNode =null;
            }else{
                Node prevNode = getNodeByIndexFromHead(index-1); //элемент перед хвостом
               if(index == size - 1){
                    //удаляем хвост
                    prevNode.linkToNextNode = null; //удаляем ссылку у пред элемента на текущий хвост
                    last = prevNode;//делаем хвостом сам предыдущий элемент
                    last.linkToNextNode = null;
                }else {
                    //удаление промежуточного элемента
                   Node removableNode;
                   if(size-index>index) {
                       removableNode = getNodeByIndexFromHead(index);
                   }
                   else {
                       removableNode = getNodeByIndexFromLast(index);
                   }
                   Node nextNode = removableNode.linkToNextNode;
                   prevNode.linkToNextNode = nextNode; //удаление
                   nextNode.listToPrevNode = prevNode;
                }
            }
        }

    }

    private Node getNodeByIndexFromLast(int index){
        if(isIndexOut(index)){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = last;
        int currentIndex = size-1;
        operationCount=0;
        while(currentIndex>index){
            currentNode = currentNode.listToPrevNode;
            currentIndex--;
            operationCount++;
        }
        return currentNode;
    }
    public void printOperationCount(){
        System.out.println("two list oper count: "+operationCount);
    }
    private int operationCount=0;

    private Node getNodeByIndexFromHead(int index){
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

    private boolean isIndexOut(int index) {
        return index < 0 || index > size - 1;
    }




    public void print(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode);
            currentNode = currentNode.linkToNextNode;
        }
    }


}
