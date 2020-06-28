package homework.genericTwoLinkedList;

public class Main {
    public static void main(String[] args) {
        genericTwoLinkedList<Tovar> tovarList = new genericTwoLinkedList<>();
        tovarList.add(new Tovar("Пылесос", 25));
        tovarList.add(new Tovar("Tv", 250));
        tovarList.add(new Tovar("MusicCenter", 150));
        tovarList.add(new Tovar("Ps4", 420));

        genericTwoLinkedList<Integer> intList = new genericTwoLinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        System.out.println(tovarList.contains(new Tovar("Пылесос",25)));
        System.out.println(intList.contains(40));

        intList.remove(3);
        tovarList.remove(3);



        for (int i = 0; i <tovarList.size ; i++) {
            System.out.println(tovarList.get(i));
        }

        for (int i = 0; i <intList.size ; i++) {
            System.out.println(intList.get(i));
        }
    }
}
