package homework.annotation;

@SocialProfile
public class FacebookProfile {
    String name;
    int yearOfBirth;

    public FacebookProfile(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
