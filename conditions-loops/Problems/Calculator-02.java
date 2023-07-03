class Calculator {
    public static void main(String[]args){

            /*
            
                Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 

                If operator equals to 1 add a and b, then print the result.

                If operator equals to 2 subtract b from a, then print the result.

                If operator equals to 3 multiply a and b, then print the result.

                If operator equals to any another number, print "Invalid Input"(without quotes).

                Note : You don't have to print any new lines after printing the output.


                Input:
                a = 1
                b = 2
                operator = 3
                Output: 
                2
                Explanation: 1 * 2 = 2            
            
             */

             int operator = 1;
             int a = 10;
             int b = 15;

            int result = 0;
                
                if(operator == 1){
                    result = a + b;
                }else if(operator == 2){
                    result = b - a;
                }else if(operator == 3){
                    result = a * b;
                }else{
                   result = "Invalid Number";
                }


                System.out.println(result);
                

                
            }


        
    }
}