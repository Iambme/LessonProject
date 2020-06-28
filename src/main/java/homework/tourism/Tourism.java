package homework.tourism;

public class Tourism {
    TourType tourType;

    public Tourism(TourType tourType) {
        this.tourType = tourType;
    }

    public void startTour(){
        this.tourType.consume();
    }
}
