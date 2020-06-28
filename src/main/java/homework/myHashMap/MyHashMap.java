package homework.myHashMap;

import java.util.LinkedList;
import java.util.List;

public class MyHashMap <K,V>{
    private Node<K,V>[] table = new Node[10];
    private int size;
    private int getHash(int hash){
        return Math.abs(hash)%table.length;
    }

    public void put(K key, V value){
        Node<K, V> newNode = new Node(key, value);
        int hash = getHash(key.hashCode());

        if(table[hash]==null){
            table[hash] = newNode;
            size++;
        }else{
            Node<K,V> currentNode = table[hash];
            Node<K,V> prevNode=null;

            boolean isCollision = false;
            while(currentNode!=null){
                if(currentNode.getKey().equals(newNode.getKey())){
                    currentNode.setValue(newNode.getValue());
                    isCollision = true;
                }
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }

            if(!isCollision){
                prevNode.setNext(newNode);
                size++;
            }
        }
    }


    public V get(K key){
        int hash = getHash(key.hashCode());
        if(table[hash]==null){
            return null;
        }


        Node<K,V> currentNode = table[hash];
        while(currentNode!=null){
            if(currentNode.getKey().equals(key)){
                return currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }


    public List<K> keySet(){
        List<K> list = new LinkedList<>();
        for (int i = 0; i < table.length; i++) {
            if(table[i]!=null) {
                Node<K, V> currentNode = table[i];
                while(currentNode!=null){
                    list.add(currentNode.getKey());
                    currentNode = currentNode.getNext();
                }
            }
        }
        return list;
    }
    public List<V> valueSet(){
        List<V> list = new LinkedList<>();
        for (int i = 0; i < table.length; i++) {
            if(table[i]!=null) {
                Node<K, V> currentNode = table[i];
                while(currentNode!=null){
                    list.add(currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
        return list;
    }

    public List<Node<K,V>> entrySet(){
        List<Node<K,V>> list = new LinkedList<>();
        for (int i = 0; i < table.length; i++) {
            if(table[i]!=null) {
                Node<K, V> currentNode = table[i];
                while(currentNode!=null){
                    list.add(currentNode);
                    currentNode = currentNode.getNext();
                }
            }
        }
        return list;
    }
    public int size(){
        return size;
    }
    public boolean containsKey(K key){
        return keySet().contains(key);
    }
    public boolean containsValue(V value){

        return valueSet().contains(value);
    }
    public void remove(K key){
        int hash = getHash(key.hashCode());
        if(table[hash]==null)
            return;
        Node<K,V> currentNode = table[hash];
        Node<K,V> head = table[hash];
        Node<K,V> prevNode = null;
        while (currentNode!=null){
            if(currentNode.getKey().equals(key)){
                if(currentNode == head){
                    table[hash] = currentNode.getNext();
                }else{
                    prevNode.setNext(currentNode.getNext());
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
}
