class Divisor {
    public static void main(String[]args){

        // find divsior of given number

        int num = 12;


        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i);
            }
        }



    }
}