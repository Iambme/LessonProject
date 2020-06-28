package lesson.вложенные_классы.nested_class.hashMap;

import java.util.List;

public class MyHashMap<K,V> {

    public List<Entry<K,V>> entrySet(){
        return null;
    }
    //Так как нам необходимо работать с классом Entry за пределами MyHashMap мы должны его сделать public,
    //а также static для возможности создания переменной типа Entry
    static int x;
    public static class Entry<K,V>{
        //так как класс public, его поля должны быть private
        private K key;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }
    }
}
