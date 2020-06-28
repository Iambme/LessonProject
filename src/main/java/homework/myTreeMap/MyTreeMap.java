package homework.myTreeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyTreeMap<K extends Comparable<K>, V> {
    private Entry<K, V> root;
    private int size;

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        if (root == null) {
            root = entry;
        } else {
            recPut(root, entry);
        }
        size++;
    }

    public int size() {
        return size;
    }

    private void recPut(Entry<K, V> currentNode, Entry<K, V> newNode) {
        if (newNode.key.compareTo(currentNode.key) > 0) {
            if (currentNode.right != null) {
                recPut(currentNode.right, newNode);
            } else {
                currentNode.right = newNode;
            }
        } else if (newNode.key.compareTo(currentNode.key) < 0) {
            if (currentNode.left != null) {
                recPut(currentNode.left, newNode);
            } else {
                currentNode.left = newNode;
            }
        } else {

            currentNode.value = newNode.value;
        }
    }

    public V get(K key) {
        if (root == null) {
            return null;
        }
        return getRec(root, key);
    }

    private V getRec(Entry<K, V> currentNode, K key) {
        if (currentNode.key.compareTo(key) == 0) {
            return currentNode.value;
        }
        if (key.compareTo(currentNode.key) > 0) {
            if (currentNode.right != null) {
                return getRec(currentNode.right, key);
            }
        } else {
            if (currentNode.left != null) {
                return getRec(currentNode.left, key);
            }
        }
        return null;

    }

    public List<K> keySet() {
        if (root == null) {
            return null;
        }
        List<K> keyList = new LinkedList<>();
        recKeySet(root, keyList);
        return keyList;
    }

    private void recKeySet(Entry<K, V> currentNode, List<K> keyList) {
        if (currentNode.left != null) {
            recKeySet(currentNode.left, keyList);
        }
        keyList.add(currentNode.key);
        if (currentNode.right != null) {
            recKeySet(currentNode.right, keyList);
        }
    }

    public List<V> values() {
        if (root == null) {
            return null;
        }
        List<V> vs = new LinkedList<>();
        recValues(root, vs);

        return vs;
    }

    private void recValues(Entry<K, V> currentNode, List<V> vs) {
        if (currentNode.left != null) {
            recValues(currentNode.left, vs);
        }
        vs.add(currentNode.value);
        if (currentNode.right != null) {
            recValues(currentNode.right, vs);
        }
    }

    public List<Entry<K, V>> entrySet() {
        if (root == null) {
            return null;
        }
        List<Entry<K, V>> entryList = new LinkedList<>();
        recEntry(root, entryList);

        return entryList;
    }

    private void recEntry(Entry<K, V> currentNode, List<Entry<K, V>> entryList) {
        if (currentNode.left != null) {
            recEntry(currentNode.left, entryList);
        }
        entryList.add(currentNode);
        if (currentNode.right != null) {
            recEntry(currentNode.right, entryList);
        }
    }

    public boolean containsValue(V val) {
        return values().contains(val);
    }

    public boolean containsKey(K key) {
        return containsNodeRecursive(root, key);
    }

    private boolean containsNodeRecursive(Entry<K, V> current, K key) {
        if (current == null) {
            return false;
        }
        if (key.equals(current.key)) {
            return true;
        }
        return key.compareTo(current.key) >= 0
                ? containsNodeRecursive(current.right, key)
                : containsNodeRecursive(current.left, key);
    }

    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> left;
        private Entry<K, V> right;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
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