public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int arrayLength = temperatures.length;
        int[] answersArray = new int[arrayLength];

        for (int i=0; i < arrayLength; i++) {
            int counter = 0;
            int comparisonTemp = temperatures[i];
            boolean nothingLower = true;
            for (int j=1; i+j < arrayLength; j++) {
                counter++;
                if (temperatures[i+j] < comparisonTemp) {
                    nothingLower = false;
                }
                if (temperatures[i+j] > comparisonTemp) {
                    break;
                }
                if (i+j == arrayLength-1) {
                    counter = 0;
                }
            }
            answersArray[i] = counter;
            if (!nothingLower) {
                for (int j=i+1; j < arrayLength; j++) {
                    answersArray[j] = --counter;
                }
                break;
            }
        }
        return answersArray;
    }
}