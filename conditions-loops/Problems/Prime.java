class Prime{
    public static void main(String[]args){
        int num = 1;
        boolean isPrime = true;

        if(num == 1 ){
            System.out.println("No");
            return;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }


        if(isPrime){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // suppose 5 is the number
        // 




    }
}   