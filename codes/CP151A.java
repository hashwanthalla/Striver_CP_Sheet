import java.util.Scanner;

public class CP151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int s1 = (k*l)/nl;
        int s2 = (c*d);
        int s3 = p/np;
        System.out.println(Math.min(s1,Math.min(s2,s3))/n);

    }
}
