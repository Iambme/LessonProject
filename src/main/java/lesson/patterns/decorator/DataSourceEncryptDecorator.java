package lesson.patterns.decorator;

public class DataSourceEncryptDecorator  extends DataSourceDecorator{
    public DataSourceEncryptDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String text) {
        System.out.println("Данные зашифрованы");
        super.write(text);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Данные расшифрованы");
    }
}
