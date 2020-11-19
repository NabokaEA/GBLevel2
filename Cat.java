package Level2_Lesson1;

public class Cat implements RunJumpAble{


    public Cat(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    private String name;

    public int getMaxHeight() {
        return maxHeight;
    }

    private int maxHeight;

    public int getMaxDistance() {
        return maxDistance;
    }

    private int maxDistance;



    public void jump() {
        System.out.println(name+" прыгнул на "+maxHeight+"М в высоту ");
    }

    public void run() {
        System.out.println(name+" пробежал "+maxDistance+"М в длину ");
    }
}
