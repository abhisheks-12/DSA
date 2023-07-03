class CheckDivisor{
    public static void main(String[]args){

            

            int num = 234;
            int previousDivsior = 0;
            String result = "";

            if(num % 2 == 0){
                result = "Two";
                previousDivsior = 2;
            }
            if(num % 3 == 0 && previousDivsior < 3){
                result = "Three";
                previousDivsior = 3;
            }if(num % 11 == 0 && previousDivsior < 11){
                result = "Eleven";
                previousDivsior = 11;
            }
            if(num % 2 != 0 && num%3 != 0 && num%11 != 0){
                result = "-1";
            }


            System.out.println(result);
        
            

        
    }
}