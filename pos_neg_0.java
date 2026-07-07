import java.util.*;
public class pos_neg_0 {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        a = sc.nextInt();
        if (a == 0){
            System.out.println(a+" is Zero");
        }
        else if(a > 0){
            System.out.println(a+" is positive number");
        }
        else{
            System.out.println(a+" is negative");
        }
        sc.close();
    }
}
