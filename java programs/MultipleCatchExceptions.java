//multiple catch exceptions
class MultipleCatchExceptions{
public static void main(String[] args){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e){
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException Occurs");
}
catch(Exception e){
System.out.println("parent exception occurs");
}
System.out.println("The rest of the code");
}
}