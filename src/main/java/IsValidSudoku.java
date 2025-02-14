import java.util.HashMap;

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
            HashMap<Character, Character> valueMap = new HashMap<>();
            for (int i = 0; i < row.length; i++) {
                if (row[i] != '.') {
                    if (valueMap.containsKey(row[i])) {
                        return false;
                    }
                    valueMap.put(row[i], row[i]);
                }
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashMap<Character, Character> valueMap = new HashMap<>();
            for (char[] row: board) {
                if (row[i] != '.') {
                    if (valueMap.containsKey(row[i])) {
                        return false;
                    }
                    valueMap.put(row[i], row[i]);
                }
            }
        }
        return true;
    }
}
