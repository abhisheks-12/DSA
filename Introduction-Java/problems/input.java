class Input {
    public static void main(String[]args){


        /*
         input 
                5
                2.5
                6546854
                120
                geek for geeks
        */


        /*
            output ------
                
                5
                2.5
                6546854
                120
                geek for geeks


        */

        //  take input of different type

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nexInt();
        float n2 = scn.nextFloat();
        long views = scn.nextlong();
        byte num  = scn.nextByte();
        String str = scn.nextLine();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(views);
        System.out.println(num);
        System.out.println(str);

        //
    }
}