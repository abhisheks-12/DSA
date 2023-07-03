class Leap{

    public static void main(String[]args){
               //The line below prints the output

                // if year divisible by 4 && not divisible by 100 --- > leap year
                // if year divsible by 4 and 100 it must divsible by 400 ---- > leap 
                // else not leap year

            int year = 1798;
            String isLeap = "True";


            if(year % 4 == 0 && year % 100 != 0){
                isLeap = "True";
            }else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
                isLeap = "True";
            }else{
                isLeap = "False";
            }

            System.out.println(isLeap);


          
            

            
    
    }   
}