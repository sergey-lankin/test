public class TicTacToe {
    String[][] field;
    String player;

    public TicTacToe() {
        newGame();
    }


    public String[][] getField() {
        return field;
    }

    public void newGame() {
        field = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
        player = "X";
    }

    public String makeMove(int x, int y) {
        x -= 1;
        y -= 1;
        String result = "";
        String currResult = this.checkGame();

        if (!currResult.equals("null")) {
            result = "Game was ended";
        }
        else {
            if (field[x][y].equals("-")) {
                if (player.equals("X")) {
                    field[x][y] = "X";
                    player = "0";
                } else {
                    field[x][y] = "0";
                    player = "X";
                }
                String newResult = this.checkGame();
                if (newResult.equals("X") | newResult.equals("0")) {
                    result = "Player " + newResult + " won";

                } else if (newResult.equals("D")) {
                    result =  "Draw";

                } else if (newResult.equals("null")) {
                    result =  "Move completed";

                }
                }
                else {
                result =  "Cell x, y is already occupied";
                }
        }
        return result;
    }

    public String checkGame() {
        for (int i = 0; i < 3; i++) {
            boolean isXWinner = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("0") || field[i][j].equals("-")) {
                    isXWinner = false;
                }
            }
            if (isXWinner) {
                return "X";
            }
        }

        for (int i = 0; i < 3; i++) {
            boolean is0Winner = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("X") || field[i][j].equals("-")) {
                    is0Winner = false;
                }
            }
            if (is0Winner) {
                return "0";
            }
        }

        for (int i = 0; i < 3; i++) {
            boolean isXWinner = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("0") || field[j][i].equals("-")) {
                    isXWinner = false;
                }
            }
            if (isXWinner) {
                return "X";
            }
        }

        for (int i = 0; i < 3; i++) {
            boolean is0Winner = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("X") || field[j][i].equals("-")) {
                    is0Winner = false;
                }
            }
            if (is0Winner) {
                return "0";
            }
        }
        int diag10 = 0;
        int diag1X = 0;
        int diag20 = 0;
        int diag2X = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals("0")) {
                diag10++;
            }
            else if (field[i][i].equals("X")) {
                diag1X++;
            }

            if (field[i][2 - i].equals("0")) {
                diag20++;
            }
            else if (field[i][2 - i].equals("X")) {
                diag2X++;
            }
        }

        if (diag10 == 3 || diag20 == 3) {
            return "0";
        }
        else if (diag1X == 3 || diag2X == 3) {
            return "X";
        }
        else {
            int z = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field[i][j].equals("-")) {
                        z++;
                    }
                }
            }
            if (z == 0) {
                return "D";
            } else {
                return "null";
            }
        }
    //return checkResult;
    }
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        System.out.println(board.player);
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(1, 1));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
//Выводим поле в консоль, используя метод getField();
    }

}
