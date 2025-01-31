class NullPointerExceptionDemo{
public static void main(String[] args){
try{
String str=null;
int length=str.length();
}
catch(NullPointerException e){
System.out.println("Null pointer exception caught!");
}
}
}