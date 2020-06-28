package lesson.map.ex3_MyTreeMap;

import java.util.LinkedList;
import java.util.List;

public class MyTreeMap<K extends Comparable<K>,V> {
    private Entry<K,V> root; //корень дерева

    public void put(K key, V value){
        Entry<K,V> entry = new Entry<>(key, value);
        if(root == null){
            root = entry;
        }else{
            recPut(root, entry);
        }
    }

    private void recPut(Entry<K,V> currentNode, Entry<K,V> newNode){
        if(newNode.getKey().compareTo(currentNode.getKey())>0){ //если ключ в новом узле больше ключа в текущем
            //переходим к правому потомку текущей веришны, если она не null
            if(currentNode.getRight()!=null){
                recPut(currentNode.getRight(), newNode);
            }else{
                currentNode.setRight(newNode);
            }
        }
        else if(newNode.getKey().compareTo(currentNode.getKey())<0){ //если ключ в новом узле меньше ключа в текущем
            //переходим к левому потомку текущей веришны, если она не null
            if(currentNode.getLeft()!=null){
                recPut(currentNode.getLeft(), newNode);
            }else{
                currentNode.setLeft(newNode);
            }
        }else{
            //если ключи равны, то перезаписываем старое значение в ключе на новое
            currentNode.setValue(newNode.getValue());
        }
    }

    public V get(K key){
        if (root == null){
            return null;
        }
        return getRec(root,key);
    }
    private V getRec(Entry<K,V> currentNode , K key){
        if(currentNode.getKey().compareTo(key)==0){
            return currentNode.getValue();
        }
        if(key.compareTo(currentNode.getKey())>0){
            if(currentNode.getRight()!=null){
                return getRec(currentNode.getRight(),key);
            }
        }
        else {
            if(currentNode.getLeft()!= null){
                return getRec(currentNode.getLeft(),key);
            }
        }
        return null;

    }

    public List<K> keySet(){
        if(root == null){
            return null;
        }
        List<K> keyList = new LinkedList<>();
        recKeySet(root, keyList);

        return keyList;
    }

    //обычный рекурсинвый обход в глубину
    private void recKeySet(Entry<K,V> currentNode, List<K> keyList){
        //проверяем, есть ли у текущей вершины левый потомок
        if(currentNode.getLeft()!=null){
            //если есть, то делаем его текущей вершиной
            recKeySet(currentNode.getLeft(), keyList);
        }
        //если дошли до левой крайней вершины(у которой нет левого потомка), то начинаем добавлять ключи в список
        keyList.add(currentNode.getKey());

        //проверяем, есть ли правый потомок
        if(currentNode.getRight()!=null){
            recKeySet(currentNode.getRight(), keyList);
        }
    }

    private class Entry<K,V> {
        private K key;
        private V value;
        private Entry<K,V> left;
        private Entry<K,V> right;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getLeft() {
            return left;
        }

        public void setLeft(Entry<K, V> left) {
            this.left = left;
        }

        public Entry<K, V> getRight() {
            return right;
        }

        public void setRight(Entry<K, V> right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

}
