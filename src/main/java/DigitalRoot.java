public class DigitalRoot {

    public int reduceSums(int num) {
        int digitSum = sumDigitsWithRec(0, String.valueOf(num));
        if (digitSum >= 10) {
            return reduceSums(digitSum);
        }
        return digitSum;
    }

    public int sumDigitsWithRec(int sum, String remainNumber) {
        sum += Integer.valueOf(remainNumber.substring(0, 1));
        if (remainNumber.length() > 1) {
            return sumDigitsWithRec(sum, remainNumber.substring(1));
        }
        return sum;
    }

    public int oneLiner(int num) {
        return (num != 0 && num%9 == 0) ? 9 : num%9;
    }
}
