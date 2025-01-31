import java.util.Scanner;
class interfaceinterf
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int p=0;
for(int i=0;i<num;i++)
{
if(num%2==0)
{
p++;
}
}
if(p==0)
{
System.out.println("It is a prime number");
}
else
{
System.out.println("It is a not prime number");
}
}
}