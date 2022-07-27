import java.util.Scanner;


public class ConditionalOperators_09 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // IF ELSE
        int experience = 8;
//
        if(experience == 10){
            System.out.println("Architecture");
        }else if(experience < 10){
            System.out.println("Principal");
        }else if(experience > 5){
            System.out.println("Senior");
        }else{
            System.out.println("Junior");
        }

        // SWITCH CASE
        switch(experience){
            case 8:
                System.out.println("Adult");
                break;

            case 21:
                System.out.println("College");
                break;

            default:
                System.out.println("Enjoy your life");
        }



        // PROBLEM SET

        //1.Guess output
        // Ans - Error

        //2.calculate student result
        int markMaths = 60;
        int markScience = 36;
        int markEnglish = 33;

        if((markMaths > 40 || markMaths >= 33) && (markScience > 40 || markScience >= 33) && (markEnglish > 40 || markEnglish >= 33)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        //3.calculate tax paid by an employee
//        Income Slab	Tax
//        2.5L – 5.0L  	5%
//        5.0L – 10.0L 	20%
//        Above 10.0L	30%


        System.out.print("Enter your Income: ");
        float income = scn.nextFloat();
        float percentage;

        if(income >= 250000 && income < 500000){
            percentage = (income * 5)/100;
            System.out.println("Your income is "+income + " your tax is "+ percentage);
        }else if(income >= 500000 && income < 1000000){
            percentage = (income * 20)/100;
            System.out.println("Your income is "+income + "your tax is "+ percentage);
        }else if(income >= 1000000){
            percentage = (income * 30)/100;
            System.out.println("Your income is "+income + "your tax is "+ percentage);
        }else{
            System.out.println("You are not under income tax slab");
        }



        // find out day of week
        System.out.print("Enter day of week : ");
        int day = scn.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thu");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }


        //check leap year or not
        System.out.print("Enter the year: ");
        int year = scn.nextInt();
        if(year % 4 == 0 && year % 100 != 00){
            System.out.println("Year is leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 ==0){
            System.out.println("Leap year");
            
        }else {
            System.out.println("not leap year");
        }


        //check url
        // .com – commercial website
        //.org – organization website
        //.in – Indian website
        System.out.print("Enter the url: ");
        String url = scn.nextLine();
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".org")){
            System.out.println("organization website");
        }else{
            System.out.println("Indian website");
        }
    }
    
}
