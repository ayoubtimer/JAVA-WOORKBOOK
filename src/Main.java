import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Rock Paper Scissors.");
        System.out.println("When I say'Shoot',choose rock,paper,or scissors");
        System.out.println("Are you ready ? print yes if you are.");
        String ready = scan.nextLine();
        if(ready.equals("yes")){
            System.out.println("\nGreat");
            System.out.println("Choose rock , paper , scissors ,shoot!.");
            String choice = scan.nextLine();
            String computerChoice = computeChoice();
            String result = result(choice , computerChoice);
            printResult(choice,computerChoice,result);
        }else {
            System.out.println("Darn ,some other time ... ");
        }

    }
    public static String computeChoice(){
        double randomNumber = Math.random() * 3 ; // 0 -> 2.9999
        int integer = (int) randomNumber; // 0 -> 2
        switch (integer){
            case 0 : return "rock";
            case 1 : return  "paper" ;
            case 2 : return  "scissors";
            default: return "";
        }
    }

    public static  String result( String yourChoice , String computerChoice){
        String result = "";
        if(yourChoice.equals("rock") && computerChoice.equals("paper")){
            result = " you win";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = " you lose";
        } else if (yourChoice.equals("scissors")&& computerChoice.equals("rock")){
            result = " you lose";
        } else if(yourChoice.equals("rock")&& computerChoice.equals("scissors")){
            result = " you win ";
        }else if(yourChoice.equals("paper")&& computerChoice.equals("scissors")){
            result = " you lose";
        }else if(yourChoice.equals("scissors")&& computerChoice.equals("paper")){
            result = " you win";
        }else if(yourChoice.equals(computerChoice)){
            result = "it's a tie";
        }
         else {
            System.out.println("INVALID CHOICE :( ");
            System.exit(0);
        }
        return result;
    }
    public static void printResult(String yourChoice , String computerChoice ,String result){
        System.out.println("\nYou choose\t" + yourChoice);
        System.out.println("\ncomputer choose\t" + computerChoice);
        System.out.println(result);
    }
}