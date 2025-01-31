import java.util.*;
class AgeException extends Exception{
public AgeException(String s){
super(s);
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x<=18){
try{
throw new AgeException("This is Age Exception");
}
catch(AgeException ex){
System.out.println(ex);
}
}
else{
System.out.println("You are eligible For vote");
}
}
}