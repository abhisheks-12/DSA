import java.util.Scanner;

public class Strings_07{
    public static void main(String[]args){
        //String Declaration
        String name = "Abhishek";
        System.out.println(name);

        //String Formatting
        int num = 10;
        float decimalNum = 10.5f;
        System.out.printf("The value of number is %d  and %f \n",num,decimalNum);
        // %d for int , %f for float , %c for char , %s for string

        //Taking Input
        Scanner scn = new Scanner(System.in);
        String user = scn.nextLine();
        System.out.println("USER - "+user);



        //STRING METHODS
        String firstName = "Bruce";
        int firstNameLength = firstName.length();
        System.out.println(firstNameLength);
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.toUpperCase());

//        TRIM  ---- Remove extra spaces
        String notTrimmedString = "  abhishek   ";
        System.out.println(notTrimmedString.trim());

//        SUBSTRING
//        string.substring(start,end) -> first including and last excluding
        System.out.println(firstName.substring(1,4));

//        REPLACE
        System.out.println(firstName.replace("B","T"));

//        startsWith
        System.out.println(firstName.startsWith("B"));
        System.out.println(firstName.endsWith("D"));

        System.out.println(firstName.charAt(0));

        System.out.println(firstName.indexOf("Br"));
        System.out.println(firstName.indexOf("ru"));

        System.out.println(firstName.lastIndexOf("ce"));

        System.out.println(name.equals("Abhishek"));
        System.out.println(name.equalsIgnoreCase("abhishek"));
    }
}