package homework.concurrency.ex9;


import homework.concurrency.ex9.service.Service;

public class Main {
    /*

        Есть N Writer, M Reader, K Updater
        Каждый Writer пишет 1 смс в чат в заданный интервал секунд в диапазоне [20,60). Емкость чата - 20 сообщений,
        если не помещается в чат, нужно сохранять в буфере.
        Каждый Reader читает 1 смс из чата в заданный интервал секунд в диапазоне [30,50)
        Каждый Updater редактирует случайное смс из часа раз в 40 секунд.
     */
    public static void main(String[] args) {

        //Атомарные операции
//        AtomicInteger atomicInteger = new AtomicInteger();
//        System.out.println(atomicInteger.get());
//        int val = atomicInteger.incrementAndGet();
//        System.out.println(val);

        Service service = new Service();
        service.startChat();

    }


}
