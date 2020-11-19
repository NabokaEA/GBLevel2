package Level2_Lesson1;

public class Track extends Obstacle{
    public Track(int number, int distance) {
        super(number);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    private int distance;


}
