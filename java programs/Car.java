class car{
String make,model;
int year;
public car(String make,String model,int year){
this.make=make;
this.model=model;
this.year=year;
}
public static void main(String [] args){
car mycar=new car("Astanmartin","DB12",2023);
System.out.println("CARDETAILS:"+mycar.make+mycar.model+mycar.year);
}
}