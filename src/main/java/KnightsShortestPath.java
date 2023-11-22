import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KnightsShortestPath {
    public static int knight(String start, String finish) {
        String[] startSplit = start.split("");
        if (Integer.parseInt(startSplit[1]) < 1 || Integer.parseInt(startSplit[1]) > 8) {
            throw new IllegalArgumentException("Given square is not within the board!");
        }
        // Add same check for letters and end square
        String[] endSplit = finish.split("");
        return moveOptions(new ArrayList<>(), startSplit, endSplit, 0);
    }
    public static int moveOptions(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        // Pass the current lowest move total into this function, so you can break out if numMoves reaches this

        if (Arrays.equals(currentSquare, endSquare)) {
            return numMoves;
        }

        String currentSquareConcat = String.join("", currentSquare);
        for (String square: previousSquares) {
            if (currentSquareConcat.equals(square)) {
                return 0;
            }
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;

        count1 = move(previousSquares, currentSquare, endSquare, numMoves, 2, 1);
        count2 = move(previousSquares, currentSquare, endSquare, numMoves, 1, 2);
        count3 = move(previousSquares, currentSquare, endSquare, numMoves, -2, 1);
        count4 = move(previousSquares, currentSquare, endSquare, numMoves, -1, 2);
        count5 = move(previousSquares, currentSquare, endSquare, numMoves, 2, -1);
        count6 = move(previousSquares, currentSquare, endSquare, numMoves, 1, -2);
        count7 = move(previousSquares, currentSquare, endSquare, numMoves, -1, -2);
        count8 = move(previousSquares, currentSquare, endSquare, numMoves, -2, -1);

        int[] routes = new int[] { count1, count2, count3, count4, count5, count6, count7, count8 };

        return Arrays.stream(routes)
                .filter(count -> count > 0)
                .min()
                .orElse(0);
    }

    public static int move(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves, int numInc, int letInc) {
        String[] move = new String[] { changeLetter(currentSquare[0], letInc),
                String.valueOf (Integer.parseInt(currentSquare[1]) + numInc) };
        boolean squareIsValid = checkSquareIsValid(move);
        if (!squareIsValid) {
            return 0;
        }
        List<String> previousSquaresCopy = new ArrayList<>(previousSquares);
        previousSquaresCopy.add(String.join("", currentSquare));
        return moveOptions(previousSquaresCopy, move, endSquare, numMoves + 1);
    }

    private static String changeLetter(String currentValue, int increment) {
        return String.valueOf((char) (currentValue.toCharArray()[0] + increment));
    }

    private static boolean checkSquareIsValid(String[] move) {
        if (Integer.parseInt(move[1]) < 1 || Integer.parseInt(move[1]) > 8) {
            return false;
        }
        if (move[0].toCharArray()[0] < 97 || move[0].toCharArray()[0] > 104) {
            return false;
        }
        return true;
    }
}