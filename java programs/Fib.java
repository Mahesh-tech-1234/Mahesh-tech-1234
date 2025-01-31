import java.util.Scanner;
class Fib{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a=sc.nextInt();
int f=0,g=1;
for(int i=0;i<a;i++){
f=f+g;
g=f-g;
System.out.println("\n"+f);
}
}
}

