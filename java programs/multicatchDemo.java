import java.util.*;
class multiple{
public static void main(String [] args){
try{
String x;
x=args[0];
System.out.println(x.charAt(3));
}
catch(NullPointerException e){
System.out.println("NullpointerException");
}
catch(StringIndexOutOfBoundsexception e){
System.out.println("String");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array");
}
}
}

