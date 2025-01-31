import java.util.*;
class Hashtableww{
public static void main(String [] args){
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(1,"CSE");
hm.put(2,"CS");
hm.put(3,"EEE");
hm.put(4,"ECE");
System.out.println(hm);
System.out.println(hm.get(2));
hm.remove(3);
System.out.println(hm);
}
}
