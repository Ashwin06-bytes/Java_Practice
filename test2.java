public class test2 {
    public static void main(String[] args) {
        int num1 = 0,num2 =1,next,a=5;
        System.out.print(num1);
        System.out.print(num2);

        for (int i = 3 ; i <= a ; i++){
            next = num1 + num2;
            System.out.print(next);

            num1 = num2;
            num2 = next;
        }
    }

}
