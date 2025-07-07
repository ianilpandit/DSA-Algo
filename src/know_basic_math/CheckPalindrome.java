package know_basic_math;

public class CheckPalindrome {

    private static boolean checkPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (num != 0){
            sum = sum*10 + num%10;
            num = num / 10;
        }
        System.out.println(sum);
        return sum == temp;
    }

    public static void main(String[] args) {
        int num = 123432;
        boolean res = checkPalindrome(num);
        System.out.println(res);
    }
}
