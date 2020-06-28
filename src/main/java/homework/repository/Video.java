package homework.repository;

public class Video extends Data implements Comparable<Video>{
    private String name;
    private int duration;
    private String genre;

    public Video(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Video o) {
        return name.compareTo(o.name);
    }

    @Override
    public Data clone() throws CloneNotSupportedException {
        return new Video(name,duration,genre);
    }
}
