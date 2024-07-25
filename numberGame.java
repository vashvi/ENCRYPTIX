import java.util.Random;
import java.util.Scanner;

public class numberGame {
    static int play(){
        int number, count = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(0,100);
        System.out.println("Guess the number in 10 attempts");
        for (int i = 1 ; i <= 10 ; i++){
            number = new Scanner(System.in).nextInt();
            if(number == randomNumber){
                System.out.println("Congractulations..! Your guess is correct.");
                return count;
            }
            if(number > randomNumber)
                System.out.println("The guess is too high. \nYou are left with "+(10-i)+" more attwmpts.");
            if (number < randomNumber)
                System.out.println("The guess is too low. \nYou are left with "+(10-i)+" more attwmpts.");
            if( i == 10)
                System.out.println("You Lose. \nBetter luck next time");
            count-=1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int score = 0, total = 0;
        int curr;
        boolean choice;
        do{
            curr =play();
            score+=curr;
            total+=10;
            System.out.println("Your score is " +curr+ " out of 10.");
            System.out.println("Do you want to play again? (yes/no)");
            String str= new Scanner(System.in).nextLine();
            if(str.equalsIgnoreCase("yes"))
                choice = true;
            else
                choice = false;
        }while(choice);
        System.out.println("Thank you for playing..!\nYour final score is "+score+" out of "+total);
    }
}
