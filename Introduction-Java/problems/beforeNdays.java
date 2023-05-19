class BeforeNDays{
    public static void main(String[]args){
        System.out.println("hello world");
        Scanner scn = new Scanner(System.in);


        int day = 3;
        int gap = 19;

        // output ------>  4

        //  Given two integer d and n. Where d is the day, out of 7 days of week, d varies from 0 to 6 as shown below
        


        /*    

                            0 - Sunday

                            1 - Monday

                            2 - Tuesday

                            3 - Wednesday

                            4 - Thursday

                            5 - Friday

                            6 - Saturay
*/
                           
                            int gapBetweenDays  = gap % 7; // this will give us reaming days 



                            int  actualGap = gapBetweenDays - day;

                            if(actualGap < 0){
                                return ((actualGap) + 7)
                            }else{
                                return actualGap;
                            }



    }
   
}