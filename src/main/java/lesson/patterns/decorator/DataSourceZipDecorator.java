package lesson.patterns.decorator;

public class DataSourceZipDecorator  extends DataSourceDecorator{
    public DataSourceZipDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String text) {
        System.out.println("Данные сжаты");
        super.write(text);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Данные распакованы");
    }
}
