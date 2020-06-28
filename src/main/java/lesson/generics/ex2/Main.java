package lesson.generics.ex2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum+=list.get(i);
        }
        System.out.println(sum);




//        MyArrayList<Tovar> listTovar = new MyArrayList();
//        listTovar.add(new Tovar("tovar1", 100));
//        listTovar.add(new Tovar("tovar2", 200));
//        listTovar.add(new Tovar("tovar3", 300));
//
//        for (int i = 0; i < listTovar.size(); i++) {
//            System.out.println(listTovar.get(i));
//        }
    }
}
