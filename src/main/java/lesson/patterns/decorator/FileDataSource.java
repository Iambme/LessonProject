package lesson.patterns.decorator;

public class FileDataSource implements DataSource{
    String filePath;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String text) {
        System.out.printf("Данные %s записаны в файл %s%n", text, filePath);
    }

    @Override
    public void read() {
        System.out.printf("Данные считаны из файал %s%n", filePath);
    }
}
