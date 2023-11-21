//import java.util.Arrays;
//
//public class IMCKata2 {
//
//    int counter1 = counter;
//    int counter2 = counter;
//    int counter3 = counter;
//    int counter4 = coun0ter;
//    int counter5 = 0;
//    int counter6 = 0;
//    int counter7 = 0;
//    int counter8 = 0;
//    public static void mainFunc() {
//        int[] counterArray = new int[]{counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8};
//        Arrays.stream(counterArray).filter(count -> count <= counter);
//    }
//
//    import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//import java.util.Arrays;
//    class Result {
//
//        /*
//         * Complete the 'moves' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts following parameters:
//         *  1. INTEGER n
//         *  2. INTEGER startRow
//         *  3. INTEGER startCol
//         *  4. INTEGER endRow
//         *  5. INTEGER endCol
//         *  6. INTEGER bishopRow
//         *  7. INTEGER bishopCol
//         */
//
//        public static int moves(int n, int startRow, int startCol, int endRow, int endCol, int bishopRow, int bishopCol) {
//            return knightMove(0, startCol, startRow, n, endCol, endRow);
//
//        }
//
//        public static int knightMove(int counter, int knightCol, int knightRow, int boardSize, int endCol, int endRow) {
//            if (counter == 50) {
//                return -1;
//            }
//
//            int counter1 = counter;
//            int counter2 = counter;
//            int counter3 = counter;
//            int counter4 = counter;
//            int counter5 = counter;
//            int counter6 = counter;
//            int counter7 = counter;
//            int counter8 = counter;
//
//            //8 cases where knight can move
//            if (knightCol+2 < boardSize && knightRow+1 < boardSize) {
//                if (knightCol+2 == endCol && knightRow+1 == endRow) {
//                    counter1 = counter +1;
//                } else {
//                    counter1 = knightMove(counter+1, knightCol+2, knightRow+1, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol+1 < boardSize && knightRow+2 < boardSize) {
//                if (knightCol+1 == endCol && knightRow+2 == endRow) {
//                    counter2 = counter +1;
//                } else {
//                    counter2 = knightMove(counter+1, knightCol+1, knightRow+2, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol+2 < boardSize && knightRow-1 >= 0) {
//                if (knightCol+2 == endCol && knightRow-1 == endRow) {
//                    counter3 = counter +1;
//                } else {
//                    counter3 = knightMove(counter+1, knightCol+2, knightRow-1, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol+1 < boardSize && knightRow-2 >= 0) {
//                if (knightCol+1 == endCol && knightRow-2 == endRow) {
//                    counter4 = counter +1;
//                } else {
//                    counter4 = knightMove(counter+1, knightCol+1, knightRow-2, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol-1 >= 0 && knightRow+2 < boardSize) {
//                if (knightCol-1 == endCol && knightRow+2 == endRow) {
//                    counter5 = counter +1;
//                } else {
//                    counter5 = knightMove(counter+1, knightCol-1, knightRow+2, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol-1 >= 0 && knightRow+1 < boardSize) {
//                if (knightCol-1 == endCol && knightRow+2 == endRow) {
//                    counter6 = counter +1;
//                } else {
//                    counter6 = knightMove(counter+1, knightCol-1, knightRow+1, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol-2 >= 0 && knightRow+1 < boardSize) {
//                if (knightCol+2 == endCol && knightRow+1 == endRow) {
//                    counter7 = counter +1;
//                } else {
//                    counter7 = knightMove(counter+1, knightCol-2, knightRow+1, boardSize, endCol, endRow);
//                }
//            }
//            if (knightCol-2 >= 0 && knightRow+2 < boardSize) {
//                if (knightCol+2 == endCol && knightRow+1 == endRow) {
//                    counter8 = counter +1;
//                } else {
//                    counter8 = knightMove(counter+1, knightCol-2, knightRow+2, boardSize, endCol, endRow);
//                }
//            }
//            int[] counterArray = new int[]{counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8};
//            Arrays.stream(counterArray).mapToObj(inte -> ((Integer) inte)).filter(count -> count <= counter)
//
//
//            return -1;
//        }
//}
