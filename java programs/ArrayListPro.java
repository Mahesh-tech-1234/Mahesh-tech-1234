import java.util.*;
class ArrayListDemo{
public static void main(String [] args){
ArrayList l=new ArrayList();
l.add(2023);
l.add("salaar");
l.add("Animal");
l.add("Dunki");
l.add("projectk");
l.add("OG");
System.out.println(l);
l.add(3,"pawan");
System.out.println(l);
l.remove(4);
System.out.println(l);
System.out.println(l.get(1));
System.out.println(l.size());
System.out.println(l.isEmpty());
System.out.println(l.indexOf("salaar"));
}
}