package ru.geekbrains.HomeWorkLesson7;

public interface Competition {

    static boolean runJump(Obstacle obstacle, Competition competition) {
        if (competition instanceof Man) {
            if (obstacle instanceof Wall) {
                if (obstacle.parameter <= ((Man) competition).maxJump) {
                    System.out.println("Человек " + ((Man) competition).id + " перепрыгнул " + obstacle.parameter + " см");
                } else {
                    System.out.println("Человек " + ((Man) competition).id + " не справился с препятствием " + obstacle.parameter + " см и выбыл");
                    return false;
                }
            } else if (obstacle.parameter <= ((Man) competition).maxRun) {
                System.out.println("Человек " + ((Man) competition).id + " пробежал " + obstacle.parameter + " м");
            } else {
                System.out.println("Человек " + ((Man) competition).id + " не справился с препятствием " + obstacle.parameter + " м и выбыл");
                return false;
            }
        }
        if (competition instanceof Cat) {
            if (obstacle instanceof Wall) {
                if (obstacle.parameter <= ((Cat) competition).maxJump) {
                    System.out.println("Кот " + ((Cat) competition).id + " перепрыгнул " + obstacle.parameter + " см");
                } else {
                    System.out.println("Кот " + ((Cat) competition).id + " не справился с препятствием " + obstacle.parameter + " см и выбыл");
                    return false;
                }
            } else if (obstacle.parameter <= ((Cat) competition).maxRun) {
                System.out.println("Кот " + ((Cat) competition).id + " пробежал " + obstacle.parameter + " м");
            } else {
                System.out.println("Кот " + ((Cat) competition).id + " не справился с препятствием " + obstacle.parameter + " м и выбыл");
                return false;
            }
        }
        if (competition instanceof Android) {
            if (obstacle instanceof Wall) {
                if (obstacle.parameter <= ((Android) competition).maxJump) {
                    System.out.println("Робот " + ((Android) competition).id + " перепрыгнул " + obstacle.parameter + " см");
                } else {
                    System.out.println("Робот " + ((Android) competition).id + " не справился с препятствием " + obstacle.parameter + " см и выбыл");
                    return false;
                }
            } else if (obstacle.parameter <= ((Android) competition).maxRun) {
                System.out.println("Робот " + ((Android) competition).id + " пробежал " + obstacle.parameter + " м");
            } else {
                System.out.println("Робот " + ((Android) competition).id + " не справился с препятствием " + obstacle.parameter + " м и выбыл");
                return false;
            }
        }
        return true;
    }
}