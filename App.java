package Level2_Lesson1;

public class App {
    public static void main(String[] args) {
        RunJumpAble team[] = new RunJumpAble[3];
        team[0] = new Cat("Вася", 5, 200);
        team[1] = new Robot("Вертер", 3, 50);
        team[2] = new Human("Вова", 1, 400);

        Obstacle obstacleCourse[] = new Obstacle[2];
        obstacleCourse[0] = new Track(1, 100);
        obstacleCourse[1] = new Wall(2, 2);
        for (RunJumpAble sportsman : team) {
            for (Obstacle obstacle : obstacleCourse) {
                if (obstacle instanceof Track) {
                    sportsman.run();
                    if (sportsman.getMaxDistance() > ((Track) obstacle).getDistance()) {
                        obstacle.setOvercome(true);
                        obstacle.obstacleInfo();
                    } else {
                        obstacle.setOvercome(false);
                        obstacle.obstacleInfo();
                        break;
                    }
                    } else
                    if (obstacle instanceof Wall) {
                        sportsman.jump();
                        if (sportsman.getMaxHeight() > ((Wall) obstacle).getHeight()) {
                            obstacle.setOvercome(true);
                            obstacle.obstacleInfo();
                        } else {
                            obstacle.setOvercome(false);
                            obstacle.obstacleInfo();
                            break;
                        }

                    }
                }

            }


        }
    }
