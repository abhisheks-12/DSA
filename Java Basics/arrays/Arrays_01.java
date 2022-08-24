public class Arrays_01{
    public static void main(String[]args){
        //Array representation1
        int [] randomNumbers = new int[5];
        randomNumbers[0] = 10;
        randomNumbers[1] = 30;
        randomNumbers[2] = 60;
        System.out.println(randomNumbers[2]);


        //2.
        int [] marks;
        marks = new int[20];
        marks[0] = 15;
        System.out.println(marks[0]);


        //3.
        int [] marks2 = {10,20,30,40};
        System.out.println(marks2[1]);



        // multi dimensional arrays
        int [][] marks = {
                {10,20,30},
                {50,60,70}
        };



        int [][] numbers = new int[3][4];
        numbers[0][1] = 10;
        numbers[0][2] = 20;
        numbers[0][3] = 30;
//        numbers[0][4] = 40;
        System.out.println(numbers[0][1]);





        //FOR EACH LOOP
            int [] ages = {10,15,20,45};
            for(int element: ages){
            System.out.println(element);
        }


        // PROBLEM SET

        //1.Create an array of 5 floats and calculate their sum.
        float [] numbers = {10.1f,15.65f,5.8f,2.3f,13.11f} ;
//        System.out.println(numbers[1]);
        float sum = 0.0f;
        for(int i =0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);


        //2.Write a program to find out whether a given integer is present in an array or not.
        int givenNumber = 10;
        int [] intNumbers = {10,15,20,25,30};
        for(int i=0; i<intNumbers.length; i++){
            if(intNumbers[i] == givenNumber){
                System.out.println("Number is present");
            }
        }


        //3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        int totalMarks = 0;
        int [] marks = {50,80,10,60};
        for (int mark:marks){
            totalMarks += mark;
        }
        System.out.println(totalMarks/marks.length);


        //4.Create a Java program to add two matrices of size 2x3.
        int [][] matrix1 = {{10,20,30},{40,50,60}};
        int [][] matrix2 = {{10,30,20},{15,20,25}};

        int [][] addition  = new int[2][3];

        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                addition[i][j] = matrix1[i][j] +  matrix2[i][j];
            }
        }
        for (int[] elements:addition){
            for (int num:elements){
                System.out.println(num);
            }
        }

//      //5.Write a Java program to reverse an array.
        int [] array1 = {10,15,20,25,30};

        int first = 0;
        int last = array1.length - 1;

        while (first < last){
            int temp = array1[first];
            array1[first] = array1[last];
            array1[last] = temp;
            first ++ ;
            last -- ;
        }
        for (int num:array1){
            System.out.println(num);
        }


//        6.Write a Java program to find the maximum element in an array.
        int [] array2 = {80,699,899,833,60,4888};
        int temproraryNum = 0;
        for (int i=0; i<array2.length; i++){
            if(array2[i] > temproraryNum){
                temproraryNum = array2[i];
            }
        }
        System.out.println("temproraryNum Num --------- "+temproraryNum);



        // 7.Write a Java program to find whether an array is sorted or not.
        boolean isSorted = true;
        for (int i =0; i<array2.length; i++){
            if(array2[i] > array2[i+1]){
                isSorted =false;
                break;

        }
        if(isSorted){
            System.out.println("Array is sorted!");
        }else{
            System.out.println("Array is not sorted!");
        }

    }
}