// importing the packages;
import java.util.*;
public class Guess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Random randnum=new Random();
         int randomNum=randnum.nextInt(101);    //generating random numer from 1 to 200;
         int attempts=4;
         System.out.println("WELCOME TO NUMBER GUESSING GAME..\nU HAVE ONLY 5 ATTEMPTS TO GUESS THE NUMBER");
        for(;attempts>=0;attempts--){
            System.out.println("Guess a number: ");
            if(attempts>=0){
                System.out.println("only "+(attempts+1)+" attempts Left");}
            int guess=sc.nextInt(); //asking user to guess a number;
                if(guess>randomNum){  
                    System.out.println("you're guess is too high!");
            }
                else if(guess<randomNum){
                System.out.println("you're guess is Too low!");
            }
                else{
                System.out.println("Congratulations you're guess is correct !");
                break;
            }
            if(guess!=randomNum&&attempts==0){
                     //if user unable to guess a number printing the answer:
                    System.out.println("Oops! no more attempts left. the correct number is:"+randomNum); 
                }
               
            }
            }
            }
        
