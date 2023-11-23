import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KnightsShortestPath {

    private ArrayList<Square> visitedSquares = new ArrayList<>();
    private Queue<Square> queuedSquares = new PriorityQueue<>();

    public int knight(String start, String finish) {
        String[] startSplit = start.split("");
        Square startSquare = new Square(0, startSplit);
        if (Integer.parseInt(startSplit[1]) < 1 || Integer.parseInt(startSplit[1]) > 8) {
            throw new IllegalArgumentException("Given square is not within the board!");
        }
        String[] endSplit = finish.split("");
        // Stop the recursion
        // Add first location to the queue
        // Add while loop here and call the make move function
        queuedSquares.add(startSquare);
        while (!queuedSquares.isEmpty()) {
            makeMove(queuedSquares.remove(), endSplit);
            // return if square is found and distance
        }
    }

    private int makeMove(Square square, String[] endLocation) {
        // return boolean and keep path as a global variable?
        int[] letterMoves = new int[] { 1, 2, 1, 2, -1, -2, -1, -2 };
        int[] numberMoves = new int[] { 2, 1, -2, -1, 2, 1, -2, -1 };

        for (int i = 0; i < 8; i++) {
            String[] newLocation = new String[] { changeLetter(square.getLetter(), letterMoves[i]),
                    String.valueOf(square.getNumber() + numberMoves[i]) };
            if (Arrays.equals(newLocation, endLocation)) {
                return square.getDistance() + 1;
            }
            boolean isSquareValid = checkSquareIsValid(newLocation);
            // Check location isn't in visited squares
            Square newSquare = new Square(square.getDistance() + 1, newLocation);
            if (isSquareValid) {
                queuedSquares.add(newSquare);
                visitedSquares.add(newSquare);
            }
        }

    }

    private static String changeLetter(String currentValue, int increment) {
        return String.valueOf((char) (currentValue.toCharArray()[0] + increment));
    }

    private static boolean checkSquareIsValid(String[] location) {
        if (Integer.parseInt(location[1]) < 1 || Integer.parseInt(location[1]) > 8) {
            return false;
        }
        if (location[0].toCharArray()[0] < 97 || location[0].toCharArray()[0] > 104) {
            return false;
        }
        return true;
    }

    private class Square {
        private int distance;
        private String letter;
        private int number;
        public Square(int distance, String[] location) {
            this.distance = distance;
            this.letter = location[0];
            this.number = Integer.parseInt(location[1]);
        }

        public int getDistance() {
            return distance;
        }

        public String getLetter() {
            return letter;
        }

        public int getNumber() {
            return number;
        }

        // private ArrayList<Square> childSquares; Do you need to store child squares like this? Probably not - don't build a tree
    }

}