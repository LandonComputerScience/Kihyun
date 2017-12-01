public class learningJava
{
    public static void main(String args[])
    {
        double material = 0.00;
        int months = 0;
        while(material < 95.00)
        {
            material = material + (100 - material) * 0.1;
            months++;
        }
        int years;
        years = months / 12;
        int excessmonths;
        excessmonths = months - (years * 12);
        System.out.println("Kevin will be ready for his exam in " + years + " years and " + excessmonths + " months." );
    }
}
