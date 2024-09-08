import java.util.Scanner;

public class Hollow_rect
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<b; j++)
            {
                if(i==0 || j==0 || i==(l-1) || j == (b-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}