import java.util.Scanner;

public class CP263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int val=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                val =sc.nextInt();
                if(val==1)
                {
                    a=i;
                    b=j;
                    break;
                }
            }

        }
        int cnt=0;
        if(a<3)
        {
            cnt=cnt+(3-a);
        }
        else
        {
            cnt=cnt+(a-3);
        }
        if(b<3)
        {
            cnt=cnt+(3-b);
        }
        else
        {
            cnt=cnt+(b-3);
        }
        System.out.println(cnt);
    }
}
