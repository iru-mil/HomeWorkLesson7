package ru.geekbrains.HomeWorkLesson7;

public class Main implements Competition {
    public static void main(String[] args) {

        Obstacle[] obstacle = new Obstacle[7];
        obstacle[0] = new Track(1, 60);
        obstacle[1] = new Wall(1, 50);
        obstacle[2] = new Track(2, 100);
        obstacle[3] = new Wall(2, 70);
        obstacle[4] = new Track(3, 500);
        obstacle[5] = new Wall(3, 90);
        obstacle[6] = new Track(4, 1000);

        Competition[] participant = new Competition[9];
        participant[0] = new Man(1, 1500, 100);
        participant[1] = new Man(2, 800, 100);
        participant[2] = new Man(3, 400, 60);
        participant[3] = new Cat(1, 150, 80);
        participant[4] = new Cat(2, 90, 60);
        participant[5] = new Cat(3, 120, 100);
        participant[6] = new Android(1, 2000, 150);
        participant[7] = new Android(2, 1500, 100);
        participant[8] = new Android(3, 900, 80);

        for (Competition competition : participant) {
            for (Obstacle value : obstacle) {
                if (!Competition.runJump(value, competition)) break;
            }
        }

    }
}
