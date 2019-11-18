package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] matrix) {
        this.board = matrix;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        for (int i = 0; i < 3; i++){
            row[i] = getBoard()[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++){
            column[i] = getBoard()[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if (getRow(rowIndex)[0] == getRow(rowIndex)[1] && getRow(rowIndex)[1] == getRow(rowIndex)[2]){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (getColumn(columnIndex)[0] == getColumn(columnIndex)[1] && getColumn(columnIndex)[1] == getColumn(columnIndex)[2]){
            return true;
        }
        return false;    }

    public String getWinner() {
        for (int i = 0; i < 3; i++){
            if (isRowHomogenous(i)) { return getRow(i)[0]; }
        }
        for (int j = 0; j < 3; j++){
            if (isColumnHomogeneous(j)) { return getColumn(j)[0]; }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {return board[1][1];}
        if (board[0][2] == board[1][1] && board[1][1] == board [2][0]){return board[1][1];}
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
