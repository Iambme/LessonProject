package homework.myTwoLinkedList;

public class Main {
    public static void main(String[] args) {
        MyTwoLinkedList list = new MyTwoLinkedList();
        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3
        list.add(50);//4
        list.add(60);//5
        list.add(70);//6
        list.add(80);//7
        list.add(90);//8

 //       list.add(8,11);
       list.remove(1);

     //   list.set(2,333);

       System.out.println(list.contains(920));





        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }

    }
}
