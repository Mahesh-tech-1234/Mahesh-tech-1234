import java.util.Scanner;
class TestException{
public static void main(String [] args){
try{
int data=25/5;
System.out.println("The result is:"+data);
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("The code should be executed");
}
System.out.println("The rest of the code");
}
}