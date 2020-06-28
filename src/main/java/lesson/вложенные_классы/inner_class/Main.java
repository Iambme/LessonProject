package lesson.вложенные_классы.inner_class;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.setEngineVolume(200);
        System.out.println(engine.getEngineVolume());

    }
}
