public class MultipleCatchBlock{
public static void main(String [] args){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e){
System.out.println("Arithmetic Exception Occur");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBounds error");
}
catch(Exception e){
System.out.println("Parent execution error occur");
}
System.out.println("hjk");
}
}