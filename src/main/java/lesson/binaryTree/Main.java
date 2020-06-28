package lesson.binaryTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Бинарное дерево - структура хранения данных
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(10);
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(14);
        binaryTree.add(4);
        binaryTree.add(7);
        binaryTree.add(13);

        binaryTree.printDepth();

//        int[] arr = {1,2,3,4};
//        Arrays.binarySearch(arr, 2);

    }
}
