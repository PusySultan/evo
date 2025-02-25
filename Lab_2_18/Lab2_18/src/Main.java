import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String name = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Computer: Привет, как тебя зовут? ");
        System.out.print("You: ");

        name = sc.next();
        System.out.println("Computer: Привет, " + name + "!!!");
        sc.close();
    }
}