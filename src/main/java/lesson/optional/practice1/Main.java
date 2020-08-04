package lesson.optional.practice1;

public class Main {
    public static void main(String[] args) {
        /*
        Создать класс PostMail (почтовое отделение) с private полем List<Optional<Parcel>>.
        Создать класс Parcel (посылка) с полем Наименование посылки.

В классе PostMail создать методы:

addParcel(Parcel parcel) - добавляет посылку в список. Может принимать null.

makeSend - запускает рассылку посылок. Метод должен обрабатывать объекты класса Parcel на null.
Если объект посылки null, программа должна вывести на консоль "Пустая посылка".
Если объект не null, программа должна выводить текст "Посылка [наименование посылки] отправлена"
         */

        PostMail postMail = new PostMail();
        postMail.add(new Parcel("TV"));
        postMail.add(null);
        postMail.add(new Parcel("PS4"));
        postMail.send();
    }
}
