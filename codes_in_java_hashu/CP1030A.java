import java.util.Scanner;

public class CP1030A {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b =false;
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            if(a==1)
            {
                b = true;
            }
        }
        if(b==false)
        {
            System.out.println("EASY");
        }
        else
        {
            System.out.println("HARD");
        }
    }

}
