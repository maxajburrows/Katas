import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> solutions = new ArrayList<>();

        // Loop over all permutations
        for (int i=0; i < Math.pow(n, 2); i++) {
            // Build Board
            ArrayList<int[]> board = buildBoard(n);


            // Add Queen to Board
            ArrayList<int[]> updatedBoard = addFirstQueenToBoard(i, n, board);



            // Translate into string
        }

        return solutions;
    }

    private ArrayList<int[]> addFirstQueenToBoard(int i, int n, ArrayList<int[]> board) {
        int queensRemaining = n;

        int rowFirstQueen = i+1/n;
        int columnFirstQueen = i-rowFirstQueen*n;

        board.get(rowFirstQueen)[columnFirstQueen] = 1;
        queensRemaining--;

        if (queensRemaining == 0) {
            return board;
        }

        // Work out blocked square
        ArrayList<int[]> boardBlockedSquare = addBlockedSquares(rowFirstQueen, columnFirstQueen, board);

        // Start adding other queens
        for (int j=0; j < queensRemaining; j++) {
            // Maybe return new queen position - would probably work better
            ArrayList<int[]> boardWithNewQueen = addQueenToBoard(n, boardBlockedSquare);  // Maybe return new queen position - would probably work better
            if (boardWithNewQueen == null) {
                return null;
            }
        }




    }

    private ArrayList<int[]> addQueenToBoard(int n, ArrayList<int[]> board) {
        for (int i=0; i < n; i++) {
            int[] boardRow = board.get(i);
            for (int j=0; j < boardRow.length; j++) {
                if (boardRow[j] == 0) {
                    board.get(i)[j] = 1;
                    return board;
                }
            }
        }
        return null;

    }

    private ArrayList<int[]> addBlockedSquares(int rowQueen, int columnQueen, ArrayList<int[]> board) {
        int[] rowWithQueen = board.get(rowQueen);
        for (int i=0; i < rowWithQueen.length; i++) {
            if (i == columnQueen) {
                continue;
            }
            rowWithQueen[i] = 2;
        }
        for (int i=0; i < rowWithQueen.length; i++) {
            if (i == rowQueen) {
                continue;
            }
            board.get(i)[columnQueen] = 2;
        }
        return board;
    }

    private static ArrayList<int[]> buildBoard(int n) {
        ArrayList<int[]> board = new ArrayList<>();
        int[] row = new int[n];
        for (int i = 0; i < n; i++) {
            board.add(row);
        }
        return board;
    }
}
