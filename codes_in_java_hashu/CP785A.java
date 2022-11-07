import java.util.Scanner;

public class CP785A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;
        while(n--!=0)
        {
            String s= sc.next();
            if(s.equals("Tetrahedron"))
            {
                sum = sum+4;
            }
            if(s.equals("Cube"))
            {
                sum = sum+6;
            }
            if(s.equals("Octahedron"))
            {
                sum = sum+8;
            }
            if(s.equals("Dodecahedron"))
            {
                sum = sum+12;
            }
            if(s.equals("Icosahedron"))
            {
                sum = sum+20;
            }
        }
        System.out.println(sum);
    }
}
