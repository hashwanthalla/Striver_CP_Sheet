import java.util.Scanner;

public class CP144A {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int maxi = 0;int mini = 0;
        int min = 101;
        int [] a = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
           if(a[i]>max)
           {
               max =a[i];
               maxi=i;
           }
           if(a[i]<=min)
           {
               min = a[i];
               mini=i;
           }
        }
        if(mini==maxi)
        {
            System.out.println(0);
        }
        else if(maxi>mini)
        {
            System.out.println((maxi-1)+(n-mini)-1);
        }
        else
        {
            System.out.println((maxi-1)+(n-mini));
        }
    }
}
