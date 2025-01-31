import java.util.*;
class Exception{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try{
double c=a/b;
System.out.println(c);
}
catch(ArithmeticException e){
System.out.println("ArithmeticException error Occurs");
}
finally{
System.out.println("All Ok");
}
}
}