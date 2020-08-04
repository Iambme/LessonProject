package homework.concurrency.ex2;


public class Main {
/*
 Ниже приведен код программы, он работает не корректно: если его запустить, второй поток (MyThread2) не будет отслеживать изменение переменной i,
         таким val навсегда останется равной начальному значению и цикл не завершится. Нужно исправить эту ситуацию.
 */
   volatile static int i;

    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();
        th2.start();


    }

    /* Этот поток будет менять глобальную i от 0 до 10
            */
    static class MyThread1 extends Thread{
        @Override
        public void run() {
            while(i<10){
                System.out.println("i = "+i);
                i++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* Этот поток отслеживает изменения переменной i и в случае обнаружения выводит сообщение на консоль
     */
    static class MyThread2 extends Thread{
        @Override
        public void run() {
            int val = i;
            while(val<10){
                if(val!=i) {
                    val = i;
                    System.out.println("val = "+val);
                }
            }
        }
    }
}
