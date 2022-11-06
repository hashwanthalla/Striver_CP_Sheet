import java.util.Scanner;

public class CP514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long re=0;
        long rev=0;
        int cnt=0;
        boolean br=true;
        while(n>0)
        {
            if(n%10==0&&br==true)
            {
                cnt++;
            }
            else
            {
                br=false;
            }

            re=n%10;
            rev = rev*10+re;
            n=n/10;
        }
        boolean b=false;
        long res =0;
        while(rev>0)
        {
            if(rev%10==9&&b==false)
            {

                res=res*10+re;


            }
            else
            {

                re=rev%10;
                if(rev%10>4)
                {
                    res = res*10+(9-re);
                }
                else
                {
                    res=res*10+re;
                }
            }
            b=true;
            rev=rev/10;
        }
        //	System.out.println(cnt);
        while(cnt>0)
        {
            res=res*10;
            cnt--;
        }
        System.out.println(res);
    }
}
