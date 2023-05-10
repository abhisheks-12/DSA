class SwapNumber {
    public static void main(String[]args){
        // swap numbers 
        //   input ----- a = 1 , b = 2
        //   output ------ b = 1 , a = 2

        int firstNum = 1;
        int secondNum = 2;

        int tempNum = firstNum;
        firstNum = secondNum;
        secondNum = tempNum;

        System.out.print(firstNum + " " + secondNum);
    }
}