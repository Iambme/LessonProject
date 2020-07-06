package lesson.patterns.decorator;

public class DataSourceDecorator implements DataSource{
    DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String text) {
        dataSource.write(text);
    }

    @Override
    public void read() {
        dataSource.read();
    }
}
