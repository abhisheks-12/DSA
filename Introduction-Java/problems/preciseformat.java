class PreciseFormat{
    public static void main(String[]args){

        // it's about formatting output

        /* expected input

        Input:
            5.43 2.653

        output :
            2.046739 2.047

    */

    int num1 = 5.43;
    int num2 = 2.653;

    float result = num1 / num2;
    System.out.print(result + " ");
    System.out.printf("%.3f",result);



    

    }
}