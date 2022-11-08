import java.util.Scanner;

public class CP116A {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            int a =sc.nextInt();
            int b= sc.nextInt();
            r=r-a;
            r=r+b;
            if(r>max)
            {
                max = r;
            }
        }
        System.out.println(max);

    }
}
