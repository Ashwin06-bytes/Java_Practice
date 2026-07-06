public class Conditional {
    public static void main(String[] args) {
        int mark = 85;

        if (mark >= 85){
            System.out.println("Grade:A");
        }
        else if (mark > 50 && mark <= 84){
            System.out.println("Grade:B");
        }
        else{
            System.out.println("Grade:C");
        }
    }
    
}
