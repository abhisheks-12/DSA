public class Loops_11{
    public static void main(String[]args){
        
        // while loop
        int number = 1;
        while (number < 4){
//            System.out.println(number);
            number ++ ;
        }

        //do while
        int number2 = 0;
        do{
//            System.out.println(number2);
            number2++;
        }while(number2 < 5);


        //for loop
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }


        // PRINT N ODD Numbers
        // even - 2n
        // odd  - 2n + 1
        int n = 5;
        for(int i=0; i<=5; i++){
            System.out.println(2*i+1);
        }

        for(int j=5; j>0; j--){
            System.out.println(j);
        }




        // Break and Continue Statements
        for(int i=0; i<5; i++){
            System.out.println(i);
            if(i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }

        for(int i=0; i<=10; i++){
            System.out.println(i);
            if(i == 2){
                System.out.println("Continue");
                continue;
            }
            System.out.println("PRINT "+i);
        }

    }
}