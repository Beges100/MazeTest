package maze;

import java.util.Random;

public class StepTo {
    public int entry;
    String pass = "   ";

    public StepTo(int entry) {
        this.entry = entry;
    }

    public void setEntry() {
        Maze.maze[entry][Maze.stepHorizontal] = pass;
        Maze.stepVertical = entry;
        Maze.stepHorizontal++;
        Maze.maze[Maze.stepVertical][Maze.stepHorizontal] = pass;
        Maze.stepHorizontal++;
    }

    public void toMove() {
        Random randomStep = new Random();
         do {
            switch (randomStep.nextInt(4)) {
                case 0 -> stepForward();
                case 1 -> stepBack();
                case 2 -> stepUp();
                case 3 -> stepDown();
                default -> {
                }
            }
        } while (Maze.stepHorizontal < 9);
    }

    public void stepUp() {
        if (Maze.stepVertical > 1) {
            Maze.stepVertical--;
            Maze.maze[Maze.stepVertical][Maze.stepHorizontal] = pass;
        }

    }

    public void stepDown() {
        if (Maze.stepVertical < 9) {
            Maze.stepVertical++;
            Maze.maze[Maze.stepVertical][Maze.stepHorizontal] = pass;
        }
    }

    public void stepBack() {
        if (Maze.stepHorizontal > 1) {
            Maze.stepHorizontal--;
            Maze.maze[Maze.stepVertical][Maze.stepHorizontal] = pass;
        }

    }

    public void stepForward() {
        if (Maze.stepHorizontal < 9) {
            Maze.stepHorizontal++;
            Maze.maze[Maze.stepVertical][Maze.stepHorizontal] = pass;
        }

    }


}
