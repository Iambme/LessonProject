package lesson.hash_tables.ex1;

public class Main {
    static String[] hashTable = new String[10];
    public static void main(String[] args) {
        //Создать хэш табилцу, хранящую любые строки
        //когда два разных значения имеют одинаковый хэш код, такие случаи называются коллизиями
        //решение коллизий в пакете ex2


        String str1 = "hello";
        String str2 = "java";
        add(str1);
        add(str2);

        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i+" "+hashTable[i]);
        }
    }

    public static void add(String val){
        int hashCode = hashFunction(val);
        hashTable[hashCode] = val;
    }

    //хэш функция
    public static int hashFunction(String val){
        int first = val.charAt(0);
        int last = val.charAt(val.length()-1);
        return (val.length()*(first*31+last))%hashTable.length;
    }

}
