package maze;

import java.util.Random;

public class Maze {
    public static String[][] maze;
    public static String wall = "\u2588\u2588 ";
    public static String pass = "   ";
    int countStep = 0;
    public static int step = 0;
    int entryCoordinates = entry();

    StepTo stepTo = new StepTo(maze, entryCoordinates);

    //???????????
    public Maze(int size) {
        this.maze = new String[size][size];
    }

    //????????? ??????????
    public int entry() {
        Random randomCell = new Random();
        int upper = 8;
        int lower = 1;
        return randomCell.nextInt(upper - lower + 1) + lower;
    }

    //???????? ???? ???????????? ???????
    public void generateMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = wall;
            }
        }
        stepTo.setEntry();
    }

    // ????? ????
    public void showMaze() {
        for (int i = 0; i < maze.length; i++) {
            System.out.println();
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]);
            }
        }
    }
}
