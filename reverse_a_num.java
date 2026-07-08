import java.util.*;

public class reverse_a_num {
    public static void main(String args[]){
        int num,rev = 0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while(num > 0){
            rem = num % 10;
            rev *= 10;
            rev += rem;
            num /= 10;
        }
        System.out.println(rev);
        sc.close();

    }
}
