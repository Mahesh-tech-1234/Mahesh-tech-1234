import java.util.Scanner;
class Armst1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int r;
int x=num;
int res=0;
while (x>0)
{
r = x % 10;
res=res+r*r*r;
x=x/10;
}
if(res == num)
System.out.println(num + " is an Armstrong number.");
else
System.out.println(num + " is not an Armstrong number.");
}
}