24.Write a java program to sum and difference of given two number
import java.util.Scanner;
class sumanddifference{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number");
int num1=sc.nextInt();
System.out.println("Enter your second number");
int num2=sc.nextInt();
int sum=num1+num2;
int difference=num1-num2;
System.out.println("The sum is:"+sum);
System.out.println("The difference is:"+difference);
sc.close();
}
}

