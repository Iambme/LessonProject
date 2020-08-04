package homework.streamAPI.ex5;

import java.util.*;

public class Main {
    /*
    1. Создать любым способом двумерный массив целых чисел, с помощью stream вывести на консоль все его элементы
(понадобится flatMap или flatMapToInt).
flatMap работает по принципу: если в параметр передать Stream<Stream<Integer>>, то на выходе будет Stream<Integer>
то есть он как бы разбивает сложное на более простое
flatMapToInt: если на вход передать Stream<Stream<Integer>>, на выходе получим IntStream

2. Создать класс Bank с полем в виде списка банковских вкладов, представленных классом Deposit.
Класс Deposit имеет поля срок вложения и процентная ставка.

В мейне создать массив банков, вывести с помощью одного stream процентные ставки всех вкладов,
а также найти самый выгодный вклад.
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);


        System.out.println("******");

        ArrayList<Bank> banks = new ArrayList<>();
        Bank bank1 = new Bank();
        bank1.getDeposits().add((new Deposit(12, 6.5)));
        bank1.getDeposits().add((new Deposit(18, 7)));
        bank1.getDeposits().add((new Deposit(16, 8.0)));

        Bank bank2 = new Bank();
        bank2.getDeposits().add((new Deposit(10, 5.5)));
        bank2.getDeposits().add((new Deposit(12, 8)));
        bank2.getDeposits().add((new Deposit(18, 8.0)));

        banks.add(bank2);
        banks.add(bank1);

        banks.stream()
                .map(Bank::getDeposits)
                .flatMap(Collection::stream)
                .forEach(x -> System.out.println(x.getPercent()));
        System.out.println("************");

        Optional<Deposit> op1 = banks.stream()
                .map(Bank::getDeposits)
                .flatMap(Collection::stream).min(new Comparator<Deposit>() {
                    @Override
                    public int compare(Deposit o1, Deposit o2) {
                        return (int) (o1.getPercent()-o2.getPercent());
                    }
                });
        op1.ifPresent(x -> System.out.println(x.getPercent()));

    }
}
