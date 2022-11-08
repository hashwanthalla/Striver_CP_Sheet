import java.util.Scanner;

public class CP110A {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        boolean b =true;
        long n =sc.nextLong();
        int cnt =0;
        while(n>0)
        {
            if(n%10!=4&&n%10!=7)
            {
                b =false;

            }
            else {
                cnt++;
            }
            n=n/10;
        }

            if(cnt==4||cnt==7) {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

    }
}
