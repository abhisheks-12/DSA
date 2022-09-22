import java.util.Scanner;

public class Pratice_01{
    public static void main(String[]args){

        // 1.
        char ch = '1';
        int updatedCharacter = (int) ch;
        System.out.println(updatedCharacter);
        if(updatedCharacter >= 64 && updatedCharacter <= 90){
            System.out.println("Character is uppercase");
        }else if(updatedCharacter >= 97 && updatedCharacter <= 122){
            System.out.println("Charcter is lowercase");
        }else{
            System.out.println("character is number");
        }
         
        
        // 2.
         int sum = 0;
         int i = 1;

         while(i <= 5){
            sum += i;
            i++;
         }
         System.out.println(sum);
         
        // 3 .
         int num2 = 5;
         int sum2= 0;
         for(int i = 1; i<=num; i++){
            if(i%2 == 0){
                sum += i;
            }
         }
         System.out.println(sum2);

        // 4. 
         //prime or not prime
         int number2 = 13;
         boolean isPrime = true;
         for(int i=2; i<number2; i++){
            if(number2 % i == 0){
                isPrime = false;
                break;
            }
         }
         if(isPrime){
            System.out.println("Number is prime");
         }else{
            System.out.println("Number is not prime");
         }
    }
}