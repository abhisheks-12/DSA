import java.util.Scanner;


public class TakingInput_03 {
    public static void main(String[] args){


        System.out.println("Taking input from users");

//        integer input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1  = scn.nextInt();
        System.out.print("Enter Number 2 : ");
        int number2 = scn.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum of number is : "+sum);

//        float input
        float number3 = scn.nextFloat();
        System.out.println(number3);


//        String Input
//        String userName = scn.next(); -------- > will not take world after space
        String userName = scn.nextLine();
        System.out.println("UserName : "+userName);

        //Checking user input is valid or not
        // Here taking integer as input if it's not integer it will give false
        boolean isInputInteger = scn.hasNextInt();
        System.out.println(isInputInteger);
    }

}
