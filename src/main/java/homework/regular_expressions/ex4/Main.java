package homework.regular_expressions.ex4;

public class Main {
    public static void main(String[] args) {
        try (Service service = new Service()) {
            service.go();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
