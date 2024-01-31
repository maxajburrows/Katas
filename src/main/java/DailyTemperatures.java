public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int arrayLength = temperatures.length;
        int[] answersArray = new int[arrayLength];

        for (int i=0; i < arrayLength; i++) {
            int counter = 0;
            int comparisonTemp = temperatures[i];
            boolean nothingLower = true;
            boolean lowerLoop = false;
            for (int j=1; i+j < arrayLength; j++) {
                counter++;
                if (temperatures[i+j] < comparisonTemp || temperatures[j-1] < temperatures[j]) {
                    nothingLower = false;
                }
                if (temperatures[i+j] > comparisonTemp) {
                    break;
                }
                if (i+j == arrayLength-1) {
                    if (nothingLower && i < arrayLength-1) {
                        return answersArray;
                    }
                    answersArray[i] = 0;
                    lowerLoop = true;
                }
            }
            if (!lowerLoop) {
                answersArray[i] = counter;
            }
            if (nothingLower && i < arrayLength-1) {
                int countdown = counter;
                for (int j=i+1; j < i+counter; j++) {
                    answersArray[j] = --countdown;
                }
                i += (counter-1);
            }
        }
        return answersArray;
    }
}