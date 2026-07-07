public class leap_year {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 4 == 0 || year % 400 == 0){
            System.out.print(year+" Is leap year");
            
        }
        else if (year % 100 == 0){
            System.out.print(year+" Is not leap year");
        }
        else{
             System.out.print(year+" Is not leap year");
        }
    }
}
