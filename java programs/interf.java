interface interf
{
void run();
void disp();
}
class interflmp implements interf
{
public void run()
{
System.out.println("The Run method Implemented");
}
public void disp()
{
System.out.println("The disp method Implemented");
}
public static void main(String[] args)
{
interflmp ob=new interflmp();
ob.run();
ob.disp();
}
}