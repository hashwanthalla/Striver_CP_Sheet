import java.util.Scanner;

public class CP282A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int cnt =0;
            while(n--!=0)
            {
                String s = sc.next();
                if(s.charAt(1)=='+')
                {
                    cnt++;
                }
                else
                {
                    cnt--;
                }
            }
            System.out.println(cnt);
        }


}
