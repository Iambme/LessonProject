package lesson.вложенные_классы.inner_class;

public class Car {
    public String name;

    int x;
    public class Engine{
        private int engineVolume;

        public int getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(int engineVolume) {
            this.engineVolume = engineVolume;
        }
    }
}
