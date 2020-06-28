package homework.repository;

import homework.Phone.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        DataRepository<Video> videoDataRepository = new DataRepository<>();
        DataRepository<Photo> photoDataRepository = new DataRepository<>();

        videoDataRepository.add(new Video("Lord of the Rings", 180, "Fantasy"));
        videoDataRepository.add(new Video("Who am I", 120, "Action Movie"));
        videoDataRepository.add(new Video("Hanuka", 40, "Home Video"));
        videoDataRepository.add(new Video("WWII", 90, "Documentary"));

        photoDataRepository.add(new Photo("Lady in red", "JPG", 64));
        photoDataRepository.add(new Photo("Smoke", "BMP", 32));
        photoDataRepository.add(new Photo("Clouds", "GIF", 128));
        photoDataRepository.add(new Photo("Blood snow", "PNG", 256));

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Добавить видео в репозиторий видео");
            System.out.println("2.Добавить фото в репозиторий фото");
            System.out.println("3.Удалить фото из репозитория фото");
            System.out.println("4.Удалить видео из репозитория видео");
            System.out.println("5.Вывести все фото");
            System.out.println("6.Вывести все видео");
            System.out.println("7.Вывести все фото в порядке увеличения размера");
            System.out.println("8.Вывести все фото в алфавитном порядке по названию");
            System.out.println("9.Вывести все видео в порядке уменьшения длительности");
            System.out.println("10.Вывести все видео в алфавитном порядке по названию");
            System.out.println("11.Вывести все видео заданного жанра");
            System.out.println("12.Добавить клон фото в репозиторий");
            System.out.println("13.Отредактировать фото");
            System.out.println("14.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1:
                    System.out.println("Введите название видео");
                    String videoName = reader.readLine();
                    System.out.println("Введите длительность видео");
                    int duration = Integer.parseInt(reader.readLine());
                    System.out.println("Введите жанр видео");
                    String videoGenre = reader.readLine();
                    videoDataRepository.add(new Video(videoName, duration, videoGenre));
                    System.out.println("Видео добавлено");
                    break;
                case 2:
                    System.out.println("Введите название фото");
                    String photoName = reader.readLine();
                    System.out.println("Введите размер фото");
                    int photoSize = Integer.parseInt(reader.readLine());
                    System.out.println("Введите расширение фото");
                    String photoFormat = reader.readLine();
                    photoDataRepository.add(new Photo(photoName, photoFormat, photoSize));
                    System.out.println("Фото добавлено");
                    break;
                case 3:
                    System.out.println("Введите название фото");
                    String photoDeleteName = reader.readLine();
                    photoDataRepository.remove(new Photo(photoDeleteName, "", 0));
//                    for (int i = 0; i < photoDataRepository.arr.size(); i++) {
//                        if (photoDataRepository.arr.get(i).getName().equals(photoDeleteName)) {
//                            photoDataRepository.arr.remove(i);
//                            System.out.println("Фото удалено");
//                        }
//                    }
                    break;

                case 4:
                    System.out.println("Введите название видео");
                    String videoDeleteName = reader.readLine();
                    for (int i = 0; i < videoDataRepository.arr.size(); i++) {
                        if (videoDataRepository.arr.get(i).getName().equals(videoDeleteName)) {
                            videoDataRepository.arr.remove(i);
                            System.out.println("Видео удалено");
                        }
                    }
                    break;

                case 5:
                    System.out.println(photoDataRepository.arr);
                    break;
                case 6:
                    System.out.println(videoDataRepository.arr);
                    break;
                case 7:
                    Comparator<Photo> sortBySize = new Comparator<Photo>() {
                        @Override
                        public int compare(Photo o1, Photo o2) {
                            return Integer.compare(o1.getSize(), o2.getSize());
                        }
                    };
                    photoDataRepository.arr.sort(sortBySize);
                    System.out.println(photoDataRepository.arr);
                    break;
                case 8:
                    Collections.sort(photoDataRepository.arr);
                    System.out.println(photoDataRepository.arr);
                    break;
                case 9:
                    Comparator<Video> sortByDuration = new Comparator<Video>() {
                        @Override
                        public int compare(Video o1, Video o2) {
                            return Integer.compare(o2.getDuration(), o1.getDuration());
                        }
                    };
                    videoDataRepository.arr.sort(sortByDuration);
                    System.out.println(videoDataRepository.arr);

                    break;
                case 10:
                    Collections.sort(videoDataRepository.arr);
                    System.out.println(videoDataRepository.arr);
                    break;
                case 11:
                    System.out.println("Введите название жанра видео");
                    String videoGenreName = reader.readLine();
                    for (int i = 0; i < videoDataRepository.arr.size(); i++) {
                        if (videoDataRepository.arr.get(i).getGenre().equals(videoGenreName)) {
                            System.out.println(videoDataRepository.arr.get(i));
                        }
                    }

                    break;
                case 12:
                    System.out.println("Введите индекс фотографии для клонирования и добавления в репозиторий от 0 до " + (photoDataRepository.arr.size()-1));
                    int cloneIndex = Integer.parseInt(reader.readLine());
                    photoDataRepository.add(photoDataRepository.clone(cloneIndex));
                    System.out.println("Фото склонировано и добавлено");
                    break;
                case 13:
                    System.out.println("Введите индекс фотографии для редактирования названия от 0 до " + (photoDataRepository.arr.size()-1));
                    int editIndex = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое название фото");
                    String newPhotoName = reader.readLine();
                    photoDataRepository.arr.get(editIndex).setName(newPhotoName);
                    break;
                case 14:
                    isOver = true;
                    break;
            }
        }
    }
}
