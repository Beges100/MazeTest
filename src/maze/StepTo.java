package maze;

public class StepTo {
    public String[][] maze;
    int entry;
    public String wall = "\u2588\u2588 ";
    public String pass = "   ";

    public StepTo(String[][] maze, int entry) {
        this.maze = new String[10][10];
        this.entry = entry;
    }

    public void setEntry() {
        Maze.maze[entry][0] = pass;
    }

    public void stepUp() {

    }

    public void stepDown() {

    }

    public void stepLeft() {

    }

    public void stepRight() {

    }
}
