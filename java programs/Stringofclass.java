import java.util.Scanner;
class Stringofclass
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String x=sc.nextLine();
int a=x.length();
System.out.println("GivenString:"+x);
System.out.println("GivenString:"+x.charAt(0));
System.out.println("GivenString:"+a);
System.out.println("GivenString:"+x.toUpperCase());
System.out.println("GivenString:"+x.charAt(a-1));
}
}

