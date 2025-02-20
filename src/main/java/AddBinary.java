public class AddBinary {
    public String addBinary(String a, String b) {
        String longer = a.length() > b.length() ? a : b;
        String shorter = a.length() > b.length() ? b : a;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < shorter.length(); i++) {
            int shortEndChar = shorter.charAt(shorter.length() - 1 - i) - '0';
            int longEndChar = longer.charAt(longer.length() - 1 - i) - '0';
            int sum = shortEndChar + longEndChar + carry;
            carry = sum / 2;
            result.append(sum % 2);
        }
        for (int i = shorter.length(); i < longer.length(); i++) {
            int longEndChar = longer.charAt(longer.length() - 1 - i) - '0';
            int sum = longEndChar + carry;
            carry = sum / 2;
            result.append(sum % 2);
        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
