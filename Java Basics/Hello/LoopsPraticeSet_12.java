public class LoopPraticeSet_11 {
    public static void main(String[]args){

        /*

         ****
         ***
         **
         *


         */


        // problem 1.
        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
//                System.out.print("*");
            }
            System.out.println("\n");
        }


        //problem 2.
        // Write a program to sum first n even numbers using a while loop.
        // n(n+1)_
        int i =0;
        int sum = 0;
        while(i<n){
            sum += i*(i+1);
            i++;
        }
//        System.out.println("SUM is : "+ sum);



        //3. Write a program to print the multiplication table of a given number n.
        int number = 5 ;
        for(int i = 1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }

        //4. Write a program to print a multiplication table of 10 in reverse order.
        for(int i = number; i > 0 ; i--){
            System.out.println(number + " x " + i + " = " + number*i);
        }


        //5.Write a program to find the factorial of a given number using for loops.
        //  5 = 5 * 4 * 3 * 2 * 1
        int factorial =  1;
        for(int i=number; i>0; i--){
            factorial *= i;
        }
        System.out.println(factorial);


        //6.Repeat problem 5 using a while loop.
        int i = 1;
        int whileFactorial = 1;
        while(i <= number){
            whileFactorial *= i;
            i++;
        }
        System.out.println(whileFactorial);


       //7. Repeat problem 1 using for/while loop.

        int n = 5;
        int i = n;
        while (i > 0){
            int j= 1;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println("\n");
            i--;
        }


        //8.Write a program to calculate the sum of the numbers occurring in the multiplication table of 8
        int sum = 0;
        int eight = 8;
        for(int i=1; i<=10; i++){
            sum += sum + (i*eight);

        }
        System.out.println("Sum --- "+sum);











    }
}
