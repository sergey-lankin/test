import java.util.concurrent.ScheduledExecutorService;

public class SeaBoard {
    private String field[][];

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = ".";
            }
        }
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int column, String issue) {
        if ((line < 0 && line > 9) || (column < 0 && column > 9) || (!issue.equals("m")) || (!issue.equals("h")) || (!issue.equals("d"))) {
            System.out.println("Error - incorrect data");
        } else {
            switch (issue) {
                case "m":
                    field[line][column] = "#";
                case "h":
                    field[line][column] = "x";
                case "d":
                    field[line][column] = "x";
                    for (int i = 0; i < 10; i++) {

                    }

            }
        }
    }

    public String check(int line, int column) {
        String result = field[line][column];
        return result;
    }
}
