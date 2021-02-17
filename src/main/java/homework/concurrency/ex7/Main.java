package homework.concurrency.ex7;

public class Main {
    public static void main(String[] args) {
        /*
        Есть денежный счет, на который могут поступать денеждные средства одновременно из различных источников,
        а также списываться. Нужно сделать так, чтобы все операции были корректно выполенены,
        чтобы они не потерялись или не перезаписали друг друга.
Создать класс BankAccount с полем balance - текущий счет.
Создать три потока Producer,
каждый из которых будет зачислять денежные средства на баланс три раза с интервалом в 1 секунду.
         */

        BankAccount bankAccount = new BankAccount(1000);

        Thread thread1 = new Thread(() -> {

            try {
                int i = 0;
                while (i < 3) {
                    synchronized (bankAccount) {
                        bankAccount.addMoney(1000);
                        i++;
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {

            try {
                int i = 0;
                while (i < 3) {
                    synchronized (bankAccount) {
                        bankAccount.addMoney(100);
                        i++;
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {

            try {
                int i = 0;
                while (i < 3) {
                    synchronized (bankAccount) {
                        bankAccount.addMoney(10);
                        i++;
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
