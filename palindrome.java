public class palindrome {
    public static void main(String[] args) {
        int num = 111,rev=0,rem;
        int orginal = num;

        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;

        }

        if (orginal == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not");
        }
    }
}
