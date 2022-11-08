import java.util.Scanner;

public class CP136A {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] r = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int a =sc.nextInt();
            r[a]=i;
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(r[i]+" ");
        }
    }
}
