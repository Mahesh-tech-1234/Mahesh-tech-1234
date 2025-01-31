23.Write a java program to find largest of given two numbers
import java.util.Scanner;
class Largestnumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number");
int num1=sc.nextInt();
System.out.println("Enter your second number");
int num2=sc.nextInt();
int largest=num1>num2 ? num1:num2;
System.out.println("The largest number is:"+largest);
sc.close();
}
}

