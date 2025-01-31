interface interf
{
void run();
void disp();
}
class interflmp implements interf
{
public void run()
{
System.out.println("The run method implemented");
}
public void disp()
{
System.out.println("The disp method implemented");
}
public static void main(String [] args)
{
interflmp ob=new interflmp();
ob.run();
ob.disp();
}
}