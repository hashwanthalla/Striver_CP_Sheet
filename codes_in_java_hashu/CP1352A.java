import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CP1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int q=1;
            List<Integer> l = new ArrayList<>();
            while(n>0)
            {
                if(n%10!=0)
                {
                    l.add((n%10)*q);
                }
                q=q*10;
                n=n/10;
            }
            System.out.println(l.size());
            for(int i=0;i<l.size();i++)
            {
                System.out.print(l.get(i)+" ");
            }
            System.out.println();
        }
    }
}
