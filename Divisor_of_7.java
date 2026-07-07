import java.util.*;
public class Divisor_of_7 {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num % 7 == 0){
            System.out.print(num +" is divisibal by 7");
        }
        else{
            System.out.println(num +" is not divisable");
        }
        sc.close();

    }
    
}
