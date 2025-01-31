import java.util.*;
class threadDemo extends Thread{
public static  void main(String [] args){
for(int i=0;i<=5;i++){
System.out.println("I am main thread");
}
threadDemo thread=new threadDemo();
thread.start();
}
public void run(){
for(int i=0;i<=5;i++){
System.out.print("\nI am child thread");
}
}
}
