25.Write a java program to print even number between 6 and 26
class even{
public static void main(String[] args){
int start=6;
int end=26;
System.out.println("The numbers that are divisible by 6  and 26");
for(int i=start;i<=end;i++){
if(i%2==0){
System.out.println(i);
}
}
}
}