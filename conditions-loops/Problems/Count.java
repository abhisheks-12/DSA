class Count{
    public static void main(String[]args){

        int number = 46513;
        int count = 0;

        while(number ! = 0){
            number = number / 10;
            count ++;
        }


        System.out.print(count);


    }
}
