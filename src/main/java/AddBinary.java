public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int pointer1 = a.length() - 1;
        int pointer2 = b.length() - 1;
        while (pointer1 >= 0 || pointer2 >= 0 || carry > 0) {
            if (pointer1 >= 0) {
                carry += a.charAt(pointer1--) - '0';
            }
            if (pointer2 >= 0) {
                carry += b.charAt(pointer2--) - '0';
            }
            result.append(carry % 2);
            carry /= 2;
        }
        return result.reverse().toString();
    }
}
