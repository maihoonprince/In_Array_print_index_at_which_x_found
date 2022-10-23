import java.util.*;

public class functions 
{
    public static float calculateSub(float a, float b)
    {
        float substraction=a-b;
        return substraction;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float substraction = calculateSub(a,b);
        System.out.println("substraction of two numbers is :"+substraction);
    }
    
}