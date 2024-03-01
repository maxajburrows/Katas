public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int oneCounter = 0;
        for (int i=0; i < length; i++) {
            if (s.charAt(0) == '1') {
                oneCounter++;
            }
        }
        String ones = (oneCounter > 0) ? "1".repeat(oneCounter-1): "";
        String zeroes = (length - oneCounter > 0) ? "0".repeat(length - oneCounter - 1): "";
        return ones + zeroes + "1";
    }
}
