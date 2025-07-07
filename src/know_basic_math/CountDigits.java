package know_basic_math;

public class CountDigits {

    private static int countDigit(int num) {
        int count = 0;
        while (num != 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 123456;
        int res = countDigit(num);
        System.out.println(res);
    }


}
