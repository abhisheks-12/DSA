class GP {
    public static void main(String[]args){

        // gemoteric progression

        /* Input 

                   A = 1
                   B = 2
                   N = 5
                   Output: 16
        */

        int intialNum = 1;
        int gap = 2;
        int limit = 5;  


        

        // 84 87
        // 3

        // formula  nth = a*r^(n-1)

        // ans using loop
        int ans = intialNum*( calculatePower(gap,limit-1));
        System.out.println(ans);


      

    }

    static void int calculatePower(int exponential , int base){
        int result = 1;
        while(exponential != 0){
            result *= base;
            exponential --;
        }
        return result;
    }

            +


    static  void parseCCDA(String ccda){
        String result = message.getRoot()
    }

}