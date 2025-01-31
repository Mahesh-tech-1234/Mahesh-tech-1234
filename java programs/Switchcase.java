import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Num1:");
int num1=sc.nextInt();
System.out.println("Operator (+,-,*,/,%):");
char op=sc.next().charAt(0);
System.out.println("Num2:");
int num2=sc.nextInt();
switch(op)
{
case '+':
int temp4=num1+num2;
System.out.println("Result: "+temp4);
break;
case '-':
int temp=num1-num2;
System.out.println("Result: "+temp);
break;
case '*':
int temp1=num1*num2;
System.out.println("Result: "+temp1);
break;
case '/':
float temp2=num1/num2;
System.out.println("Result: "+temp2);
break;
case '%':
int temp3=num1%num2;
System.out.println("Result: "+temp3);
break;
}
}
}
