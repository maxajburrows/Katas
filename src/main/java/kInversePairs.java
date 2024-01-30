public class kInversePairs {

    public int kInversePairs(int n, int k) {
        int [] numbersArray = new int[n];
        for (int i=1; i <= n; i++) {
            numbersArray[i-1] = i;   // Could do this with stream but performance may be worse
        }

        // Build all possible arrays and test
        int matches = 0;
        for (int i=0; i < n; i++) {

            for (int j=0; j < n; j++) {
                int [] testArray = new int[n];
                // Another nested loop required?
                // Need a recursive function to build the arrays
//                testArray[i] = i;

            }
        }


        return 0;
    }
}