import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int num=sc.nextInt();
int x=num;
int r;
int res=0;
while (x>0)
 {
 r = x % 10;
 res=res*10+r;
 x=x/10;
 }
System.out.println("Reversed number: "+res);
 }
}