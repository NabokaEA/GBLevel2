package Level2_Lesson1;

public class Wall extends Obstacle{
    public Wall(int number, int height) {
        super(number);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    private int height;


    }
