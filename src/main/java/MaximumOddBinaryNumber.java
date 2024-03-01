public class MaximumOddBinaryNumber {
    public String maximumOddBinaryManual(String s) {
        int oneCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneCounter++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i < oneCounter-1; i++) {
            result.append("1");
        }
        for (int i=0; i < s.length()-oneCounter; i++) {
            result.append("0");
        }
        result.append("1");
        return new String(result);
    }

    public String maximumOddBinaryNumber(String s) {
        int oneCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneCounter++;
            }
        }
        String ones = (oneCounter > 0) ? "1".repeat(oneCounter-1): "";
        String zeroes = "0".repeat(s.length() - oneCounter);
        StringBuilder result = new StringBuilder(ones);
        result.append(zeroes);
        result.append("1");
        return new String(result);
    }
}
