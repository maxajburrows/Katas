public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int arrayLength = temperatures.length;
        int[] answersArray = new int[arrayLength];

        for (int i=0; i < arrayLength; i++) {
            int counter = 0;
            int comparisonTemp = temperatures[i];
            for (int j=1; i+j < arrayLength; j++) {
                counter++;
                if (temperatures[i+j] == comparisonTemp) {
                    break;
                }
            }
            answersArray[i] = counter;
        }
        return answersArray;
    }
}
