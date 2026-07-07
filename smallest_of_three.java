import java.util.*;
public class smallest_of_three {
    public static void main(String[] args) {
        int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value for a: ");
    a = sc.nextInt();
    System.out.print("Enter the value for b: ");
    b = sc.nextInt();
    System.out.print("Enter the value for c: ");
    c = sc.nextInt();
    if(a < b && a < c){
        System.out.print(a +" is smaller");
    }
    else if(b < a && b < c){
        System.out.print(b +" is smaller");
    }
    else{
        System.out.print(c +" is smaller");
    }
    sc.close();
}
    
        
    }
    



