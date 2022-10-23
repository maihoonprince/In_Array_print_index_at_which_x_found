import java.util.*;

public class evenoroddnumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 2;

        if(b == 0)
        {
        System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
    
}
