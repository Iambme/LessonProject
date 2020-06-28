package homework.tourism;

public class Main {


    public static void travelByCar(){
        System.out.println("Путешествие на машине");
    }
    public static void main(String[] args) {

        TourType tourType = new TourType() {
            @Override
            public void consume() {
                System.out.println("Путешествие на машине");
            }
        };
        TourType tourType1 = new TourType() {
            @Override
            public void consume() {
                System.out.println("Путешествие на самолете");
            }
        };
        TourType tourType2 = new TourType() {
            @Override
            public void consume() {
                System.out.println("Путешествие на поезде");
            }
        };


        TourType tourType3 = ()->travelByCar();
        Tourism tourism = new Tourism(tourType);
        tourism.startTour();

        Tourism tourism1 = new Tourism(tourType1);
        tourism1.startTour();

        Tourism tourism2 = new Tourism(tourType2);
        tourism2.startTour();
    }
}
