package lesson.optional.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostMail {
    private List<Optional<Parcel>> optionalList;

    public PostMail() {
        optionalList = new ArrayList<>();
    }

    public void add(Parcel parcel){
        Optional<Parcel> optionalParcel = Optional.ofNullable(parcel);

        optionalList.add(optionalParcel);
    }
    public void send(){
        optionalList.forEach(x-> x.ifPresentOrElse(i->System.out.println("посылка отправлена " + i),()->System.out.println("Посылка не найдена")));
    }
}
