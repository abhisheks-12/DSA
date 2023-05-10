class GetLastDigit {
    public static void main(String[]args)}{
        int num = 443

        if(num < 0){
            num = num * (-1);

        }

        int lastDigit = num % 10;

        System.out.println(lastDigit);

    }
}