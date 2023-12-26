import java.util.Scanner;
public class gcdofstrings{
    public static void main(String[] args) {
        
    
//      Scanner sc=new Scanner(System.in);
//    String str1=sc.nextLine();
//    String str2=sc.nextLine();
//     String x;
//     if(!(str1+str2).equals(str2+str1))
//     {
// System.out.println("");
//     }
//     int len=gcd(str1.length(),str2.length());
//     System.out.println(str1.substring(0,len));
//     }
//     private static int gcd(int a,int b)
// {
//     int rem;
//     rem=a%b;
//     while(rem!=0)
//     {
//         a=b;
//         b=rem;
//         rem=a%b;
//     }
//     return b;
// }

Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
if(!(str1+str2).equals(str2+str1))
{
    System.out.println(" hello");
}
int len=gcd(str1.length(),str2.length());
System.out.println(str1.substring(0,len));
}
public static int gcd(int a,int b)
{
    int rem;
    rem=a%b;
    while(rem!=0)
    {
        a=b;
        b=rem;
        rem=a%b;
    }
    return b;
}
}
