import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (!checkRows(board)) {
            return false;
        }
        if (!checkColumns(board)) {
            return false;
        }
        return true;
    }

    private static boolean checkRows(char[][] board) {
        for (char[] row : board) {
            HashSet<Character> valueMap = new HashSet<>();
            for (int i = 0; i < row.length; i++) {
                if (row[i] != '.') {
                    if (valueMap.contains(row[i])) {
                        return false;
                    }
                    valueMap.add(row[i]);
                }
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> valueMap = new HashSet<>();
            for (char[] row: board) {
                if (row[i] != '.') {
                    if (valueMap.contains(row[i])) {
                        return false;
                    }
                    valueMap.add(row[i]);
                }
            }
        }
        return true;
    }
}
