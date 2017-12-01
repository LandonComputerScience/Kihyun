import java.util.Scanner;
public class cents
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of money you have in cents:");
        int n = in.nextInt();
        int combinations = 0;
        for (int quarters = 0; quarters * 25 <= n; quarters++)
        {
            for (int dimes = 0; dimes * 10 <= n - quarters * 25; dimes++)
            {
                for (int nickels = 0; nickels * 5 <= n - quarters * 25 - dimes * 10; nickels++)
                {
                    for (int pennies = 0; pennies <= n - quarters * 25 - dimes * 10 - nickels * 5; pennies++)
                    {
                        if (quarters * 25 + dimes * 10 + nickels * 5 + pennies == n)
                        {

                            combinations++;
                            System.out.println("Combination " + combinations + ":" + " Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels + " Pennies: " + pennies);
                        }
                    }
                }
            }

        }
    }
}


