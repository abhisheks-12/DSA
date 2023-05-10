class DataTypes {
    public static void main(String[]args){
        System.out.println("Welcome to game");

        System.out.println("Choose your move either 1) rock 2) paper 3) Sissior");

        Scanner scn = new Scanner(System.in);


        System.out.print("Enter the move : ");

        String userMove = scn.nexInt();

        if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("Sissor")){
            System.out.println("hello world");
        }

    }
}