import java.util.Scanner;
public class stringcompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        char[] chars=str.toCharArray();
        int j=0;
        for(int i=0;i<chars.length;)
        {
           int count =0;
            char m=chars[i];
            while(i<chars.length && chars[i]==m  )
            {
                ++count;
                ++i;
            }
            chars[j++]=m;
            if(count>1)
            {
                for(final char c: String.valueOf(count).toCharArray())
                {
                    chars[j++]=c;
                }
            }
        }

       for(int i=0;i<chars.length;i++)
{
        System.out.print(chars[i]);
    }
    }
}
