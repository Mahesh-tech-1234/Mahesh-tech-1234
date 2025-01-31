21.Write a java program to find cube of given number
import java.util.Scanner;
class cube{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int cubenumbers=num*num*num;
System.out.println("The Square of the number is:"+cubenumbers);
sc.close();
}
}




import java.util.Scanner;
class Fib{
public static void main(String args[])
{
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int f=0,g=1;
for(int i=0;i<a;i++)
{
System.out.print("\n"+f);
f=f+g;
g=f-g;
}
}
}