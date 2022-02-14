public class Main
{

    public static void main(String[] args)
    {
	int month = 15;
        System.out.println("Enter birth month (Integers 1-12): ");
        if (month >= 1 & month <= 12)
        {
            System.out.println("Your birth month is: " + month);
        }
        else
        {
            System.out.println("You entered an incorrect month value.");
        }
    }
}
