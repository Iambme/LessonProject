package homework.myHashSet;

import java.util.LinkedList;
import java.util.Objects;

public class MyHashSet<T> {
    private Node<T>[] arr = new Node[10];

    public void add(T val) {
        int hashCode = hashFunction(val);

        if (arr[hashCode] == null) {

            arr[hashCode] = new Node<>();
            arr[hashCode].setLinkedList( new LinkedList<>());
            arr[hashCode].getLinkedList().add(val);

        } else {

            if (!arr[hashCode].getLinkedList().contains(val)) {
                arr[hashCode].getLinkedList().add(val);
            }
        }

    }


    public int hashFunction(T val) {


        return Math.abs(val.hashCode()%10);
    }

    public void remove(int index) {
        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за границы массива");
        }
        if (arr[index] == null) {
            throw new NullPointerException("Элемент под указанным индексом отсутствуют");
        } else {
            arr[index].getLinkedList().clear();
        }
    }

    public void remove(T val) {
        int hashCode = hashFunction(val);
        if(arr[hashCode]!=null){
            arr[hashCode].getLinkedList().remove(val); //нужно, чтобы val переопределял equals

        }
//        for (Node<String> stringNode : arr) {
//            if (stringNode != null) {
//                if(stringNode.linkedList.contains(val)){
//                    stringNode.linkedList.remove(val);
//                }
////                for (int j = 0; j < stringNode.linkedList.size(); j++) {
////
////                    stringNode.linkedList.remove(val);
////
////
////                }
//            }
//        }
    }

    public boolean contains(T val) {
        int hashCode = hashFunction(val);
        if(arr[hashCode]!=null){
            return arr[hashCode].getLinkedList().contains(val);
        }
        return false;
//        for (Node<String> stringNode : arr) {
//            if (stringNode != null) {
//                for (int j = 0; j < stringNode.linkedList.size(); j++) {
//                    if (stringNode.linkedList.contains(val)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].getLinkedList().size(); j++) {
                    System.out.println(i + " " + arr[i].getLinkedList().get(j));
                }
            }
        }
    }

}
