class Sol5 {
    public static void main(String[] args) {


        String x = "11";
        String y = "1";
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;

        String res = Integer.toBinaryString(sum);

        System.out.println(res);

    }
}