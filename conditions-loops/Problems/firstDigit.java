class FirstDigit {
    public static void main(String[]args){


        // get first digit of number 
        // int n  = 115646
        // output ------> 1



        // method 1
        int num = 12331;
        int tempNum = num;
        int multiplier = 1;

        while(tempNum != 0){
            tempNum = tempNum / 10;
            multiplier *=  10;
        }

        multiplier = multiplier / 10;

        int firstDigit = num / multiplier;
        

        System.out.println(firstDigit);


        // method 2
        if(num < 10){
            return num 
        }

        while( num  > 10){
            num = num /10;
        }

        return num;


    }
}