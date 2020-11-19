package Level2_Lesson1;

public class Obstacle {
    public int getNumber() {
        return number;
    }

    public Obstacle(int number) {
        this.number = number;
    }



    public void setOvercome(boolean overcome) {
        isOvercome = overcome;
    }

    public boolean isOvercome() {
        return isOvercome;
    }

    private boolean isOvercome;
    private int number;

    public void obstacleInfo() {

        if (isOvercome){ System.out.printf("Препятствие номер " + number + " успешно преодолено\n\n");}
        else{System.out.printf("Препятствие номер " + number + " не преодолено\n\n");}
    }
}