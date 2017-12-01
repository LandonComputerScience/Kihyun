import java.util.Scanner;
public class PopulationGrowth
{
    public static void main(String args[])
    {
        int i;
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the target population number in millions(as a double): ");
        double target = in.nextDouble();
        for (i = 2014; 123.8 * Math.pow(1.005, i - 2014) < target; i++)
        {

        }
        System.out.println("The target population " + target + " million will be reached/exceeded in " + i);
    }
}
