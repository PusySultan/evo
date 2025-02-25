import java.util.Scanner;

public class Reader
{
    private static int counter = 1;

    public static int SetValue(int value)
    {
        boolean erroFlag = false;

        Scanner sc = new Scanner(System.in);

       do
       {
           try
           {
               System.out.print("Enter " + counter + " value: ");
               value = sc.nextInt();

               erroFlag = false;
           }
           catch (Exception ex)
           {
               System.out.println( " error : " + ex.getMessage());
               sc.next();

               erroFlag = true;
           }

       } while (erroFlag);

        counter++;
        return value;
    }

    public static void ConsoleOutput(int a, int b ,int c)
    {
        double res = (double) a / (double) b;

        System.out.println("\nOutput: ");
        DivideBy5(a, b, c);
        System.out.println("Dividng a by b = " + a / b + " whole value");
        System.out.println("Dividng a by b = " + res + " fractional value");
        System.out.println("Dividng a by b = " + (int) Math.ceil(res) + " rounding up");
        System.out.println("Dividng a by b = " + (int) Math.floor(res) + " rounding down");
        System.out.println("Dividng a by b = " + (int) Math.round(res) + " rounding math");
        System.out.println("Remains of dividing b by c  = " + b % c);
        System.out.println("Min value of " + a + " and " + b + " = " + Math.min(a, b));
        System.out.println("Max value of " + b + " and " + c + " = " + Math.max(b, c));
    }

    private static void DivideBy5(int a, int b ,int c)
    {
        boolean flag = false;

        if(a % 5 == 0)
        {
            System.out.println("a = " + a);
            flag = true;
        }

        if(b % 5 == 0)
        {
            System.out.println("b = " + b);
            flag = true;
        }

        if(c % 5 == 0)
        {
            System.out.println("c = " + c);
            flag = true;
        }

        if(!flag)
        {
            System.out.println("There are no multiples of 5");
        }


    }
}
