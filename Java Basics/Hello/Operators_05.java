public class Operators_05 {
    public static void main(String[]args){
        //        Arthematic operator
        int num1 = 10;
        int sum = num1 + 5;
        int remainder = 10 % 5;  // modulo operator
        System.out.println(sum);

//        comparison operator
        System.out.println(10 > 5);
        System.out.println(100 == 10);
        System.out.println(8<5);


//       Logical operators
        System.out.println(65 > 30 && 45 < 10);
        System.out.println(65 > 30 || 45 < 10);
        boolean checkGreater = 65 > 30 || 45 < 10;
        System.out.println(!checkGreater);

//       Precedence  and associtivity of operators

        int precedence = 6*5-34/2;
        /*
        * , / , % have higher precendence and if both operators have same precendence
        it will evaluate from left to right

            30 - 34/2
            30-17
            13
         */

        int associativity = 60/5-34*2;
        /*
            12 - 68
            -56
         */
//        System.out.println(precedence);
//        System.out.println(associativity);


//        Quick Quiz
        int num = 10;
        int num2 = 5;
        int num3 = 2;

        int output;
        output = num - num2/2;
        System.out.println("output "+output);


//        Increment and Decrement Operators

        int age = 50;
//        ++ age vs age ++

        // In post increment first variable assigned to variable n then addition takes place
        System.out.println("Post Increment "+ age++);
        System.out.println(age);

       // first addition happens and then assigned to variable
        int age2 = 50;
        System.out.println(++age2);
        System.out.println(age2);

        //Quick Quiz
        int eight = 7;
        int total = ++eight * 8;
        System.out.println(total);

    }
}