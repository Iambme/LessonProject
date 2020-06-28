package lesson.collections.linkedList.ex1;

public class Main {
    public static void main(String[] args) {
        //готовый лист из коробки
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(10);
//        linkedList.add(20);
//        linkedList.add(30);
//        linkedList.add(40);
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }


        MyOneLinkedList myOneLinkedList = new MyOneLinkedList();
        myOneLinkedList.add(10);
        myOneLinkedList.add(20);
        myOneLinkedList.add(30);
        myOneLinkedList.add(40);

//        System.out.println(myLinkedList.head);
//        System.out.println(myLinkedList.head.linkToNextNode);
//        System.out.println(myLinkedList.head.linkToNextNode.linkToNextNode);
//        System.out.println(myLinkedList.head.linkToNextNode.linkToNextNode.linkToNextNode);

        //оптимизируем
//        Node currentNode = myLinkedList.head;
//        System.out.println(currentNode);
//        currentNode = currentNode.linkToNextNode;
//        System.out.println(currentNode);
//        currentNode = currentNode.linkToNextNode;
//        System.out.println(currentNode);
//        currentNode = currentNode.linkToNextNode;
//        System.out.println(currentNode);
//        currentNode = currentNode.linkToNextNode;
//        System.out.println(currentNode);

        //оформим в цикл
//        Node currentNode = myLinkedList.head;
//        while(currentNode!=null){
//            System.out.println(currentNode);
//            currentNode = currentNode.linkToNextNode;
//        }

        //через метод
        myOneLinkedList.print();

        //System.out.println(myLinkedList.get(2));

        for (int i = 0; i < myOneLinkedList.size; i++) {
            System.out.println(myOneLinkedList.get(i));
        }

        //Вывести числа от 1 до 3
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i!=3);

    }
}
