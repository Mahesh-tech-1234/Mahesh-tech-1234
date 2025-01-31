class ArrDemo
{
public static void main(String[] args)
{
String arr[]={"Nani","Varun","Sri","Sai","Teja","Sam"};
for(int i=0;i<arr.length;i++)
{
String temp=arr[i];
if(temp.charAt(0)=='S')
{
System.out.println(arr[i]);
}
}
}
}