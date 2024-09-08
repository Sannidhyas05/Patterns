import java.util.Scanner;

public class Number {
    public static void pattern(int row)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                if(j%2==0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i);
                }
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
