import java.util.Scanner;

public class Butterfly {
    public static void pattern(int row)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(row-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(row-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        pattern(row);
    }
}
