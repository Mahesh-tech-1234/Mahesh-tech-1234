22.Write a java program to find square of given number
import java.util.Scanner;
class square{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int squarenumbers=num*num;
System.out.println("The Square of the number is:"+squarenumbers);
sc.close();
}
}
