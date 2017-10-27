import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vacation planner!");
        System.out.print("What is your name?"); //asks your name
        String name = input.next();
        System.out.println("Hello " + name + " nice to meet you where are you travelling to?");
        String location = input.next();
        System.out.println("great!" + location + " sounds like a great trip.");
        System.out.println("how many days are you going to spend travelling?");
        int count= input.nextInt();
        System.out.println("how much money are you planning to spend?");
        int money= input.nextInt();
        System.out.println("ok lets have a great trip! of " + count + " days"+ " please send your contact number so that we can contact about further details");
        
        
    }
}
