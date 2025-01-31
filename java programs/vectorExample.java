import java.util.*;
public class vectorExample{
public static void main(String [] args){
Vector vec=new Vector();
vec.add(1);
vec.add(2);
vec.add(3);
vec.add(4);
vec.add(5);
vec.addElement(6);
vec.addElement(7);
vec.addElement(8);
System.out.println(vec);
System.out.println(vec.capacity());
System.out.println(vec.firstElement());
System.out.println(vec.size());
System.out.println(vec.lastElement());
}
}