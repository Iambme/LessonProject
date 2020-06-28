package homework.Phone;

public class Phone implements Comparable<Phone>{
    public String getName() {
        return name;
    }

    private String name;
    private int memory;
    private double camera;
    private double price;

    public Phone(String name, int memory, double camera, double price) {
        this.name = name;
        this.memory = memory;
        this.camera = camera;
        this.price = price;
    }

    public boolean equals(Object other) {
        Phone phone = (Phone)other;
        return this.camera == phone.camera && this.memory == phone.memory && this.name.equals(phone.name) && this.price == phone.price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                ", camera=" + camera +
                ", price=" + price +
                '}';
    }

    public int getMemory() {
        return memory;
    }

    public double getCamera() {
        return camera;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Phone o) {
        double compareQuantity = o.getPrice();
        double diff = price - compareQuantity;
        if(diff==0){
            return 0;
        }else if(diff<0){
            return -1;
        }
        return 1;

    }
}
