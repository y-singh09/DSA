import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev=" ";
        String str[]=s.split("\\s+");
        for(int i=0;i<str.length;i++)
        {
            rev=str[i]+" "+rev;
        }
        System.out.println(rev.trim());

    }
}
