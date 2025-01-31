import java.util.Scanner;
class primecheck
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int num=sc.nextInt();
int p=0;
for(int i=2;i<num; i++)
{
if(num%2==0)
{
p++;
}
}
if(p==0)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not Prime Number");
}
}
}