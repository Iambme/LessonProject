package lesson.hash_tables.ex2;

import java.util.LinkedList;
import java.util.Objects;

public class Main {
    static LinkedList<String>[] hashTable = new LinkedList[10];
    public static void main(String[] args) {
        //Создать хэш табилцу, хранящую любые строки
        //когда два разных значения имеют одинаковый хэш код, такие случаи называются коллизиями
        //В случае коллизий мы должны сохранять все значения, поэтому каждый элемент хэш таблицы должен быть
        //список LinkedList


        add("hello");
        add("java1");
        add("world");
        add("world1");
        add("world123");
        add("world java");
        add("world hello");
        add("world");
        add("world");
        add("java hello world");
        add("123 world 345345");




        for (int i = 0; i < hashTable.length; i++) {


            if(hashTable[i]!=null){
                for(String val : hashTable[i]){
                    System.out.println(i+" "+val);
                }
            }else{
                System.out.println(i+" "+hashTable[i]);
            }
        }
    }

    public static void add(String val){
        int hashCode = hashFunction(val);
        //проверяем, есть ли в хэш таблице значение под данным хэш кодом
        if(hashTable[hashCode]==null){
            //если нет, то следовательно, он еще ни разу не был добавлен(нет дубликатов) и можно смело добавлять
            hashTable[hashCode] = new LinkedList<>();
            hashTable[hashCode].add(val);
        }else{
            //если под кодом уже есть объект списка, то проверяем, что содержится ли уже в этом списке это значение
            if(!hashTable[hashCode].contains(val)){
                //если нет, то добавляем его в списк
                hashTable[hashCode].add(val);
            }
        }

    }

    //хэш функция
    public static int hashFunction(String val){
        int first = val.charAt(0);
        int last = val.charAt(val.length()-1);
        //return (val.length()*(first*31+last))%hashTable.length;
        return Objects.hash(val.length(), first, last) % hashTable.length;
    }

}
