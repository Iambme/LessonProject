package lesson.anonimClasses.ex1;

public class Student {
    int[] arr = {2,5,2,4};

    public double getAverage(){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
