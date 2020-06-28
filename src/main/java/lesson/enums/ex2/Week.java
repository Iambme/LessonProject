package lesson.enums.ex2;

public enum Week {
    MON("Понедельник"), TUE("Вторник"), WEND, THU, FRI, SAN, SUN;

    private String dayName;

    Week(String dayName) {
        this.dayName = dayName;
    }

    Week() {
        this.dayName = this.name();
    }


    public String getDayName() {
        return dayName;
    }
}
