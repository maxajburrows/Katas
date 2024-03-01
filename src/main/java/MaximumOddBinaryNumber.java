public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int oneCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneCounter++;
            }
        }
        String ones = (oneCounter > 0) ? "1".repeat(oneCounter-1): "";
        String zeroes = "0".repeat(s.length() - oneCounter);
        return ones + zeroes + "1";
    }
}
