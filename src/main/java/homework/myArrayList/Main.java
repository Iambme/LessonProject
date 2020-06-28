package homework.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Раз");
        myArrayList.add("Два");
        myArrayList.add("Три");




        myArrayList.clear();

        for (String s: myArrayList
             ) {
            System.out.println(s);
        }


    }

    }

