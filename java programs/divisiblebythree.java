30.Write a java program to print numbers divisible by three between 3 and 12.
class DivisibleByThree{
public static void main(String[] args){
int start=3;
int end=12;
System.out.println("The numbers that are divisible by 3 and 12");
for(int i=start;i<=end;i++){
if(i%3==0){
System.out.println(i);
}
}
}
}