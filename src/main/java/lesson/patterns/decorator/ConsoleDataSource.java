package lesson.patterns.decorator;


public class ConsoleDataSource implements DataSource {

    @Override
    public void write(String text) {
        System.out.printf("Данные %s записаны в консоль %n", text);
    }

    @Override
    public void read() {
        System.out.printf("Данные считаны из консоли %n");
    }
}
