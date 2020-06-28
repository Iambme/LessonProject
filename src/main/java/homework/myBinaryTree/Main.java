package homework.myBinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();

        integerBinaryTree.add(8);
        integerBinaryTree.add(3);
        integerBinaryTree.add(10);
        integerBinaryTree.add(1);
        integerBinaryTree.add(6);
        integerBinaryTree.add(14);
        integerBinaryTree.add(4);
        integerBinaryTree.add(7);
        integerBinaryTree.add(13);

        integerBinaryTree.printDepth();

        BinaryTree<Tovar> tovarBinaryTree = new BinaryTree<>();
        tovarBinaryTree.add(new Tovar("Tovar8",8));
        tovarBinaryTree.add(new Tovar("Tovar3",3));
        tovarBinaryTree.add(new Tovar("Tovar10",10));
        tovarBinaryTree.add(new Tovar("Tovar1",1));
        tovarBinaryTree.add(new Tovar("Tovar6",6));
        tovarBinaryTree.add(new Tovar("Tovar14",14));
        tovarBinaryTree.add(new Tovar("Tovar4",4));
        tovarBinaryTree.add(new Tovar("Tovar7",7));
        tovarBinaryTree.add(new Tovar("Tovar13",13));

        tovarBinaryTree.printDepth();

        System.out.println(integerBinaryTree.containsNode(13));
    }
}
