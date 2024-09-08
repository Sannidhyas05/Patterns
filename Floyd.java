import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int num = 0;
        for(int i=0; i<row; i++)
        {
            for(int j=1; j<=i+1; j++)
            {
                System.out.print(++num + " ");
            }
            System.out.println();
        }
    }
}
