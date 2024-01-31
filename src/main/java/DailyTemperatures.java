public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int arrayLength = temperatures.length;
        int[] answersArray = new int[arrayLength];

        for (int i=0; i < arrayLength; i++) {
            int counter = 0;
            int comparisonTemp = temperatures[i];
            boolean nothingLower = true;
//            boolean lowerLoop = false;
            boolean foundHigher = false;
            int lowerIndex = 0;
            for (int j=1; i+j < arrayLength; j++) {
                counter++;
                if (temperatures[i+j] < comparisonTemp && nothingLower) {
                    lowerIndex = i+j;
                    nothingLower = false;
                }
                if (temperatures[i+j] > comparisonTemp) {
                    foundHigher = true;
                    break;
                }
//                if (i+j == arrayLength-1) {
//                    if (nothingLower && i < arrayLength-1) {
//                        return answersArray;
//                    }
//                    answersArray[i] = 0;
//                    lowerLoop = true;
//                }
            }
            if (!foundHigher) {
                if (nothingLower) {
                    return answersArray;
                }
                i = lowerIndex-1;
//                answersArray[i] = 0;
            } else {
                answersArray[i] = counter;
//            answersArray[i] = counter;
                if (nothingLower && i < arrayLength-1) {
                    int countdown = counter;
                    for (int j=i+1; j < i+counter; j++) {
                        answersArray[j] = --countdown;
                    }
                    if (i + counter == arrayLength-1) {
                        return answersArray;
                    }

                }

                //i += (counter-1);
            }

        }
        return answersArray;
    }
}