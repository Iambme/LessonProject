package homework.myBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T > root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void add(T val){
        Node<T> newNode = new Node<T>(val);
        if(root == null){
            root = newNode;
        }
        else{
            addRecurs(root, newNode);
        }
    }

    private void addRecurs(Node<T> currentNode, Node<T> newNode){
        if(newNode.getVal().compareTo(currentNode.getVal()) > 0){
            if(currentNode.getRightNode()==null){
                currentNode.setRightNode(newNode);
            }else{
                addRecurs(currentNode.getRightNode(), newNode);
            }
        }else if(newNode.getVal().compareTo(currentNode.getVal()) < 0){
            if(currentNode.getLeftNode()==null){
                currentNode.setLeftNode(newNode);
            }else{
                addRecurs(currentNode.getLeftNode(), newNode);
            }
        }else{
            currentNode.setVal(newNode.getVal());
        }
    }
    public boolean containsNode(T value) {
        return containsNodeRecursive(root, value);
    }
    private boolean containsNodeRecursive(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        if (value == current.getVal()) {
            return true;
        }
        return value.compareTo(current.getVal())>=0
                ? containsNodeRecursive(current.getRightNode(), value)
                : containsNodeRecursive(current.getLeftNode(), value);
    }

    public void printDepth(){
        if(root!=null) {
            printDepthRec(root);
        }
    }

    private void printDepthRec(Node<T> currentNode){
        System.out.println(currentNode.getVal());
        if(currentNode.getLeftNode()!=null){
            printDepthRec(currentNode.getLeftNode());
        }
        if(currentNode.getRightNode()!=null){
            printDepthRec(currentNode.getRightNode());
        }
//        Queue<Node<T>> queue=new LinkedList<> ();
//        do{
//
//            if (currentNode.getLeftNode()!=null) queue.add(currentNode.getLeftNode());
//            if (currentNode.getRightNode()!=null) queue.add(currentNode.getRightNode());
//            if (!queue.isEmpty()) System.out.println(currentNode = queue.poll());
//        }while (!queue.isEmpty());

//        Queue<Node<T>> queue = new LinkedList<>();
//        queue.add(currentNode);
//        while (!queue.isEmpty()) {
//            currentNode = queue.poll();
//            while (currentNode.getLeftNode() != null) {
//
//                currentNode = currentNode.getLeftNode();
//                queue.add(currentNode);
//                System.out.println(currentNode.getVal());
//            }
//            while (currentNode.getRightNode() != null) {
//                currentNode = currentNode.getRightNode();
//
//                System.out.println(currentNode.getVal());
//            }
//        }



   }
}
