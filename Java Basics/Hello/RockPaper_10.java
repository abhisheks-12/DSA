import java.util.Scanner;

public class RockPaper_10{
    public static void main(String[]args){
        int randomMove = (int)(Math.random()*3+1);
        String computerMove;

        if(randomMove == 1){
            computerMove = "rock";
        }else if(randomMove == 2){
            computerMove = "paper";
        }else{
            computerMove = "scissor";
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("Your options are:\n1)Rock\n2)Paper\n3)Scissor");
        System.out.print("Enter your move: ");
        String userMove = scn.nextLine();
        userMove = userMove.toLowerCase();


        if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor")){
                if(userMove.equals("rock") && computerMove.equals("paper")){
                    System.out.println("Computer Won "+"Your move : "+userMove + " Computer move :"+computerMove);
                }else if(userMove.equals("paper") && computerMove.equals("scissor")){
                    System.out.println("Computer Won "+"Your move : "+userMove + " Computer move :"+computerMove);
                }else if(userMove.equals("scissor") && computerMove.equals("rock")){
                    System.out.println("Computer Won "+"Your move : "+userMove + " Computer move :"+computerMove);
                }else if(userMove.equals(computerMove)){
                    System.out.println("Match Drawn "+"Your move :"+userMove + " Computer move :"+computerMove);
                }
                else{
                    System.out.println("Player won "+"Your move :"+userMove + " Computer move :"+computerMove);
                }
        }else{
            System.out.println("Please enter correct spelling");
        }

    }
}