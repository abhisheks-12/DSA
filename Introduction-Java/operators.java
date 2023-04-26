class Operators {
    public static void main(String[]args){

        int num1 = 10 , num2 = 15;
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1  / num2);

        int num3 = num1++;
        System.out.println(num3); 
        // num3 = num1;
        // num1 = num1 + 1


        num3  = ++num1;
        System.out.println(num3);
        // num3 = num1 + 1;
        // num3 = num1

        
    }
}