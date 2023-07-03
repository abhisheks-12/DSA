// N = 100
// Output:
// 2 2 5 5
// Explanation:
// 100 = 2 * 2 * 5 * 5




/*  
Step 1: Divide the given number by the smallest prime number. In this case, the smallest prime number should divide the number exactly.
Step 2: Again, divide the quotient by the smallest prime number.
Step 3: Repeat the process, until the quotient becomes 1.
Step 4: Finally, multiply all the prime factors

first check if divisor is prime if it's prime divide number and obtain quotinent   

*/



class PrimeFactorization {
    public static void main(String[]args){
        int number = 50;
        System.out.print(number);
        for(int i=2; i<=50; i++){
            while( number % i == 0){
                System.out.print(i);
                number =    number / i;
            }
        }

        if(number < 2){
            System.out.print(number);
        }
    }
}


/*



n = 4
Output: 
3
Explanation:
In the series 1 1 2 3 5...... the fourth
fibonacci number is 3.

///////////////////////////////////// 




*/