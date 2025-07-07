package know_basic_math;

public class ReverseNumber {

    private static int reverseNumber(int num) {
//        String str = String.valueOf(num);
//        StringBuilder sb = new StringBuilder(str);
//        return Integer.parseInt(sb.reverse().toString());

        int sum = 0;
        while (num != 0){
            sum = sum*10 + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 123456789;
        int res = reverseNumber(num);
        System.out.println(res);
    }
}
