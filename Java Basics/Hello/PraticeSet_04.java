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


        // 2 .


    }
}
