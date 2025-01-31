import java.util.*;
class Exception2{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
String y;
if(x.charAt(0)=='N'){
y=null;
}
else{
y=x;
}
try{
System.out.println(y.charAt(0));
}
catch(NullPointerException ex){
System.out.println("NullpointerException Occurs");
}
}
}