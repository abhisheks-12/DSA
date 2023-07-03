class Fibonaci {
    public static void main(String[]args){

        int firstNum = 1;
        int secondNum = 1;
        int range = 3;
         // 3 
         // 1 1 2 3 5

        System.out.println(firstNum);
        System.out.println(secondNum);

        int counter = 2;

        for(int i=1; i<=range; i++){
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
            counter ++;

            if(counter == n){
                System.out.println(sum);

            }
        }



        

    }

   
}




// 1 1 2 3 5



