import java.util.*;
public class string_palindrome {
        public static void main(String[] args) {
            int count=0;
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            for(int i=0;i<str.length()/2;i++)
            {
                if(str.charAt(i)==str.charAt(str.length()-i-1))
                {
                        count=1;
                }
                else{
                    count=0;
                }
            }
            System.out.println(count);
        }
}
