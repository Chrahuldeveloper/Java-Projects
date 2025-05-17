class Sol3 {
    public static void main(String[] args) {
        int x = 120;

        String xstr = Integer.toString(x);

        int startIndex = 0;
        boolean isNegative = false;

        if (xstr.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        }

        int[] digits = new int[xstr.length() - startIndex];
        for (int i = startIndex; i < xstr.length(); i++) {
            digits[i - startIndex] = xstr.charAt(i) - '0';
        }

        String reverse = "";
        if (isNegative)
            reverse += "-";

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 0) {
                continue;
            }
            reverse += digits[i];
        }

        System.out.println(reverse);
    }
}
