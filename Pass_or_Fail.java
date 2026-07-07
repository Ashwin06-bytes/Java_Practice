import java.util.*;
public class Pass_or_Fail {
    public static void main(String args[]){
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark:");
        mark = sc.nextInt();
        
        if (mark > 40)
        {
            System.out.println("you are pass");
        }
        else
        {
            System.out.println("you are fail");
        }
        sc.close();

    }
    
}
