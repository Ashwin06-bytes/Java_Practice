import java.util.*;
public class fabonicc {
    public static void main(String[] args) {
        int a=0,num,b = 1,fab;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        num = sc.nextInt();
        System.out.print(" "+a);
        System.out.print(" "+b);

        for(int i = 3; i <= num; i++){
            fab = a+b;
            System.out.print(" "+fab);

            a = b;
            b = fab;
            
        }
        sc.close();


    }
}
