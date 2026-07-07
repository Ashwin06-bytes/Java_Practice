import java.util.*;
public class Greater_of_2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        a = sc.nextInt();
        System.out.println("enter b :");
        b = sc.nextInt();

        if(a > b){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println(b+" is Greater");
        }
        sc.close();

    }
    
}
