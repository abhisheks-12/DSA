class FindNthTerm {
    public static void main(String[]args){
       

       // find nth term of arithmetic expresssion

       // Input ------  a = 5 , d = 2 , n = 10 
        // expected output ------   23

       // second example -  a = 2 , d = 1 , n = 5

        // 5,7,9,11,13,15,17,19,21,23 ---  some stupid calcluations 
        Scanner scn = new Scanner(System.in);
        int intialNum = scn.nexInt();
        int differenceBetweenNum = scn.nexInt();
        int range = scn.nexInt();

        

      // solution 1 using loop
        int ans = nthTermUsingLoop(intialNum,range,differenceBetweenNum);
        // System.out.println(ans);


        // solution 2 general formula
        int nthTermFormula= nthTermUsingFormula(intialNum,range,differenceBetweenNum);
        System.out.println(nthTermFormula);

  
    }

    public static int nthTermUsingLoop(int initialNumber,int range,int differnce){
        // int finalNum;
        for(int i=1; i<range; i++){
            intialNum += differnce;  
        }
        return intialNum;
    }

    public static int nthTermUsingFormula(int initialNumber, int range , int differnce){
        int ans = initialNumber + (range -1)*differnce;
        return ans;
    }
}