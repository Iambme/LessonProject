package lesson.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    Node root; //корень (вершина) дерева

    public void add(int val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
        }
        else{
            addRecurs(root, newNode);
        }
    }

    private void addRecurs(Node currentNode, Node newNode){
        if(newNode.val >= currentNode.val){
            if(currentNode.rightNode==null){ //если правый потомок текущей вершины свободен
                currentNode.rightNode = newNode; //Вставляем новый узел в правый потомок
            }else{
                addRecurs(currentNode.rightNode, newNode);
            }
        }else{
            if(currentNode.leftNode==null){
                currentNode.leftNode = newNode;
            }else{
                addRecurs(currentNode.leftNode, newNode);
            }
        }
    }

    private Queue<Node> queue = new ArrayDeque();
    public void printWidth(){
        if(root==null){
            return;
        }
        queue.add(root);
        while(queue.size()>0){
            Node node =queue.poll();
            System.out.println(node);
            if(node.leftNode!=null){
                queue.add(node.leftNode);
            }

            if(node.rightNode!=null){
                queue.add(node.rightNode);
            }


        }
    }




    public void printDepth(){
        if(root!=null) {
            printDepthRec(root);
        }
    }

    private void printDepthRec(Node currentNode){
        System.out.println(currentNode.val);
        if(currentNode.leftNode!=null){
            printDepthRec(currentNode.leftNode);
        }
        if(currentNode.rightNode!=null){
            printDepthRec(currentNode.rightNode);
        }
    }

}
