package maze;

import java.util.Random;

public class Maze {
    public static String[][] maze;
    String wall = "\u2588\u2588 ";
    public static int stepHorizontal = 0;
    public static int stepVertical = 0;

    StepTo stepTo = new StepTo(entry());

    //???????????
    public Maze(int size) {
        maze = new String[size][size];
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
        stepTo.toMove();
        showMaze();
    }

    // ????? ????
    public void showMaze() {
        for (String[] strings : maze) {
            System.out.println();
            for (int j = 0; j < maze.length; j++) {
                System.out.print(strings[j]);
            }
        }
    }
}
