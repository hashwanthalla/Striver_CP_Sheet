import java.util.Scanner;

public class CP723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min =0;
        int max =0;
        if(a<b&&a<c)
        {
            min =a;
        }
        if(b<a&&b<c)
        {
            min =b;
        }
        if(c<a&&c<b)
        {
            min =c;
        }
        if(a>b&&a>c)
        {
            max =a;
        }
        if(b>a&&b>c)
        {
            max =b;
        }
        if(c>a&&c>b)
        {
            max = c;
        }
        System.out.println(max-min);
    }
}
