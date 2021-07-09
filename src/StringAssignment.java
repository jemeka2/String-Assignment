import java.util.Scanner;
import java.util.Random;

public class StringAssignment {
    public static void main(String[] args){
        //Variables
        String userName = "", personalMsg = "";
        Scanner kybd = new Scanner(System.in);
        Random randomizer = new Random();
        int randNum = randomizer.nextInt(4);

        //Prompt
        System.out.print("Enter your name: ");
        userName =  kybd.nextLine();

        switch(randNum){
            case 0:
                personalMsg = "I hope you are having a wonderful day! " + userName;
                break;
            case 1:
                personalMsg = "You are looking good today! " + userName;
                break;
            case 2:
                personalMsg = "Hey " + userName + " you got games on your phone?";
                break;
            case 3:
                personalMsg = userName + " don't forget to walk your dog.";
                break;
            case 4:
                personalMsg = userName + " I think you should go back to sleep and skip work.";
                break;
        }
        System.out.println(personalMsg);
        System.out.println("Program Done!");

    }
}
