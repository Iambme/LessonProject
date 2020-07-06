package homework.annotation;

@SocialProfile
public class TwitterProfile {
    String name;
    int yearOfBirth;

    public TwitterProfile(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
