package homework.mystack;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(33);



        stack.addAll(arrayList);


        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }




    }
}
