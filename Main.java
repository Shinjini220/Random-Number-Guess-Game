import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int usernumber=0;
            int mynumber=(int)(Math.random()*100);
            System.out.println("-------------Welcome to the random number guessing game!!------------");
            System.out.println("Rules");
            System.out.println("1.Your guess should be a number between 1 to 100");
            System.out.println("2.Inorder to exit the game enter any negative number");
            System.out.println(" ");
        System.out.println("Let's begin!!");
        System.out.println(" ");
           do
            {
                System.out.println("enter your guess:");
                usernumber=sc.nextInt();
                if(usernumber==mynumber){
                    System.out.println("You got the correct answer!!");
                    break;
                }
                else if(usernumber>100)
                    System.out.println("Number is greater than 100.Please enter a number between 1 to 100");
                else if (usernumber< mynumber && usernumber>0)
                    System.out.println("Your number is too small.Try again!!");
                else if(usernumber<mynumber && usernumber<0){
                    System.out.println("Exit game!");
                    break;
                }
                else
                    System.out.println("Your number is too large.Try again!!");
            } while(usernumber>0);
        System.out.println("Original number was  "+mynumber);
        }
    }
