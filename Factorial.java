import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a;
         System.out.print("Enter the  number : ");
         a = sc.nextInt();
        if(a == 0){
            System.out.println("The factorial is 1");
        }
        else{
         int fact = 1;
         for(int i = 1; i <= a; i++){
            fact *= i;
          }
          System.out.println(fact + "is factorial of "+a);
        }
        sc.close();
    
    }
   
}
