import java.util.*;

public class prime{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a <= 1){
            System.out.print(a+" is not a prime number");
        }
        else{
            int count = 0;
            for(int i = 2; i < a;i++){
                if(a%i == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("It is prime");
            }
            else{
                System.out.println("It is not a prime");
            }
        }
        sc.close();

    }
}