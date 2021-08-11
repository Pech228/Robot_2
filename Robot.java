package com.company.model;

public class Robot {
    private int x = 0;
    private int y = 0;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;

        }

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;

        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;

        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;

        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN) {
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;

        }

        if (this.direction == Direction.UP) {
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;

        }

        if (this.direction == Direction.LEFT) {
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;

        }

        if (this.direction == Direction.RIGHT) {
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;

        }
    }

    public void stepForward() {
        System.out.println("движение");
        if (direction == Direction.DOWN) {
            System.out.println("вниз");
            y--;
        }

        if (direction == Direction.UP) {
            System.out.println("вверх");
            y++;
        }

        if (direction == Direction.LEFT) {
            System.out.println("налево");
            x--;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("направо");
            x++;
        }
    }

}