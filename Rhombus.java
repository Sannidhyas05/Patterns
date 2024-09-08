import java.util.Scanner;

public class Rhombus {
    public static void solid(int row)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        solid(row);
    }
}
