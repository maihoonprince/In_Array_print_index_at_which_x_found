import java.util.*;

public class ifelseadvance 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 2;

        if((b > 0)|| (a >= 6 && a <= 20))
        {
        System.out.println("Weird");
        }
        else
        {

                System.out.println("not Weired");

        }
    }
}
