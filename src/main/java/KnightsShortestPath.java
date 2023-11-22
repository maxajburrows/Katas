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

        if (!currentSquare[0].equals("h") && !currentSquare[1].equals("8")) {
            count1 = move1(previousSquares, currentSquare, endSquare, numMoves);
            count2 = move2(previousSquares, currentSquare, endSquare, numMoves);
        }
        if (!currentSquare[0].equals("h") && !currentSquare[1].equals("1")) {
            count3 = move3(previousSquares, currentSquare, endSquare, numMoves);
            count4 = move4(previousSquares, currentSquare, endSquare, numMoves);
        }
        if (!currentSquare[0].equals("a") && !currentSquare[1].equals("8")) {
            count5 = move5(previousSquares, currentSquare, endSquare, numMoves);
            count6 = move6(previousSquares, currentSquare, endSquare, numMoves);
        }
        if (!currentSquare[0].equals("a") && !currentSquare[1].equals("1")) {
            count7 = move7(previousSquares, currentSquare, endSquare, numMoves);
            count8 = move8(previousSquares, currentSquare, endSquare, numMoves);
        }

        int[] routes = new int[] { count1, count2, count3, count4, count5, count6, count7, count8 };

        return Arrays.stream(routes)
                .filter(count -> count > 0)
                .min()
                .orElse(0);
    }

    public static int move(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves, int numInc, int letInc) {
        String[] move = new String[] { changeLetter(currentSquare[0], letInc),
                String.valueOf (Integer.parseInt(currentSquare[1]) + numInc) };
        List<String> previousSquaresCopy = new ArrayList<>(previousSquares);
        previousSquaresCopy.add(String.join("", currentSquare));
        return moveOptions(previousSquaresCopy, move, endSquare, numMoves + 1);
    }

    private static String changeLetter(String currentValue, int increment) {
        return String.valueOf((char) (currentValue.toCharArray()[0] + increment));
    }

    public static int move1(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, 2, 1);
    }

    public static int move2(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, 1, 2);
    }

    public static int move3(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, -2, 1);
    }

    public static int move4(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, -1, 2);
    }

    public static int move5(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, 2, -1);
    }
    public static int move6(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, 1, -2);
    }
    public static int move7(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, -1, -2);
    }

    public static int move8(List<String> previousSquares, String[] currentSquare, String[] endSquare, int numMoves) {
        return move(previousSquares, currentSquare, endSquare, numMoves, -2, -1);
    }
}