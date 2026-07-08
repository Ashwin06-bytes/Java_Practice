class test{
    public static void main(String[] args) {
        int a = 10;
        int count=0;
        if (a < 2){
            System.out.println("It is not prime");
        }
        else{
            
            for(int i = 2;i<a;i++){
                if(a%i==0){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}