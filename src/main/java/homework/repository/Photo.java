package homework.repository;

public class Photo extends Data implements Comparable<Photo>{
    private String name;
    private String format;
    private int size;

    public Photo(String name, String format, int size) {
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean equals(Object o){
        Photo p = (Photo)o;
        return p.name.equals(name);
    }


    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public Photo clone() throws CloneNotSupportedException {
        return new Photo(name, format, size);
    }

    @Override
    public int compareTo(Photo o) {
        return name.compareTo(o.name);
    }
}
