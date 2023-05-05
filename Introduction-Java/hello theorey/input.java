class Input{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        // int type input
        int num = scn.nexInt();
        
        // String input
        String name = scn.nextLine();

        float price = scn.nextFloat();



        // output or printing output statment
        System.out.print("helllo world");

        System.out.println("hello world");

        // we can format using printf
        int num2 = 10;
        String name = "abhishek";
        System.out.printf("the number is %d and name is %s",num2,name);

    }
}