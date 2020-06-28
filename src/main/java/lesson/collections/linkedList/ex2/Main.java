package lesson.collections.linkedList.ex2;

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


        MyTwoLinkedList myTwoLinkedList = new MyTwoLinkedList();
        myTwoLinkedList.add(10);
        myTwoLinkedList.add(20);
        myTwoLinkedList.add(30);
        myTwoLinkedList.add(40);
        myTwoLinkedList.add(50);
        myTwoLinkedList.add(60);
        myTwoLinkedList.add(70);


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
        myTwoLinkedList.print();

        //System.out.println(myLinkedList.get(2));

        for (int i = 0; i < myTwoLinkedList.size; i++) {
            System.out.println(myTwoLinkedList.get(i));
        }

        //Вывести числа от 1 до 3
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i!=3);

    }
}
