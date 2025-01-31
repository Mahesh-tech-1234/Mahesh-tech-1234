import java.util.Scanner;
class demo
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int x=num;
int r;
int res=0;
while(x>0)
{
r=x%10;
res=res*10+r;
x=x/10;
}
if(res==num)
{
System.out.println("The given number is a palindrome");
}
else
{
System.out.println("The given number is not  a palindrome");
}
}
}

