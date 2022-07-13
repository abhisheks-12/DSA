import java.util.Scanner;


public class PraticeSet_04 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);


        // 1 . calculate percentage
        System.out.println("Enter your marks as per subject");

        System.out.print("Enter marks of language : ");
        double language = scn.nextDouble();

        System.out.print("Enter marks of maths : ");
        double maths = scn.nextDouble();

        System.out.print("Enter marks of philosophy : ");
        double philosophy = scn.nextDouble();

        System.out.print("Enter marks of coding : ");
        double coding = scn.nextDouble();

        double totalObtainedMarks = language + maths + philosophy + coding;
        double calculatePercentage = (totalObtainedMarks/400)*100;

        System.out.println("percentage of student : "+ calculatePercentage);


        //2. calculate cgpa
        double cgpa =  totalObtainedMarks/40;
        System.out.println("Cgpa is : "+ cgpa);

        //3.km to miles
        int kilometers = 15;
        float kilometersToMiles = kilometers * 0.62137F;
        System.out.println("Miles are : "+ kilometersToMiles);


       //4 .greet user
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        System.out.println("Hello "+name+" have a nice day!");

        //5. check entered number is integer or not
        System.out.print("Enter the number you want check: ");
        boolean checkIsNumberInteger = scn.hasNextInt();
        System.out.println(checkIsNumberInteger);


    }
}
